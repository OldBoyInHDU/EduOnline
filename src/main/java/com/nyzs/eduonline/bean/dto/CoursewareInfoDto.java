package com.nyzs.eduonline.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：课件实体类
 * @date ：2022/9/1 13:22
 */
public class CoursewareInfoDto {
    private int id;
    private String coursewareName;
    private String storagePath;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date uploadDate;

    @Override
    public String toString() {
        return "CoursewareInfoDto{" +
                "id=" + id +
                ", coursewareName='" + coursewareName + '\'' +
                ", storagePath='" + storagePath + '\'' +
                ", uploadDate=" + uploadDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursewareName() {
        return coursewareName;
    }

    public void setCoursewareName(String coursewareName) {
        this.coursewareName = coursewareName;
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

    public CoursewareInfoDto(String coursewareName, String storagePath) {
        this.coursewareName = coursewareName;
        this.storagePath = storagePath;
    }
}
