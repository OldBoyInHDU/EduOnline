package com.nyzs.eduonline.bean.dto;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/1 12:52
 */
public class VideoFileInfoDto {
    private int id;
    private String videoFileName;
    private String unit;
    private String position;
    private String storagePath;
    private Date uploadDate;

    @Override
    public String toString() {
        return "VideoFileInfoDto{" +
                "id=" + id +
                ", videoFileName='" + videoFileName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", storagePath='" + storagePath + '\'' +
                ", uploadDate=" + uploadDate +
                '}';
    }

    public VideoFileInfoDto(int id, String videoFileName, String unit, String position, String storagePath, Date uploadDate) {
        this.id = id;
        this.videoFileName = videoFileName;
        this.unit = unit;
        this.position = position;
        this.storagePath = storagePath;
        this.uploadDate = uploadDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
