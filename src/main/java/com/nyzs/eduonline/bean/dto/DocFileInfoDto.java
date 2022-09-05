package com.nyzs.eduonline.bean.dto;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：文档管理列表
 * @date ：2022/9/1 10:14
 */
public class DocFileInfoDto {
    private int id;
    private String docFileName;
    private String docFileType;
    private String unit;
    private String position;
    private String storagePath;
    private Date uploadDate;

    @Override
    public String toString() {
        return "DocFileInfoDto{" +
                "id=" + id +
                ", docFileName='" + docFileName + '\'' +
                ", docFileType='" + docFileType + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", storagePath='" + storagePath + '\'' +
                ", uploadDate=" + uploadDate +
                '}';
    }

    public DocFileInfoDto(String docFileName, String docFileType, String unit, String position, String storagePath) {
        this.docFileName = docFileName;
        this.docFileType = docFileType;
        this.unit = unit;
        this.position = position;
        this.storagePath = storagePath;
        this.uploadDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocFileName() {
        return docFileName;
    }

    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }

    public String getDocFileType() {
        return docFileType;
    }

    public void setDocFileType(String docFileType) {
        this.docFileType = docFileType;
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
