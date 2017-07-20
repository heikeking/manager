package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Housemeterreading {
    private Integer id;
    private Integer year;
    private Integer month;
    private Integer houseMeterId;
    private Double meterData;
    private Double amount;
    private String status;
    private String remarks;
    private Double lastReadData;
    private Timestamp lastReadDate;
    private Integer lastReadId;
    private Timestamp currentReadDate;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "Month")
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Basic
    @Column(name = "HouseMeterId")
    public Integer getHouseMeterId() {
        return houseMeterId;
    }

    public void setHouseMeterId(Integer houseMeterId) {
        this.houseMeterId = houseMeterId;
    }

    @Basic
    @Column(name = "MeterData")
    public Double getMeterData() {
        return meterData;
    }

    public void setMeterData(Double meterData) {
        this.meterData = meterData;
    }

    @Basic
    @Column(name = "Amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "LastReadData")
    public Double getLastReadData() {
        return lastReadData;
    }

    public void setLastReadData(Double lastReadData) {
        this.lastReadData = lastReadData;
    }

    @Basic
    @Column(name = "LastReadDate")
    public Timestamp getLastReadDate() {
        return lastReadDate;
    }

    public void setLastReadDate(Timestamp lastReadDate) {
        this.lastReadDate = lastReadDate;
    }

    @Basic
    @Column(name = "LastReadId")
    public Integer getLastReadId() {
        return lastReadId;
    }

    public void setLastReadId(Integer lastReadId) {
        this.lastReadId = lastReadId;
    }

    @Basic
    @Column(name = "CurrentReadDate")
    public Timestamp getCurrentReadDate() {
        return currentReadDate;
    }

    public void setCurrentReadDate(Timestamp currentReadDate) {
        this.currentReadDate = currentReadDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Housemeterreading that = (Housemeterreading) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (houseMeterId != null ? !houseMeterId.equals(that.houseMeterId) : that.houseMeterId != null) return false;
        if (meterData != null ? !meterData.equals(that.meterData) : that.meterData != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (lastReadData != null ? !lastReadData.equals(that.lastReadData) : that.lastReadData != null) return false;
        if (lastReadDate != null ? !lastReadDate.equals(that.lastReadDate) : that.lastReadDate != null) return false;
        if (lastReadId != null ? !lastReadId.equals(that.lastReadId) : that.lastReadId != null) return false;
        if (currentReadDate != null ? !currentReadDate.equals(that.currentReadDate) : that.currentReadDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (houseMeterId != null ? houseMeterId.hashCode() : 0);
        result = 31 * result + (meterData != null ? meterData.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (lastReadData != null ? lastReadData.hashCode() : 0);
        result = 31 * result + (lastReadDate != null ? lastReadDate.hashCode() : 0);
        result = 31 * result + (lastReadId != null ? lastReadId.hashCode() : 0);
        result = 31 * result + (currentReadDate != null ? currentReadDate.hashCode() : 0);
        return result;
    }
}
