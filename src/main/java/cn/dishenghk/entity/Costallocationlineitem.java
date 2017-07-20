package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Costallocationlineitem {
    private Integer id;
    private Integer costAllocationId;
    private Double amount;
    private Integer organizationItemId;
    private Integer customerId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CostAllocationId")
    public Integer getCostAllocationId() {
        return costAllocationId;
    }

    public void setCostAllocationId(Integer costAllocationId) {
        this.costAllocationId = costAllocationId;
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
    @Column(name = "OrganizationItemId")
    public Integer getOrganizationItemId() {
        return organizationItemId;
    }

    public void setOrganizationItemId(Integer organizationItemId) {
        this.organizationItemId = organizationItemId;
    }

    @Basic
    @Column(name = "CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Costallocationlineitem that = (Costallocationlineitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (costAllocationId != null ? !costAllocationId.equals(that.costAllocationId) : that.costAllocationId != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (organizationItemId != null ? !organizationItemId.equals(that.organizationItemId) : that.organizationItemId != null)
            return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (costAllocationId != null ? costAllocationId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        return result;
    }
}
