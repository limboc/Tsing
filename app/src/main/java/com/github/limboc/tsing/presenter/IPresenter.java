package com.github.limboc.tsing.presenter;
import com.github.limboc.tsing.presenter.iview.IBaseView;


public interface IPresenter<V extends IBaseView> {

    void attachView(V mvpView);
    void detachView();
}
