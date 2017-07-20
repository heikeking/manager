package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Paymentmethoditem {
    private Integer id;
    private Integer paymentId;
    private Integer paidMethod;
    private Double amount;
    private String remark;
    private Integer sourceAccountId;
    private Integer targetAccountId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PaymentId")
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "PaidMethod")
    public Integer getPaidMethod() {
        return paidMethod;
    }

    public void setPaidMethod(Integer paidMethod) {
        this.paidMethod = paidMethod;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "SourceAccountId")
    public Integer getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(Integer sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    @Basic
    @Column(name = "TargetAccountId")
    public Integer getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(Integer targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paymentmethoditem that = (Paymentmethoditem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (paidMethod != null ? !paidMethod.equals(that.paidMethod) : that.paidMethod != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (sourceAccountId != null ? !sourceAccountId.equals(that.sourceAccountId) : that.sourceAccountId != null)
            return false;
        if (targetAccountId != null ? !targetAccountId.equals(that.targetAccountId) : that.targetAccountId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (paidMethod != null ? paidMethod.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (sourceAccountId != null ? sourceAccountId.hashCode() : 0);
        result = 31 * result + (targetAccountId != null ? targetAccountId.hashCode() : 0);
        return result;
    }
}
