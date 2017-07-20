package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Inventory {
    private Integer id;
    private Integer materialId;
    private Integer number;
    private Double costPrice;
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
    @Column(name = "MaterialId")
    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Basic
    @Column(name = "Number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "CostPrice")
    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
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

        Inventory inventory = (Inventory) o;

        if (id != null ? !id.equals(inventory.id) : inventory.id != null) return false;
        if (materialId != null ? !materialId.equals(inventory.materialId) : inventory.materialId != null) return false;
        if (number != null ? !number.equals(inventory.number) : inventory.number != null) return false;
        if (costPrice != null ? !costPrice.equals(inventory.costPrice) : inventory.costPrice != null) return false;
        if (amount != null ? !amount.equals(inventory.amount) : inventory.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (costPrice != null ? costPrice.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
