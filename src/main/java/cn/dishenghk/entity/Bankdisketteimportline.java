package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bankdisketteimportline {
    private Integer id;
    private Integer bankDisketteImportId;
    private Integer customerId;
    private Integer bankId;
    private String bankAccount;
    private String bankAccountName;
    private Integer result;
    private String resultDescription;
    private Double amount;
    private Double commission;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BankDisketteImportId")
    public Integer getBankDisketteImportId() {
        return bankDisketteImportId;
    }

    public void setBankDisketteImportId(Integer bankDisketteImportId) {
        this.bankDisketteImportId = bankDisketteImportId;
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
    @Column(name = "Result")
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Basic
    @Column(name = "ResultDescription")
    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
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
    @Column(name = "Commission")
    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bankdisketteimportline that = (Bankdisketteimportline) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bankDisketteImportId != null ? !bankDisketteImportId.equals(that.bankDisketteImportId) : that.bankDisketteImportId != null)
            return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (bankId != null ? !bankId.equals(that.bankId) : that.bankId != null) return false;
        if (bankAccount != null ? !bankAccount.equals(that.bankAccount) : that.bankAccount != null) return false;
        if (bankAccountName != null ? !bankAccountName.equals(that.bankAccountName) : that.bankAccountName != null)
            return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (resultDescription != null ? !resultDescription.equals(that.resultDescription) : that.resultDescription != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (commission != null ? !commission.equals(that.commission) : that.commission != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id != null ? id.hashCode() : 0;
        result1 = 31 * result1 + (bankDisketteImportId != null ? bankDisketteImportId.hashCode() : 0);
        result1 = 31 * result1 + (customerId != null ? customerId.hashCode() : 0);
        result1 = 31 * result1 + (bankId != null ? bankId.hashCode() : 0);
        result1 = 31 * result1 + (bankAccount != null ? bankAccount.hashCode() : 0);
        result1 = 31 * result1 + (bankAccountName != null ? bankAccountName.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (resultDescription != null ? resultDescription.hashCode() : 0);
        result1 = 31 * result1 + (amount != null ? amount.hashCode() : 0);
        result1 = 31 * result1 + (commission != null ? commission.hashCode() : 0);
        return result1;
    }
}
