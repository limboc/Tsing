package com.github.limboc.tsing.api;

import com.github.limboc.tsing.data.SongDetail;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Chen on 2016/6/23.
 */
public interface TsingApi {

    @GET("api/song/detail/")
    Observable<SongDetail> getSongDetail(
            @Query("id") int id,
            @Query("ids") String ids);
}
