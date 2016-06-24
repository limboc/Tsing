package com.github.limboc.tsing.ui.activity;

import android.os.Bundle;
import android.widget.TextView;
import com.github.limboc.tsing.R;
import com.github.limboc.tsing.data.bean.Song;
import com.github.limboc.tsing.presenter.SongPresenter;
import com.github.limboc.tsing.presenter.iview.ISongView;
import com.github.limboc.tsing.ui.widget.MultipleStatusView;
import com.github.limboc.tsing.utils.NetworkUtils;

import butterknife.Bind;

public class MainActivity extends BasePresenterActivity<SongPresenter> implements ISongView {


    @Bind(R.id.multipleStatusView)
    MultipleStatusView multipleStatusView;
    @Bind(R.id.tv_content)
    TextView tvContent;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle saveInstanceState) {

    }

    @Override
    protected void initData() {
        multipleStatusView.setOnRetryClickListener(l-> refresh());
        refresh();
    }

    private void refresh(){
        if(!NetworkUtils.isConnected(context)){
            multipleStatusView.showNoNetwork();
        }else{
            multipleStatusView.showLoading();
            presenter.loadData(28377211, "[28377211]");
        }
    }

    @Override
    public void onLoadDataSuccess(Song song) {
        multipleStatusView.showContent();
        tvContent.setText(song.getName() + song.getMp3Url());
    }

    @Override
    public void handleThrowable(Throwable throwable) {
        super.handleThrowable(throwable);
        multipleStatusView.showError();
    }

}
