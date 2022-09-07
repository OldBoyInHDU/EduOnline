package com.nyzs.eduonline.bean.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/9/7 9:30
 */
public class PageInfoDto {
    private int id;
    private String unit;
    private String position;
    private String posResponsibility;
    private String workManualAddr;
    private String socManualAddr;
    private String toturialVideoAddr;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date lastUpdateDate;

    public PageInfoDto(String unit, String position, String posResponsibility, String workManualAddr, String socManualAddr, String toturialVideoAddr) {
        this.unit = unit;
        this.position = position;
        this.posResponsibility = posResponsibility;
        this.workManualAddr = workManualAddr;
        this.socManualAddr = socManualAddr;
        this.toturialVideoAddr = toturialVideoAddr;
    }

    @Override
    public String toString() {
        return "PageInfoDto{" +
                "id=" + id +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", posResponsibility='" + posResponsibility + '\'' +
                ", workManualAddr='" + workManualAddr + '\'' +
                ", socManualAddr='" + socManualAddr + '\'' +
                ", toturialVideoAddr='" + toturialVideoAddr + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
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

    public String getWorkManualAddr() {
        return workManualAddr;
    }

    public void setWorkManualAddr(String workManualAddr) {
        this.workManualAddr = workManualAddr;
    }

    public String getSocManualAddr() {
        return socManualAddr;
    }

    public void setSocManualAddr(String socManualAddr) {
        this.socManualAddr = socManualAddr;
    }

    public String getToturialVideoAddr() {
        return toturialVideoAddr;
    }

    public void setToturialVideoAddr(String toturialVideoAddr) {
        this.toturialVideoAddr = toturialVideoAddr;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
