package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Refund {
    private Integer id;
    private Integer operatorId;
    private Timestamp refundDate;
    private Double amount;
    private String reason;
    private Integer targetAccountId;
    private Integer paymentId;

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
    @Column(name = "RefundDate")
    public Timestamp getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Timestamp refundDate) {
        this.refundDate = refundDate;
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
    @Column(name = "Reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "TargetAccountId")
    public Integer getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(Integer targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    @Basic
    @Column(name = "PaymentId")
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refund refund = (Refund) o;

        if (id != null ? !id.equals(refund.id) : refund.id != null) return false;
        if (operatorId != null ? !operatorId.equals(refund.operatorId) : refund.operatorId != null) return false;
        if (refundDate != null ? !refundDate.equals(refund.refundDate) : refund.refundDate != null) return false;
        if (amount != null ? !amount.equals(refund.amount) : refund.amount != null) return false;
        if (reason != null ? !reason.equals(refund.reason) : refund.reason != null) return false;
        if (targetAccountId != null ? !targetAccountId.equals(refund.targetAccountId) : refund.targetAccountId != null)
            return false;
        if (paymentId != null ? !paymentId.equals(refund.paymentId) : refund.paymentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (refundDate != null ? refundDate.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (targetAccountId != null ? targetAccountId.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        return result;
    }
}
