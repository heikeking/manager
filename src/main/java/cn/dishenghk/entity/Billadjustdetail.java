package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Billadjustdetail {
    private Integer id;
    private Integer operatorId;
    private Timestamp date;
    private Double beforeAdjustAmount;
    private Double afterAdjustAmount;
    private Integer billId;
    private String description;
    private Integer billAdjustType;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "OperatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "Date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "BeforeAdjustAmount")
    public Double getBeforeAdjustAmount() {
        return beforeAdjustAmount;
    }

    public void setBeforeAdjustAmount(Double beforeAdjustAmount) {
        this.beforeAdjustAmount = beforeAdjustAmount;
    }

    @Basic
    @Column(name = "AfterAdjustAmount")
    public Double getAfterAdjustAmount() {
        return afterAdjustAmount;
    }

    public void setAfterAdjustAmount(Double afterAdjustAmount) {
        this.afterAdjustAmount = afterAdjustAmount;
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
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "BillAdjustType")
    public Integer getBillAdjustType() {
        return billAdjustType;
    }

    public void setBillAdjustType(Integer billAdjustType) {
        this.billAdjustType = billAdjustType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Billadjustdetail that = (Billadjustdetail) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (operatorId != null ? !operatorId.equals(that.operatorId) : that.operatorId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (beforeAdjustAmount != null ? !beforeAdjustAmount.equals(that.beforeAdjustAmount) : that.beforeAdjustAmount != null)
            return false;
        if (afterAdjustAmount != null ? !afterAdjustAmount.equals(that.afterAdjustAmount) : that.afterAdjustAmount != null)
            return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (billAdjustType != null ? !billAdjustType.equals(that.billAdjustType) : that.billAdjustType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (beforeAdjustAmount != null ? beforeAdjustAmount.hashCode() : 0);
        result = 31 * result + (afterAdjustAmount != null ? afterAdjustAmount.hashCode() : 0);
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (billAdjustType != null ? billAdjustType.hashCode() : 0);
        return result;
    }
}
