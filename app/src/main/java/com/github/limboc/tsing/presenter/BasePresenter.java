package com.github.limboc.tsing.presenter;


import com.github.limboc.tsing.api.ApiException;
import com.github.limboc.tsing.api.TsingApi;
import com.github.limboc.tsing.api.TsingFactory;
import com.github.limboc.tsing.data.SimpleResult;
import com.github.limboc.tsing.presenter.iview.IBaseView;
import com.github.limboc.tsing.utils.RxManager;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


public class BasePresenter<T extends IBaseView> implements IPresenter<T> {

    private T mView;
    public TsingApi mDataManager;
    public RxManager rxManager;

    @Override
    public void attachView(T mvpView) {
        this.mView = mvpView;
        this.mDataManager = TsingFactory.getTsingIOSingleton();
        this.rxManager = new RxManager();
    }

    @Override
    public void detachView() {
        this.mView = null;
        this.mDataManager = null;
        this.rxManager.clear();
    }

    public boolean isViewAttached() {
        return mView != null;
    }

    public T getView() {
        return mView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public void post(Object tag, Object content) {
        rxManager.post(tag, content);
    }

    public void on(String eventName, Action1<Object> action1) {
        rxManager.on(eventName, action1);
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }

    public <T> void toSubscribe(Observable<T> o, Subscriber<T> s){
        o.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s);
    }

    public class HttpResultFunc<T> implements Func1<SimpleResult<T>, T> {

        @Override
        public T call(SimpleResult<T> simpleResult) {
            if (simpleResult.getCode() != 200) {
                throw new ApiException(simpleResult.getMessage());
            }
            return simpleResult.getResult();
        }
    }

    public void handleError(Throwable throwable){
        throwable.printStackTrace();
        getView().handleThrowable(throwable);
    }
}
