package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bankdisketteimportpayment {
    private Integer id;
    private Integer bankDisketteImportLineId;
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
    @Column(name = "BankDisketteImportLineId")
    public Integer getBankDisketteImportLineId() {
        return bankDisketteImportLineId;
    }

    public void setBankDisketteImportLineId(Integer bankDisketteImportLineId) {
        this.bankDisketteImportLineId = bankDisketteImportLineId;
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

        Bankdisketteimportpayment that = (Bankdisketteimportpayment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bankDisketteImportLineId != null ? !bankDisketteImportLineId.equals(that.bankDisketteImportLineId) : that.bankDisketteImportLineId != null)
            return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bankDisketteImportLineId != null ? bankDisketteImportLineId.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        return result;
    }
}
