package com.github.limboc.tsing.data.bean;

/**
 * Created by Chen on 2016/6/24.
 */
public class Music {

    /**
     * bitrate : 160000
     * playTime : 213864
     * dfsId : 6037418348311743
     * sr : 44100
     * volumeDelta : -2.65076E-4
     * name : Moon Without The Stars
     * id : 46689711
     * size : 4300608
     * extension : mp3
     */

    private int bitrate;
    private int playTime;
    private long dfsId;
    private int sr;
    private double volumeDelta;
    private String name;
    private int id;
    private int size;
    private String extension;

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public long getDfsId() {
        return dfsId;
    }

    public void setDfsId(long dfsId) {
        this.dfsId = dfsId;
    }

    public int getSr() {
        return sr;
    }

    public void setSr(int sr) {
        this.sr = sr;
    }

    public double getVolumeDelta() {
        return volumeDelta;
    }

    public void setVolumeDelta(double volumeDelta) {
        this.volumeDelta = volumeDelta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
