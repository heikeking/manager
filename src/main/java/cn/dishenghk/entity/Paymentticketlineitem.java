package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Paymentticketlineitem {
    private Integer id;
    private Integer paymentTicketId;
    private Integer paymentLineItemId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "PaymentLineItemId")
    public Integer getPaymentLineItemId() {
        return paymentLineItemId;
    }

    public void setPaymentLineItemId(Integer paymentLineItemId) {
        this.paymentLineItemId = paymentLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paymentticketlineitem that = (Paymentticketlineitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paymentTicketId != null ? !paymentTicketId.equals(that.paymentTicketId) : that.paymentTicketId != null)
            return false;
        if (paymentLineItemId != null ? !paymentLineItemId.equals(that.paymentLineItemId) : that.paymentLineItemId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paymentTicketId != null ? paymentTicketId.hashCode() : 0);
        result = 31 * result + (paymentLineItemId != null ? paymentLineItemId.hashCode() : 0);
        return result;
    }
}
