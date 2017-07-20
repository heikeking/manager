package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Chargeitemtype {
    private Integer id;
    private String name;
    private String remark;
    private Integer settingType;
    private Integer chargeItemCategoryId;

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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "SettingType")
    public Integer getSettingType() {
        return settingType;
    }

    public void setSettingType(Integer settingType) {
        this.settingType = settingType;
    }

    @Basic
    @Column(name = "ChargeItemCategoryId")
    public Integer getChargeItemCategoryId() {
        return chargeItemCategoryId;
    }

    public void setChargeItemCategoryId(Integer chargeItemCategoryId) {
        this.chargeItemCategoryId = chargeItemCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chargeitemtype that = (Chargeitemtype) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (settingType != null ? !settingType.equals(that.settingType) : that.settingType != null) return false;
        if (chargeItemCategoryId != null ? !chargeItemCategoryId.equals(that.chargeItemCategoryId) : that.chargeItemCategoryId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (settingType != null ? settingType.hashCode() : 0);
        result = 31 * result + (chargeItemCategoryId != null ? chargeItemCategoryId.hashCode() : 0);
        return result;
    }
}
