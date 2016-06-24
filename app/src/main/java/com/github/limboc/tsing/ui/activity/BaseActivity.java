package com.github.limboc.tsing.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.limboc.tsing.App;
import com.github.limboc.tsing.utils.T;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(getLayoutId());
        context = this;
        App.getInstance().addActivity(this);
        ButterKnife.bind(this);
        initView(savedInstanceState);
        initData();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getInstance().removeActivity(this);
    }

    protected abstract int getLayoutId();

    protected abstract void initView(Bundle saveInstanceState);

    protected abstract void initData();

    long lastTime;
    public void exitApp() {
        if (System.currentTimeMillis() - lastTime > 2000) {
            T.showShort("再按一次退出.");
            lastTime = System.currentTimeMillis();
        } else {
            exit();
        }
    }

    public void exit(){
        System.exit(0);
        android.os.Process.killProcess(android.os.Process.myPid());
    }

}
