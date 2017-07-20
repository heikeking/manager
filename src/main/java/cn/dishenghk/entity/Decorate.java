package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Decorate {
    private Integer id;
    private Integer houseId;
    private String checkStatus;
    private String checkDescription;
    private Double deductMoney;
    private String remark;
    private Timestamp startDate;
    private Timestamp expectEndDate;
    private Timestamp endDate;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HouseId")
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "CheckStatus")
    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Basic
    @Column(name = "CheckDescription")
    public String getCheckDescription() {
        return checkDescription;
    }

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
    }

    @Basic
    @Column(name = "DeductMoney")
    public Double getDeductMoney() {
        return deductMoney;
    }

    public void setDeductMoney(Double deductMoney) {
        this.deductMoney = deductMoney;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "StartDate")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "ExpectEndDate")
    public Timestamp getExpectEndDate() {
        return expectEndDate;
    }

    public void setExpectEndDate(Timestamp expectEndDate) {
        this.expectEndDate = expectEndDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Decorate decorate = (Decorate) o;

        if (id != null ? !id.equals(decorate.id) : decorate.id != null) return false;
        if (houseId != null ? !houseId.equals(decorate.houseId) : decorate.houseId != null) return false;
        if (checkStatus != null ? !checkStatus.equals(decorate.checkStatus) : decorate.checkStatus != null)
            return false;
        if (checkDescription != null ? !checkDescription.equals(decorate.checkDescription) : decorate.checkDescription != null)
            return false;
        if (deductMoney != null ? !deductMoney.equals(decorate.deductMoney) : decorate.deductMoney != null)
            return false;
        if (remark != null ? !remark.equals(decorate.remark) : decorate.remark != null) return false;
        if (startDate != null ? !startDate.equals(decorate.startDate) : decorate.startDate != null) return false;
        if (expectEndDate != null ? !expectEndDate.equals(decorate.expectEndDate) : decorate.expectEndDate != null)
            return false;
        if (endDate != null ? !endDate.equals(decorate.endDate) : decorate.endDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        result = 31 * result + (checkStatus != null ? checkStatus.hashCode() : 0);
        result = 31 * result + (checkDescription != null ? checkDescription.hashCode() : 0);
        result = 31 * result + (deductMoney != null ? deductMoney.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (expectEndDate != null ? expectEndDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }
}
