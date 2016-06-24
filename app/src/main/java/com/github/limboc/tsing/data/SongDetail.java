package com.github.limboc.tsing.data;

import com.github.limboc.tsing.data.bean.Song;

import java.util.List;

/**
 * Created by Chen on 2016/6/24.
 */
public class SongDetail extends SimpleResult{

    private List<Song> songs;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
