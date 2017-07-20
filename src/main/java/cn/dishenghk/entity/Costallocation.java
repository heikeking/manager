package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Costallocation {
    private Integer id;
    private Integer regionId;
    private Double totalAmount;
    private Integer chargeItemId;
    private Integer allocationType;
    private Timestamp startDate;
    private Timestamp endDate;
    private Integer status;
    private Timestamp createDate;
    private Integer createBy;
    private Timestamp allocationDate;
    private Integer allocationBy;
    private Integer range;
    private String remark;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RegionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "TotalAmount")
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "ChargeItemId")
    public Integer getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(Integer chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    @Basic
    @Column(name = "AllocationType")
    public Integer getAllocationType() {
        return allocationType;
    }

    public void setAllocationType(Integer allocationType) {
        this.allocationType = allocationType;
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
    @Column(name = "EndDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "CreateDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "CreateBy")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "AllocationDate")
    public Timestamp getAllocationDate() {
        return allocationDate;
    }

    public void setAllocationDate(Timestamp allocationDate) {
        this.allocationDate = allocationDate;
    }

    @Basic
    @Column(name = "AllocationBy")
    public Integer getAllocationBy() {
        return allocationBy;
    }

    public void setAllocationBy(Integer allocationBy) {
        this.allocationBy = allocationBy;
    }

    @Basic
    @Column(name = "Range")
    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Costallocation that = (Costallocation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (totalAmount != null ? !totalAmount.equals(that.totalAmount) : that.totalAmount != null) return false;
        if (chargeItemId != null ? !chargeItemId.equals(that.chargeItemId) : that.chargeItemId != null) return false;
        if (allocationType != null ? !allocationType.equals(that.allocationType) : that.allocationType != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (allocationDate != null ? !allocationDate.equals(that.allocationDate) : that.allocationDate != null)
            return false;
        if (allocationBy != null ? !allocationBy.equals(that.allocationBy) : that.allocationBy != null) return false;
        if (range != null ? !range.equals(that.range) : that.range != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (totalAmount != null ? totalAmount.hashCode() : 0);
        result = 31 * result + (chargeItemId != null ? chargeItemId.hashCode() : 0);
        result = 31 * result + (allocationType != null ? allocationType.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (allocationDate != null ? allocationDate.hashCode() : 0);
        result = 31 * result + (allocationBy != null ? allocationBy.hashCode() : 0);
        result = 31 * result + (range != null ? range.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
