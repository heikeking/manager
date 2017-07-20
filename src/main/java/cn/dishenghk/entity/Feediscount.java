package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Feediscount {
    private Integer id;
    private Integer houseId;
    private Integer chargeItemId;
    private Double discountRate;
    private Timestamp startDate;
    private Timestamp endDate;
    private String remark;
    private Integer feeDiscountOption;
    private Double reductionAmount;

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
    @Column(name = "ChargeItemId")
    public Integer getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(Integer chargeItemId) {
        this.chargeItemId = chargeItemId;
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

    @Basic
    @Column(name = "FeeDiscountOption")
    public Integer getFeeDiscountOption() {
        return feeDiscountOption;
    }

    public void setFeeDiscountOption(Integer feeDiscountOption) {
        this.feeDiscountOption = feeDiscountOption;
    }

    @Basic
    @Column(name = "ReductionAmount")
    public Double getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(Double reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feediscount that = (Feediscount) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;
        if (chargeItemId != null ? !chargeItemId.equals(that.chargeItemId) : that.chargeItemId != null) return false;
        if (discountRate != null ? !discountRate.equals(that.discountRate) : that.discountRate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (feeDiscountOption != null ? !feeDiscountOption.equals(that.feeDiscountOption) : that.feeDiscountOption != null)
            return false;
        if (reductionAmount != null ? !reductionAmount.equals(that.reductionAmount) : that.reductionAmount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        result = 31 * result + (chargeItemId != null ? chargeItemId.hashCode() : 0);
        result = 31 * result + (discountRate != null ? discountRate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (feeDiscountOption != null ? feeDiscountOption.hashCode() : 0);
        result = 31 * result + (reductionAmount != null ? reductionAmount.hashCode() : 0);
        return result;
    }
}
