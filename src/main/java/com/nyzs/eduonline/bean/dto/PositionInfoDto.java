package com.nyzs.eduonline.bean.dto;

/**
 * @author ：RukiHuang
 * @description：岗位查询info
 * @date ：2022/9/13 7:57
 */
public class PositionInfoDto {
    private String unit;
    private String value;
    private String label;

    @Override
    public String toString() {
        return "PositionInfoDto{" +
                "unit='" + unit + '\'' +
                ", value='" + value + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public PositionInfoDto(String unit, String value, String label) {
        this.unit = unit;
        this.value = value;
        this.label = label;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
