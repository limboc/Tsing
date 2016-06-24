package com.github.limboc.tsing.data.bean;

/**
 * Created by Chen on 2016/6/24.
 */
public class Album {

    /**
     * songs : []
     * paid : false
     * onSale : false
     * artists : [{"img1v1Id":0,"musicSize":0,"picId":0,"briefDesc":"","albumSize":0,"img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","picUrl":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","trans":"","alias":[],"name":"群星","id":122455}]
     * copyrightId : 0
     * company : 雷亚游戏
     * picId : 6046214441318535
     * briefDesc :
     * artist : {"img1v1Id":0,"musicSize":0,"picId":0,"briefDesc":"","albumSize":0,"img1v1Url":"http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","picUrl":"http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","trans":"","alias":[],"name":"","id":0}
     * publishTime : 1384272000007
     * commentThreadId : R_AL_3_2774288
     * picUrl : http://p3.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg
     * status : 3
     * alias : []
     * tags :
     * description :
     * blurPicUrl : http://p4.music.126.net/LH7PtVBMt02PbphpyAiNmw==/6046214441318535.jpg
     * companyId : 0
     * pic : 6046214441318535
     * name : 古树旋律 Deemo
     * id : 2774288
     * type : 专辑
     * size : 111
     */

    private boolean paid;
    private boolean onSale;
    private int copyrightId;
    private String company;
    private long picId;
    private String briefDesc;
    private long publishTime;
    private String commentThreadId;
    private String picUrl;
    private int status;
    private String tags;
    private String description;
    private String blurPicUrl;
    private int companyId;
    private long pic;
    private String name;
    private int id;
    private String type;
    private int size;

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public int getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getPicId() {
        return picId;
    }

    public void setPicId(long picId) {
        this.picId = picId;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public String getCommentThreadId() {
        return commentThreadId;
    }

    public void setCommentThreadId(String commentThreadId) {
        this.commentThreadId = commentThreadId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlurPicUrl() {
        return blurPicUrl;
    }

    public void setBlurPicUrl(String blurPicUrl) {
        this.blurPicUrl = blurPicUrl;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public long getPic() {
        return pic;
    }

    public void setPic(long pic) {
        this.pic = pic;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
