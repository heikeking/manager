package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Dispatchchargeitem {
    private Integer id;
    private Integer dispatchId;
    private Integer calculationMethod;
    private Double calculationPrice;
    private String remark;
    private Double laborHours;
    private Double amount;
    private String chargeItemName;
    private Integer chargeItemId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DispatchId")
    public Integer getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    @Basic
    @Column(name = "CalculationMethod")
    public Integer getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(Integer calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    @Basic
    @Column(name = "CalculationPrice")
    public Double getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(Double calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "LaborHours")
    public Double getLaborHours() {
        return laborHours;
    }

    public void setLaborHours(Double laborHours) {
        this.laborHours = laborHours;
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
    @Column(name = "ChargeItemName")
    public String getChargeItemName() {
        return chargeItemName;
    }

    public void setChargeItemName(String chargeItemName) {
        this.chargeItemName = chargeItemName;
    }

    @Basic
    @Column(name = "ChargeItemId")
    public Integer getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(Integer chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dispatchchargeitem that = (Dispatchchargeitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dispatchId != null ? !dispatchId.equals(that.dispatchId) : that.dispatchId != null) return false;
        if (calculationMethod != null ? !calculationMethod.equals(that.calculationMethod) : that.calculationMethod != null)
            return false;
        if (calculationPrice != null ? !calculationPrice.equals(that.calculationPrice) : that.calculationPrice != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (laborHours != null ? !laborHours.equals(that.laborHours) : that.laborHours != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (chargeItemName != null ? !chargeItemName.equals(that.chargeItemName) : that.chargeItemName != null)
            return false;
        if (chargeItemId != null ? !chargeItemId.equals(that.chargeItemId) : that.chargeItemId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dispatchId != null ? dispatchId.hashCode() : 0);
        result = 31 * result + (calculationMethod != null ? calculationMethod.hashCode() : 0);
        result = 31 * result + (calculationPrice != null ? calculationPrice.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (laborHours != null ? laborHours.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (chargeItemName != null ? chargeItemName.hashCode() : 0);
        result = 31 * result + (chargeItemId != null ? chargeItemId.hashCode() : 0);
        return result;
    }
}
