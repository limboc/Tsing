package com.github.limboc.tsing.presenter.iview;

import com.github.limboc.tsing.data.bean.Song;

/**
 * Created by Chen on 2016/6/24.
 */
public interface ISongView extends IBaseView{

    void onLoadDataSuccess(Song song);
}
