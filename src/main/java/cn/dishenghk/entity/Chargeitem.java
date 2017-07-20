package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Chargeitem {
    private Integer id;
    private String itemCategory;
    private String name;
    private String calculationMethod;
    private Double unitPrice;
    private String meteringMode;
    private Double money;
    private Integer chargeItemTypeId;
    private String chargingPeriod;
    private String customFormula;
    private Integer meterTypeId;
    private String remark;
    private Integer delayChargeDays;
    private Double delayChargeRatio;
    private String delayChargeCalculationMethod;
    private String startCalculation;
    private String chargingPeriodPrecision;
    private String defaultChargingPeriod;
    private Integer autoDiscountType;
    private Integer settingType;
    private Integer organizationItemId;
    private Byte isDelCorpCharge;
    private Byte isVacancyCharge;
    private Integer lateFeeSetId;
    private Integer chargeItemTimeId;
    private Double unitPrice1;
    private Double unitPrice2;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ItemCategory")
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
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
    public String getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    @Basic
    @Column(name = "UnitPrice")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "MeteringMode")
    public String getMeteringMode() {
        return meteringMode;
    }

    public void setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
    }

    @Basic
    @Column(name = "Money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
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
    @Column(name = "ChargingPeriod")
    public String getChargingPeriod() {
        return chargingPeriod;
    }

    public void setChargingPeriod(String chargingPeriod) {
        this.chargingPeriod = chargingPeriod;
    }

    @Basic
    @Column(name = "CustomFormula")
    public String getCustomFormula() {
        return customFormula;
    }

    public void setCustomFormula(String customFormula) {
        this.customFormula = customFormula;
    }

    @Basic
    @Column(name = "MeterTypeId")
    public Integer getMeterTypeId() {
        return meterTypeId;
    }

    public void setMeterTypeId(Integer meterTypeId) {
        this.meterTypeId = meterTypeId;
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
    @Column(name = "DelayChargeDays")
    public Integer getDelayChargeDays() {
        return delayChargeDays;
    }

    public void setDelayChargeDays(Integer delayChargeDays) {
        this.delayChargeDays = delayChargeDays;
    }

    @Basic
    @Column(name = "DelayChargeRatio")
    public Double getDelayChargeRatio() {
        return delayChargeRatio;
    }

    public void setDelayChargeRatio(Double delayChargeRatio) {
        this.delayChargeRatio = delayChargeRatio;
    }

    @Basic
    @Column(name = "DelayChargeCalculationMethod")
    public String getDelayChargeCalculationMethod() {
        return delayChargeCalculationMethod;
    }

    public void setDelayChargeCalculationMethod(String delayChargeCalculationMethod) {
        this.delayChargeCalculationMethod = delayChargeCalculationMethod;
    }

    @Basic
    @Column(name = "StartCalculation")
    public String getStartCalculation() {
        return startCalculation;
    }

    public void setStartCalculation(String startCalculation) {
        this.startCalculation = startCalculation;
    }

    @Basic
    @Column(name = "ChargingPeriodPrecision")
    public String getChargingPeriodPrecision() {
        return chargingPeriodPrecision;
    }

    public void setChargingPeriodPrecision(String chargingPeriodPrecision) {
        this.chargingPeriodPrecision = chargingPeriodPrecision;
    }

    @Basic
    @Column(name = "DefaultChargingPeriod")
    public String getDefaultChargingPeriod() {
        return defaultChargingPeriod;
    }

    public void setDefaultChargingPeriod(String defaultChargingPeriod) {
        this.defaultChargingPeriod = defaultChargingPeriod;
    }

    @Basic
    @Column(name = "AutoDiscountType")
    public Integer getAutoDiscountType() {
        return autoDiscountType;
    }

    public void setAutoDiscountType(Integer autoDiscountType) {
        this.autoDiscountType = autoDiscountType;
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
    @Column(name = "OrganizationItemId")
    public Integer getOrganizationItemId() {
        return organizationItemId;
    }

    public void setOrganizationItemId(Integer organizationItemId) {
        this.organizationItemId = organizationItemId;
    }

    @Basic
    @Column(name = "IsDelCorpCharge")
    public Byte getIsDelCorpCharge() {
        return isDelCorpCharge;
    }

    public void setIsDelCorpCharge(Byte isDelCorpCharge) {
        this.isDelCorpCharge = isDelCorpCharge;
    }

    @Basic
    @Column(name = "IsVacancyCharge")
    public Byte getIsVacancyCharge() {
        return isVacancyCharge;
    }

    public void setIsVacancyCharge(Byte isVacancyCharge) {
        this.isVacancyCharge = isVacancyCharge;
    }

    @Basic
    @Column(name = "LateFeeSetId")
    public Integer getLateFeeSetId() {
        return lateFeeSetId;
    }

    public void setLateFeeSetId(Integer lateFeeSetId) {
        this.lateFeeSetId = lateFeeSetId;
    }

    @Basic
    @Column(name = "ChargeItemTimeId")
    public Integer getChargeItemTimeId() {
        return chargeItemTimeId;
    }

    public void setChargeItemTimeId(Integer chargeItemTimeId) {
        this.chargeItemTimeId = chargeItemTimeId;
    }

    @Basic
    @Column(name = "UnitPrice1")
    public Double getUnitPrice1() {
        return unitPrice1;
    }

    public void setUnitPrice1(Double unitPrice1) {
        this.unitPrice1 = unitPrice1;
    }

    @Basic
    @Column(name = "UnitPrice2")
    public Double getUnitPrice2() {
        return unitPrice2;
    }

    public void setUnitPrice2(Double unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chargeitem that = (Chargeitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (itemCategory != null ? !itemCategory.equals(that.itemCategory) : that.itemCategory != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (calculationMethod != null ? !calculationMethod.equals(that.calculationMethod) : that.calculationMethod != null)
            return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (meteringMode != null ? !meteringMode.equals(that.meteringMode) : that.meteringMode != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (chargeItemTypeId != null ? !chargeItemTypeId.equals(that.chargeItemTypeId) : that.chargeItemTypeId != null)
            return false;
        if (chargingPeriod != null ? !chargingPeriod.equals(that.chargingPeriod) : that.chargingPeriod != null)
            return false;
        if (customFormula != null ? !customFormula.equals(that.customFormula) : that.customFormula != null)
            return false;
        if (meterTypeId != null ? !meterTypeId.equals(that.meterTypeId) : that.meterTypeId != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (delayChargeDays != null ? !delayChargeDays.equals(that.delayChargeDays) : that.delayChargeDays != null)
            return false;
        if (delayChargeRatio != null ? !delayChargeRatio.equals(that.delayChargeRatio) : that.delayChargeRatio != null)
            return false;
        if (delayChargeCalculationMethod != null ? !delayChargeCalculationMethod.equals(that.delayChargeCalculationMethod) : that.delayChargeCalculationMethod != null)
            return false;
        if (startCalculation != null ? !startCalculation.equals(that.startCalculation) : that.startCalculation != null)
            return false;
        if (chargingPeriodPrecision != null ? !chargingPeriodPrecision.equals(that.chargingPeriodPrecision) : that.chargingPeriodPrecision != null)
            return false;
        if (defaultChargingPeriod != null ? !defaultChargingPeriod.equals(that.defaultChargingPeriod) : that.defaultChargingPeriod != null)
            return false;
        if (autoDiscountType != null ? !autoDiscountType.equals(that.autoDiscountType) : that.autoDiscountType != null)
            return false;
        if (settingType != null ? !settingType.equals(that.settingType) : that.settingType != null) return false;
        if (organizationItemId != null ? !organizationItemId.equals(that.organizationItemId) : that.organizationItemId != null)
            return false;
        if (isDelCorpCharge != null ? !isDelCorpCharge.equals(that.isDelCorpCharge) : that.isDelCorpCharge != null)
            return false;
        if (isVacancyCharge != null ? !isVacancyCharge.equals(that.isVacancyCharge) : that.isVacancyCharge != null)
            return false;
        if (lateFeeSetId != null ? !lateFeeSetId.equals(that.lateFeeSetId) : that.lateFeeSetId != null) return false;
        if (chargeItemTimeId != null ? !chargeItemTimeId.equals(that.chargeItemTimeId) : that.chargeItemTimeId != null)
            return false;
        if (unitPrice1 != null ? !unitPrice1.equals(that.unitPrice1) : that.unitPrice1 != null) return false;
        if (unitPrice2 != null ? !unitPrice2.equals(that.unitPrice2) : that.unitPrice2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (itemCategory != null ? itemCategory.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (calculationMethod != null ? calculationMethod.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (meteringMode != null ? meteringMode.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (chargeItemTypeId != null ? chargeItemTypeId.hashCode() : 0);
        result = 31 * result + (chargingPeriod != null ? chargingPeriod.hashCode() : 0);
        result = 31 * result + (customFormula != null ? customFormula.hashCode() : 0);
        result = 31 * result + (meterTypeId != null ? meterTypeId.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (delayChargeDays != null ? delayChargeDays.hashCode() : 0);
        result = 31 * result + (delayChargeRatio != null ? delayChargeRatio.hashCode() : 0);
        result = 31 * result + (delayChargeCalculationMethod != null ? delayChargeCalculationMethod.hashCode() : 0);
        result = 31 * result + (startCalculation != null ? startCalculation.hashCode() : 0);
        result = 31 * result + (chargingPeriodPrecision != null ? chargingPeriodPrecision.hashCode() : 0);
        result = 31 * result + (defaultChargingPeriod != null ? defaultChargingPeriod.hashCode() : 0);
        result = 31 * result + (autoDiscountType != null ? autoDiscountType.hashCode() : 0);
        result = 31 * result + (settingType != null ? settingType.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        result = 31 * result + (isDelCorpCharge != null ? isDelCorpCharge.hashCode() : 0);
        result = 31 * result + (isVacancyCharge != null ? isVacancyCharge.hashCode() : 0);
        result = 31 * result + (lateFeeSetId != null ? lateFeeSetId.hashCode() : 0);
        result = 31 * result + (chargeItemTimeId != null ? chargeItemTimeId.hashCode() : 0);
        result = 31 * result + (unitPrice1 != null ? unitPrice1.hashCode() : 0);
        result = 31 * result + (unitPrice2 != null ? unitPrice2.hashCode() : 0);
        return result;
    }
}
