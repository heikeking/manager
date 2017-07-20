package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Latefeeset {
    private Integer id;
    private Integer lateChargeDays;
    private Double lateChargeRatio;
    private Integer startCalculation;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LateChargeDays")
    public Integer getLateChargeDays() {
        return lateChargeDays;
    }

    public void setLateChargeDays(Integer lateChargeDays) {
        this.lateChargeDays = lateChargeDays;
    }

    @Basic
    @Column(name = "LateChargeRatio")
    public Double getLateChargeRatio() {
        return lateChargeRatio;
    }

    public void setLateChargeRatio(Double lateChargeRatio) {
        this.lateChargeRatio = lateChargeRatio;
    }

    @Basic
    @Column(name = "StartCalculation")
    public Integer getStartCalculation() {
        return startCalculation;
    }

    public void setStartCalculation(Integer startCalculation) {
        this.startCalculation = startCalculation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Latefeeset that = (Latefeeset) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lateChargeDays != null ? !lateChargeDays.equals(that.lateChargeDays) : that.lateChargeDays != null)
            return false;
        if (lateChargeRatio != null ? !lateChargeRatio.equals(that.lateChargeRatio) : that.lateChargeRatio != null)
            return false;
        if (startCalculation != null ? !startCalculation.equals(that.startCalculation) : that.startCalculation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lateChargeDays != null ? lateChargeDays.hashCode() : 0);
        result = 31 * result + (lateChargeRatio != null ? lateChargeRatio.hashCode() : 0);
        result = 31 * result + (startCalculation != null ? startCalculation.hashCode() : 0);
        return result;
    }
}
