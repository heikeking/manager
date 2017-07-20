package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bankdisketteexportbill {
    private Integer id;
    private Integer bankDisketteExportLineId;
    private Integer billId;
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
    @Column(name = "BankDisketteExportLineId")
    public Integer getBankDisketteExportLineId() {
        return bankDisketteExportLineId;
    }

    public void setBankDisketteExportLineId(Integer bankDisketteExportLineId) {
        this.bankDisketteExportLineId = bankDisketteExportLineId;
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

        Bankdisketteexportbill that = (Bankdisketteexportbill) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bankDisketteExportLineId != null ? !bankDisketteExportLineId.equals(that.bankDisketteExportLineId) : that.bankDisketteExportLineId != null)
            return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bankDisketteExportLineId != null ? bankDisketteExportLineId.hashCode() : 0);
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
