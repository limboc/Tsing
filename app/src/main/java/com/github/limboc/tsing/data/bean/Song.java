package com.github.limboc.tsing.data.bean;

import java.util.List;

/**
 * Created by Chen on 2016/6/24.
 */
public class Song {

    /**
     * starred : false
     * popularity : 100
     * starredNum : 0
     * playedNum : 0
     * dayPlays : 0
     * hearTime : 0
     * mp3Url : null
     * rtUrls : []
     * crbt : null
     * bMusic : null
     * rtUrl : null
     * commentThreadId : R_SO_4_28377211
     * copyFrom :
     * hMusic : null
     * mMusic : null
     * lMusic : null
     * alias : []
     * album : {"songs":[],"paid":false,"onSale":false,"tags":"","blurPicUrl":"http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg","companyId":0,"pic":6046214441318535,"commentThreadId":"R_AL_3_2774288","picUrl":"http://p3.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg","company":"雷亚游戏","picId":6046214441318535,"alias":[],"artist":{"img1v1Id":0,"picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","trans":"","picId":0,"musicSize":0,"alias":[],"albumSize":0,"img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","name":"","id":0},"publishTime":1384272000007,"copyrightId":0,"briefDesc":"","artists":[{"img1v1Id":0,"picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","trans":"","picId":0,"musicSize":0,"alias":[],"albumSize":0,"img1v1Url":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","name":"群星","id":122455}],"status":3,"description":"","name":"古树旋律 Deemo","id":2774288,"type":"专辑","size":111}
     * score : 100
     * mvid : 0
     * fee : 0
     * ftype : 0
     * rtype : 0
     * rurl : null
     * copyrightId : 0
     * artists : [{"img1v1Id":0,"picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","trans":"","picId":0,"musicSize":0,"alias":[],"albumSize":0,"img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","name":"Quiana","id":194643},{"img1v1Id":0,"picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","trans":"","picId":0,"musicSize":0,"alias":[],"albumSize":0,"img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","name":"Jerry Barnes","id":0}]
     * status : -1
     * position : 14
     * duration : 0
     * no : 15
     * disc : 2
     * audition : null
     * ringtone :
     * name : Moon Without The Stars
     * id : 28377211
     */

    private boolean starred;
    private int popularity;
    private int starredNum;
    private int playedNum;
    private int dayPlays;
    private int hearTime;
    private String mp3Url;
    private Object crbt;
    private Object bMusic;
    private Object rtUrl;
    private String commentThreadId;
    private String copyFrom;
    private Music hMusic;
    private Music mMusic;
    private Music lMusic;
    private int score;
    private int mvid;
    private int fee;
    private int ftype;
    private int rtype;
    private Object rurl;
    private int copyrightId;
    private int status;
    private int position;
    private int duration;
    private int no;
    private String disc;
    private Object audition;
    private String ringtone;
    private String name;
    private int id;
    private List<Artist> artists;
    private Album album;

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getStarredNum() {
        return starredNum;
    }

    public void setStarredNum(int starredNum) {
        this.starredNum = starredNum;
    }

    public int getPlayedNum() {
        return playedNum;
    }

    public void setPlayedNum(int playedNum) {
        this.playedNum = playedNum;
    }

    public int getDayPlays() {
        return dayPlays;
    }

    public void setDayPlays(int dayPlays) {
        this.dayPlays = dayPlays;
    }

    public int getHearTime() {
        return hearTime;
    }

    public void setHearTime(int hearTime) {
        this.hearTime = hearTime;
    }

    public String getMp3Url() {
        return mp3Url;
    }

    public void setMp3Url(String mp3Url) {
        this.mp3Url = mp3Url;
    }

    public Object getCrbt() {
        return crbt;
    }

    public void setCrbt(Object crbt) {
        this.crbt = crbt;
    }

    public Object getBMusic() {
        return bMusic;
    }

    public void setBMusic(Object bMusic) {
        this.bMusic = bMusic;
    }

    public Object getRtUrl() {
        return rtUrl;
    }

    public void setRtUrl(Object rtUrl) {
        this.rtUrl = rtUrl;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public String getCopyFrom() {
        return copyFrom;
    }

    public void setCopyFrom(String copyFrom) {
        this.copyFrom = copyFrom;
    }

    public Music getHMusic() {
        return hMusic;
    }

    public void setHMusic(Music hMusic) {
        this.hMusic = hMusic;
    }

    public Music getMMusic() {
        return mMusic;
    }

    public void setMMusic(Music mMusic) {
        this.mMusic = mMusic;
    }

    public Music getLMusic() {
        return lMusic;
    }

    public void setLMusic(Music lMusic) {
        this.lMusic = lMusic;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMvid() {
        return mvid;
    }

    public void setMvid(int mvid) {
        this.mvid = mvid;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getFtype() {
        return ftype;
    }

    public void setFtype(int ftype) {
        this.ftype = ftype;
    }

    public int getRtype() {
        return rtype;
    }

    public void setRtype(int rtype) {
        this.rtype = rtype;
    }

    public Object getRurl() {
        return rurl;
    }

    public void setRurl(Object rurl) {
        this.rurl = rurl;
    }

    public int getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public Object getAudition() {
        return audition;
    }

    public void setAudition(Object audition) {
        this.audition = audition;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
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

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
