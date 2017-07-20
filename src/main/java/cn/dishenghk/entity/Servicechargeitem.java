package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Servicechargeitem {
    private Integer id;
    private String name;
    private Integer calculationMethod;
    private Double calculationPrice;
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
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Servicechargeitem that = (Servicechargeitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (calculationMethod != null ? !calculationMethod.equals(that.calculationMethod) : that.calculationMethod != null)
            return false;
        if (calculationPrice != null ? !calculationPrice.equals(that.calculationPrice) : that.calculationPrice != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (calculationMethod != null ? calculationMethod.hashCode() : 0);
        result = 31 * result + (calculationPrice != null ? calculationPrice.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
