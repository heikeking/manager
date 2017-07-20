package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Billdiscount {
    private Integer id;
    private Integer billId;
    private Integer feeDiscountId;
    private Double amount;
    private Timestamp createDate;
    private Integer parkingPlaceDiscountId;
    private Integer pauseParkingPlaceId;
    private Double discountRate;
    private Timestamp startDate;
    private Timestamp endDate;
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
    @Column(name = "BillId")
    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "FeeDiscountId")
    public Integer getFeeDiscountId() {
        return feeDiscountId;
    }

    public void setFeeDiscountId(Integer feeDiscountId) {
        this.feeDiscountId = feeDiscountId;
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
    @Column(name = "CreateDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "ParkingPlaceDiscountId")
    public Integer getParkingPlaceDiscountId() {
        return parkingPlaceDiscountId;
    }

    public void setParkingPlaceDiscountId(Integer parkingPlaceDiscountId) {
        this.parkingPlaceDiscountId = parkingPlaceDiscountId;
    }

    @Basic
    @Column(name = "PauseParkingPlaceId")
    public Integer getPauseParkingPlaceId() {
        return pauseParkingPlaceId;
    }

    public void setPauseParkingPlaceId(Integer pauseParkingPlaceId) {
        this.pauseParkingPlaceId = pauseParkingPlaceId;
    }

    @Basic
    @Column(name = "DiscountRate")
    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
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

        Billdiscount that = (Billdiscount) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (feeDiscountId != null ? !feeDiscountId.equals(that.feeDiscountId) : that.feeDiscountId != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (parkingPlaceDiscountId != null ? !parkingPlaceDiscountId.equals(that.parkingPlaceDiscountId) : that.parkingPlaceDiscountId != null)
            return false;
        if (pauseParkingPlaceId != null ? !pauseParkingPlaceId.equals(that.pauseParkingPlaceId) : that.pauseParkingPlaceId != null)
            return false;
        if (discountRate != null ? !discountRate.equals(that.discountRate) : that.discountRate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (feeDiscountId != null ? feeDiscountId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (parkingPlaceDiscountId != null ? parkingPlaceDiscountId.hashCode() : 0);
        result = 31 * result + (pauseParkingPlaceId != null ? pauseParkingPlaceId.hashCode() : 0);
        result = 31 * result + (discountRate != null ? discountRate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
