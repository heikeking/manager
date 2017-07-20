package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Customerbankaccount {
    private Integer id;
    private String personId;
    private Integer customerId;
    private Integer bankId;
    private String bankAccount;
    private String bankAddress;
    private String bankAccountName;
    private Integer bankAccountType;
    private Byte isPrimary;
    private String description;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PersonId")
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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
    @Column(name = "BankAddress")
    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
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
    @Column(name = "BankAccountType")
    public Integer getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(Integer bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    @Basic
    @Column(name = "IsPrimary")
    public Byte getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Byte isPrimary) {
        this.isPrimary = isPrimary;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customerbankaccount that = (Customerbankaccount) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (bankId != null ? !bankId.equals(that.bankId) : that.bankId != null) return false;
        if (bankAccount != null ? !bankAccount.equals(that.bankAccount) : that.bankAccount != null) return false;
        if (bankAddress != null ? !bankAddress.equals(that.bankAddress) : that.bankAddress != null) return false;
        if (bankAccountName != null ? !bankAccountName.equals(that.bankAccountName) : that.bankAccountName != null)
            return false;
        if (bankAccountType != null ? !bankAccountType.equals(that.bankAccountType) : that.bankAccountType != null)
            return false;
        if (isPrimary != null ? !isPrimary.equals(that.isPrimary) : that.isPrimary != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (bankAddress != null ? bankAddress.hashCode() : 0);
        result = 31 * result + (bankAccountName != null ? bankAccountName.hashCode() : 0);
        result = 31 * result + (bankAccountType != null ? bankAccountType.hashCode() : 0);
        result = 31 * result + (isPrimary != null ? isPrimary.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
