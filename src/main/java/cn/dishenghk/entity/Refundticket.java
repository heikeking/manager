package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Refundticket {
    private Integer id;
    private Integer refundId;
    private Integer paymentTicketId;
    private Double amount;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RefundId")
    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    @Basic
    @Column(name = "PaymentTicketId")
    public Integer getPaymentTicketId() {
        return paymentTicketId;
    }

    public void setPaymentTicketId(Integer paymentTicketId) {
        this.paymentTicketId = paymentTicketId;
    }

    @Basic
    @Column(name = "Amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refundticket that = (Refundticket) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (refundId != null ? !refundId.equals(that.refundId) : that.refundId != null) return false;
        if (paymentTicketId != null ? !paymentTicketId.equals(that.paymentTicketId) : that.paymentTicketId != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (refundId != null ? refundId.hashCode() : 0);
        result = 31 * result + (paymentTicketId != null ? paymentTicketId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
