package com.nyzs.eduonline.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：视频信息实体类
 * @date ：2022/9/1 12:52
 */
public class VideoFileInfoDto {
    private int id;
    private String videoFileName;
    private String unit;
    private String position;
    private String storagePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
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

    public VideoFileInfoDto(String videoFileName, String unit, String position, String storagePath) {
        this.videoFileName = videoFileName;
        this.unit = unit;
        this.position = position;
        this.storagePath = storagePath;
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
