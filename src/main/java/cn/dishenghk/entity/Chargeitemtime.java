package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Chargeitemtime {
    private Integer id;
    private Integer monthOffset;
    private Byte isLastDay;
    private Byte isByStart;
    private Integer dayOfMonth;
    private Byte isByCalcBeginDate;
    private String description;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MonthOffset")
    public Integer getMonthOffset() {
        return monthOffset;
    }

    public void setMonthOffset(Integer monthOffset) {
        this.monthOffset = monthOffset;
    }

    @Basic
    @Column(name = "IsLastDay")
    public Byte getIsLastDay() {
        return isLastDay;
    }

    public void setIsLastDay(Byte isLastDay) {
        this.isLastDay = isLastDay;
    }

    @Basic
    @Column(name = "IsByStart")
    public Byte getIsByStart() {
        return isByStart;
    }

    public void setIsByStart(Byte isByStart) {
        this.isByStart = isByStart;
    }

    @Basic
    @Column(name = "DayOfMonth")
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    @Basic
    @Column(name = "IsByCalcBeginDate")
    public Byte getIsByCalcBeginDate() {
        return isByCalcBeginDate;
    }

    public void setIsByCalcBeginDate(Byte isByCalcBeginDate) {
        this.isByCalcBeginDate = isByCalcBeginDate;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chargeitemtime that = (Chargeitemtime) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (monthOffset != null ? !monthOffset.equals(that.monthOffset) : that.monthOffset != null) return false;
        if (isLastDay != null ? !isLastDay.equals(that.isLastDay) : that.isLastDay != null) return false;
        if (isByStart != null ? !isByStart.equals(that.isByStart) : that.isByStart != null) return false;
        if (dayOfMonth != null ? !dayOfMonth.equals(that.dayOfMonth) : that.dayOfMonth != null) return false;
        if (isByCalcBeginDate != null ? !isByCalcBeginDate.equals(that.isByCalcBeginDate) : that.isByCalcBeginDate != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (monthOffset != null ? monthOffset.hashCode() : 0);
        result = 31 * result + (isLastDay != null ? isLastDay.hashCode() : 0);
        result = 31 * result + (isByStart != null ? isByStart.hashCode() : 0);
        result = 31 * result + (dayOfMonth != null ? dayOfMonth.hashCode() : 0);
        result = 31 * result + (isByCalcBeginDate != null ? isByCalcBeginDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
