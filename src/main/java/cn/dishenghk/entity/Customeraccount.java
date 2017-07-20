package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Customeraccount {
    private Integer id;
    private Integer customerId;
    private Double balance;
    private Integer accountType;
    private Integer chargeItemTypeId;
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
    @Column(name = "CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
    @Column(name = "AccountType")
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "ChargeItemTypeId")
    public Integer getChargeItemTypeId() {
        return chargeItemTypeId;
    }

    public void setChargeItemTypeId(Integer chargeItemTypeId) {
        this.chargeItemTypeId = chargeItemTypeId;
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

        Customeraccount that = (Customeraccount) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (accountType != null ? !accountType.equals(that.accountType) : that.accountType != null) return false;
        if (chargeItemTypeId != null ? !chargeItemTypeId.equals(that.chargeItemTypeId) : that.chargeItemTypeId != null)
            return false;
        if (organizationItemId != null ? !organizationItemId.equals(that.organizationItemId) : that.organizationItemId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (accountType != null ? accountType.hashCode() : 0);
        result = 31 * result + (chargeItemTypeId != null ? chargeItemTypeId.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        return result;
    }
}
