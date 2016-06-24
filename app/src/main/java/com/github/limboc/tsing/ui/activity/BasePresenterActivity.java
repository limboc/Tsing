package com.github.limboc.tsing.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.limboc.tsing.R;
import com.github.limboc.tsing.presenter.BasePresenter;
import com.github.limboc.tsing.presenter.iview.IBaseView;
import com.github.limboc.tsing.utils.TUtil;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;

import rx.Observable;

/**
 * Created by Chen on 2016/6/14.
 */
public abstract class BasePresenterActivity<T extends BasePresenter> extends BaseActivity implements IBaseView {

    T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        presenter = TUtil.getT(this, 0);
        presenter.attachView(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }

    @Override
    public void handleThrowable(Throwable throwable) {
        if(throwable instanceof SocketException || throwable instanceof ConnectException
                || throwable instanceof UnknownHostException){
            com.github.limboc.tsing.utils.T.showShort(R.string.connet_time_out);
        }else{
            com.github.limboc.tsing.utils.T.showShort(throwable.getMessage());
        }

    }
}
