package com.github.limboc.tsing.presenter;

import com.github.limboc.tsing.api.ApiException;
import com.github.limboc.tsing.api.TsingFactory;
import com.github.limboc.tsing.data.SongDetail;
import com.github.limboc.tsing.data.bean.Song;
import com.github.limboc.tsing.presenter.iview.ISongView;

import java.util.List;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Chen on 2016/6/24.
 */
public class SongPresenter extends BasePresenter<ISongView>{

    public SongPresenter() {

    }

    public void loadData(int id, String ids){
        Subscription s = TsingFactory.getTsingIOSingleton()
                .getSongDetail(id, ids)
                .map(new HttpResultFuncd<>())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(song -> {
                    getView().onLoadDataSuccess(song);
                },throwable -> {
                    handleError(throwable);
                });
        rxManager.add(s);
    }

    private class HttpResultFuncd<T> implements Func1<SongDetail, Song> {

        @Override
        public Song call(SongDetail simpleResult) {
            int code = simpleResult.getCode();
            String message = simpleResult.getMessage();
            if (code != 200) {
                if(message != null){
                    throw new ApiException(message);
                }else{
                    throw new ApiException(code);
                }
            }
            List<Song> songList = simpleResult.getSongs();
            if(!songList.isEmpty()){
                return songList.get(0);
            }
            return null;
        }
    }
}
