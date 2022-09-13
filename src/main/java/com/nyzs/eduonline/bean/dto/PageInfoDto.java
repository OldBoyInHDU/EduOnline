package com.nyzs.eduonline.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：PageInfo
 * @date ：2022/9/7 9:30
 */
public class PageInfoDto {
    private int id;
    private String unit;
    private String position;

    private String posResponsibility;
    private String docFileName;
    private String docStoragePath;
    private String socFileName;
    private String socStoragePath;
    private String videoFileName;
    private String videoStoragePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date lastUpdateDate;

    @Override
    public String toString() {
        return "PageInfoDto{" +
                "id=" + id +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", posResponsibility='" + posResponsibility + '\'' +
                ", docFileName='" + docFileName + '\'' +
                ", docStoragePath='" + docStoragePath + '\'' +
                ", socFileName='" + socFileName + '\'' +
                ", socStoragePath='" + socStoragePath + '\'' +
                ", videoFileName='" + videoFileName + '\'' +
                ", videoStoragePath='" + videoStoragePath + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }

    public PageInfoDto(String unit, String position, String posResponsibility, String docFileName, String docStoragePath, String socFileName, String socStoragePath, String videoFileName, String videoStoragePath) {
        this.unit = unit;
        this.position = position;
        this.posResponsibility = posResponsibility;
        this.docFileName = docFileName;
        this.docStoragePath = docStoragePath;
        this.socFileName = socFileName;
        this.socStoragePath = socStoragePath;
        this.videoFileName = videoFileName;
        this.videoStoragePath = videoStoragePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPosResponsibility() {
        return posResponsibility;
    }

    public void setPosResponsibility(String posResponsibility) {
        this.posResponsibility = posResponsibility;
    }

    public String getDocFileName() {
        return docFileName;
    }

    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }

    public String getDocStoragePath() {
        return docStoragePath;
    }

    public void setDocStoragePath(String docStoragePath) {
        this.docStoragePath = docStoragePath;
    }

    public String getSocFileName() {
        return socFileName;
    }

    public void setSocFileName(String socFileName) {
        this.socFileName = socFileName;
    }

    public String getSocStoragePath() {
        return socStoragePath;
    }

    public void setSocStoragePath(String socStoragePath) {
        this.socStoragePath = socStoragePath;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    public String getVideoStoragePath() {
        return videoStoragePath;
    }

    public void setVideoStoragePath(String videoStoragePath) {
        this.videoStoragePath = videoStoragePath;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
