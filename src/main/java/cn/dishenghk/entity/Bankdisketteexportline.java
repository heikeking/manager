package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bankdisketteexportline {
    private Integer id;
    private Integer bankDisketteExportId;
    private Integer customerId;
    private Integer bankId;
    private String bankAccount;
    private String bankAccountName;
    private Double amount;
    private String bankAddress;
    private Integer organizationItemId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BankDisketteExportId")
    public Integer getBankDisketteExportId() {
        return bankDisketteExportId;
    }

    public void setBankDisketteExportId(Integer bankDisketteExportId) {
        this.bankDisketteExportId = bankDisketteExportId;
    }

    @Basic
    @Column(name = "CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "BankId")
    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    @Basic
    @Column(name = "BankAccount")
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Basic
    @Column(name = "BankAccountName")
    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
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
    @Column(name = "BankAddress")
    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    @Basic
    @Column(name = "OrganizationItemId")
    public Integer getOrganizationItemId() {
        return organizationItemId;
    }

    public void setOrganizationItemId(Integer organizationItemId) {
        this.organizationItemId = organizationItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bankdisketteexportline that = (Bankdisketteexportline) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bankDisketteExportId != null ? !bankDisketteExportId.equals(that.bankDisketteExportId) : that.bankDisketteExportId != null)
            return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (bankId != null ? !bankId.equals(that.bankId) : that.bankId != null) return false;
        if (bankAccount != null ? !bankAccount.equals(that.bankAccount) : that.bankAccount != null) return false;
        if (bankAccountName != null ? !bankAccountName.equals(that.bankAccountName) : that.bankAccountName != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (bankAddress != null ? !bankAddress.equals(that.bankAddress) : that.bankAddress != null) return false;
        if (organizationItemId != null ? !organizationItemId.equals(that.organizationItemId) : that.organizationItemId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bankDisketteExportId != null ? bankDisketteExportId.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (bankAccountName != null ? bankAccountName.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (bankAddress != null ? bankAddress.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        return result;
    }
}
