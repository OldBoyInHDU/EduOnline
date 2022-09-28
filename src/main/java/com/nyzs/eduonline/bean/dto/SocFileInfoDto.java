package com.nyzs.eduonline.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：文档管理列表
 * @date ：2022/9/1 10:14
 */
public class SocFileInfoDto {
    private int id;
    private String SocFileName;
//    private String docFileType;
    private String unit;
    private String position;
    private String storagePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date uploadDate;

    @Override
    public String toString() {
        return "SocFileInfoDto{" +
                "id=" + id +
                ", SocFileName='" + SocFileName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", storagePath='" + storagePath + '\'' +
                ", uploadDate=" + uploadDate +
                '}';
    }

    public SocFileInfoDto(String socFileName, String unit, String position, String storagePath) {
        SocFileName = socFileName;
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

    public String getSocFileName() {
        return SocFileName;
    }

    public void setSocFileName(String socFileName) {
        SocFileName = socFileName;
    }

//    public String getDocFileType() {
//        return docFileType;
//    }
//
//    public void setDocFileType(String docFileType) {
//        this.docFileType = docFileType;
//    }

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
