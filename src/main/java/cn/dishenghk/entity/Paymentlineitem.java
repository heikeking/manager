package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Paymentlineitem {
    private Integer id;
    private Integer paymentId;
    private Integer billId;
    private Double paid;
    private Double smallChange;
    private Integer paidMethod;
    private Integer paymentMethodItemId;
    private Double receivedAmount;

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
    @Column(name = "BillId")
    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "Paid")
    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    @Basic
    @Column(name = "SmallChange")
    public Double getSmallChange() {
        return smallChange;
    }

    public void setSmallChange(Double smallChange) {
        this.smallChange = smallChange;
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
    @Column(name = "PaymentMethodItemId")
    public Integer getPaymentMethodItemId() {
        return paymentMethodItemId;
    }

    public void setPaymentMethodItemId(Integer paymentMethodItemId) {
        this.paymentMethodItemId = paymentMethodItemId;
    }

    @Basic
    @Column(name = "ReceivedAmount")
    public Double getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paymentlineitem that = (Paymentlineitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (paid != null ? !paid.equals(that.paid) : that.paid != null) return false;
        if (smallChange != null ? !smallChange.equals(that.smallChange) : that.smallChange != null) return false;
        if (paidMethod != null ? !paidMethod.equals(that.paidMethod) : that.paidMethod != null) return false;
        if (paymentMethodItemId != null ? !paymentMethodItemId.equals(that.paymentMethodItemId) : that.paymentMethodItemId != null)
            return false;
        if (receivedAmount != null ? !receivedAmount.equals(that.receivedAmount) : that.receivedAmount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (paid != null ? paid.hashCode() : 0);
        result = 31 * result + (smallChange != null ? smallChange.hashCode() : 0);
        result = 31 * result + (paidMethod != null ? paidMethod.hashCode() : 0);
        result = 31 * result + (paymentMethodItemId != null ? paymentMethodItemId.hashCode() : 0);
        result = 31 * result + (receivedAmount != null ? receivedAmount.hashCode() : 0);
        return result;
    }
}
