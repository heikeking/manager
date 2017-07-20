package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Customersmallchangeaccountitem {
    private Integer id;
    private Integer customerSmallChangeAccountId;
    private Integer paymentId;
    private Double receivedAmount;
    private Double balance;
    private Double paidAmount;
    private Double incomeAmount;
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
    @Column(name = "CustomerSmallChangeAccountId")
    public Integer getCustomerSmallChangeAccountId() {
        return customerSmallChangeAccountId;
    }

    public void setCustomerSmallChangeAccountId(Integer customerSmallChangeAccountId) {
        this.customerSmallChangeAccountId = customerSmallChangeAccountId;
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
    @Column(name = "ReceivedAmount")
    public Double getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Double receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    @Basic
    @Column(name = "Balance")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "PaidAmount")
    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Basic
    @Column(name = "IncomeAmount")
    public Double getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Double incomeAmount) {
        this.incomeAmount = incomeAmount;
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

        Customersmallchangeaccountitem that = (Customersmallchangeaccountitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (customerSmallChangeAccountId != null ? !customerSmallChangeAccountId.equals(that.customerSmallChangeAccountId) : that.customerSmallChangeAccountId != null)
            return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (receivedAmount != null ? !receivedAmount.equals(that.receivedAmount) : that.receivedAmount != null)
            return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (paidAmount != null ? !paidAmount.equals(that.paidAmount) : that.paidAmount != null) return false;
        if (incomeAmount != null ? !incomeAmount.equals(that.incomeAmount) : that.incomeAmount != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customerSmallChangeAccountId != null ? customerSmallChangeAccountId.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (receivedAmount != null ? receivedAmount.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (paidAmount != null ? paidAmount.hashCode() : 0);
        result = 31 * result + (incomeAmount != null ? incomeAmount.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
