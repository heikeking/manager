package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bill {
    private Integer id;
    private Integer customerId;
    private Double amount;
    private Double exempt;
    private Double delayCharge;
    private Timestamp startDate;
    private Timestamp endDate;
    private Integer year;
    private Integer month;
    private Double paidAmount;
    private Double quantity;
    private Integer status;
    private Integer chargeItemId;
    private String chargeItemName;
    private Integer calculationMethod;
    private Double unitPrice;
    private Integer meteringMode;
    private Integer chargingPeriod;
    private String customFormula;
    private Double money;
    private Integer itemCategory;
    private Integer chargeItemTypeId;
    private Integer organizationItemId;
    private Integer carParkingRegistrationId;
    private Double smallChange;
    private Double lastReading;
    private Double currentReading;
    private String remark;
    private Integer houseMeterId;
    private Integer regionId;
    private Integer billDataSourceType;
    private Timestamp shouldChargeDate;
    private Timestamp lateFeeEndDate;
    private Integer lateFeeDays;
    private Double lateFee;
    private Double subLateFee;
    private Double discount;
    private Double actualAmount;
    private Timestamp createDate;
    private Integer publicMeterId;

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
    @Column(name = "Amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Exempt")
    public Double getExempt() {
        return exempt;
    }

    public void setExempt(Double exempt) {
        this.exempt = exempt;
    }

    @Basic
    @Column(name = "DelayCharge")
    public Double getDelayCharge() {
        return delayCharge;
    }

    public void setDelayCharge(Double delayCharge) {
        this.delayCharge = delayCharge;
    }

    @Basic
    @Column(name = "StartDate")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "Month")
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Basic
    @Column(name = "PaidAmount")
    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Basic
    @Column(name = "Quantity")
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ChargeItemId")
    public Integer getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(Integer chargeItemId) {
        this.chargeItemId = chargeItemId;
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
    @Column(name = "CalculationMethod")
    public Integer getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(Integer calculationMethod) {
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
    public Integer getMeteringMode() {
        return meteringMode;
    }

    public void setMeteringMode(Integer meteringMode) {
        this.meteringMode = meteringMode;
    }

    @Basic
    @Column(name = "ChargingPeriod")
    public Integer getChargingPeriod() {
        return chargingPeriod;
    }

    public void setChargingPeriod(Integer chargingPeriod) {
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
    @Column(name = "Money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Basic
    @Column(name = "ItemCategory")
    public Integer getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(Integer itemCategory) {
        this.itemCategory = itemCategory;
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

    @Basic
    @Column(name = "CarParkingRegistrationId")
    public Integer getCarParkingRegistrationId() {
        return carParkingRegistrationId;
    }

    public void setCarParkingRegistrationId(Integer carParkingRegistrationId) {
        this.carParkingRegistrationId = carParkingRegistrationId;
    }

    @Basic
    @Column(name = "SmallChange")
    public Double getSmallChange() {
        return smallChange;
    }

    public void setSmallChange(Double smallChange) {
        this.smallChange = smallChange;
    }

    @Basic
    @Column(name = "LastReading")
    public Double getLastReading() {
        return lastReading;
    }

    public void setLastReading(Double lastReading) {
        this.lastReading = lastReading;
    }

    @Basic
    @Column(name = "CurrentReading")
    public Double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(Double currentReading) {
        this.currentReading = currentReading;
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
    @Column(name = "HouseMeterId")
    public Integer getHouseMeterId() {
        return houseMeterId;
    }

    public void setHouseMeterId(Integer houseMeterId) {
        this.houseMeterId = houseMeterId;
    }

    @Basic
    @Column(name = "RegionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "BillDataSourceType")
    public Integer getBillDataSourceType() {
        return billDataSourceType;
    }

    public void setBillDataSourceType(Integer billDataSourceType) {
        this.billDataSourceType = billDataSourceType;
    }

    @Basic
    @Column(name = "ShouldChargeDate")
    public Timestamp getShouldChargeDate() {
        return shouldChargeDate;
    }

    public void setShouldChargeDate(Timestamp shouldChargeDate) {
        this.shouldChargeDate = shouldChargeDate;
    }

    @Basic
    @Column(name = "LateFeeEndDate")
    public Timestamp getLateFeeEndDate() {
        return lateFeeEndDate;
    }

    public void setLateFeeEndDate(Timestamp lateFeeEndDate) {
        this.lateFeeEndDate = lateFeeEndDate;
    }

    @Basic
    @Column(name = "LateFeeDays")
    public Integer getLateFeeDays() {
        return lateFeeDays;
    }

    public void setLateFeeDays(Integer lateFeeDays) {
        this.lateFeeDays = lateFeeDays;
    }

    @Basic
    @Column(name = "LateFee")
    public Double getLateFee() {
        return lateFee;
    }

    public void setLateFee(Double lateFee) {
        this.lateFee = lateFee;
    }

    @Basic
    @Column(name = "SubLateFee")
    public Double getSubLateFee() {
        return subLateFee;
    }

    public void setSubLateFee(Double subLateFee) {
        this.subLateFee = subLateFee;
    }

    @Basic
    @Column(name = "Discount")
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "ActualAmount")
    public Double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(Double actualAmount) {
        this.actualAmount = actualAmount;
    }

    @Basic
    @Column(name = "CreateDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "PublicMeterId")
    public Integer getPublicMeterId() {
        return publicMeterId;
    }

    public void setPublicMeterId(Integer publicMeterId) {
        this.publicMeterId = publicMeterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bill bill = (Bill) o;

        if (id != null ? !id.equals(bill.id) : bill.id != null) return false;
        if (customerId != null ? !customerId.equals(bill.customerId) : bill.customerId != null) return false;
        if (amount != null ? !amount.equals(bill.amount) : bill.amount != null) return false;
        if (exempt != null ? !exempt.equals(bill.exempt) : bill.exempt != null) return false;
        if (delayCharge != null ? !delayCharge.equals(bill.delayCharge) : bill.delayCharge != null) return false;
        if (startDate != null ? !startDate.equals(bill.startDate) : bill.startDate != null) return false;
        if (endDate != null ? !endDate.equals(bill.endDate) : bill.endDate != null) return false;
        if (year != null ? !year.equals(bill.year) : bill.year != null) return false;
        if (month != null ? !month.equals(bill.month) : bill.month != null) return false;
        if (paidAmount != null ? !paidAmount.equals(bill.paidAmount) : bill.paidAmount != null) return false;
        if (quantity != null ? !quantity.equals(bill.quantity) : bill.quantity != null) return false;
        if (status != null ? !status.equals(bill.status) : bill.status != null) return false;
        if (chargeItemId != null ? !chargeItemId.equals(bill.chargeItemId) : bill.chargeItemId != null) return false;
        if (chargeItemName != null ? !chargeItemName.equals(bill.chargeItemName) : bill.chargeItemName != null)
            return false;
        if (calculationMethod != null ? !calculationMethod.equals(bill.calculationMethod) : bill.calculationMethod != null)
            return false;
        if (unitPrice != null ? !unitPrice.equals(bill.unitPrice) : bill.unitPrice != null) return false;
        if (meteringMode != null ? !meteringMode.equals(bill.meteringMode) : bill.meteringMode != null) return false;
        if (chargingPeriod != null ? !chargingPeriod.equals(bill.chargingPeriod) : bill.chargingPeriod != null)
            return false;
        if (customFormula != null ? !customFormula.equals(bill.customFormula) : bill.customFormula != null)
            return false;
        if (money != null ? !money.equals(bill.money) : bill.money != null) return false;
        if (itemCategory != null ? !itemCategory.equals(bill.itemCategory) : bill.itemCategory != null) return false;
        if (chargeItemTypeId != null ? !chargeItemTypeId.equals(bill.chargeItemTypeId) : bill.chargeItemTypeId != null)
            return false;
        if (organizationItemId != null ? !organizationItemId.equals(bill.organizationItemId) : bill.organizationItemId != null)
            return false;
        if (carParkingRegistrationId != null ? !carParkingRegistrationId.equals(bill.carParkingRegistrationId) : bill.carParkingRegistrationId != null)
            return false;
        if (smallChange != null ? !smallChange.equals(bill.smallChange) : bill.smallChange != null) return false;
        if (lastReading != null ? !lastReading.equals(bill.lastReading) : bill.lastReading != null) return false;
        if (currentReading != null ? !currentReading.equals(bill.currentReading) : bill.currentReading != null)
            return false;
        if (remark != null ? !remark.equals(bill.remark) : bill.remark != null) return false;
        if (houseMeterId != null ? !houseMeterId.equals(bill.houseMeterId) : bill.houseMeterId != null) return false;
        if (regionId != null ? !regionId.equals(bill.regionId) : bill.regionId != null) return false;
        if (billDataSourceType != null ? !billDataSourceType.equals(bill.billDataSourceType) : bill.billDataSourceType != null)
            return false;
        if (shouldChargeDate != null ? !shouldChargeDate.equals(bill.shouldChargeDate) : bill.shouldChargeDate != null)
            return false;
        if (lateFeeEndDate != null ? !lateFeeEndDate.equals(bill.lateFeeEndDate) : bill.lateFeeEndDate != null)
            return false;
        if (lateFeeDays != null ? !lateFeeDays.equals(bill.lateFeeDays) : bill.lateFeeDays != null) return false;
        if (lateFee != null ? !lateFee.equals(bill.lateFee) : bill.lateFee != null) return false;
        if (subLateFee != null ? !subLateFee.equals(bill.subLateFee) : bill.subLateFee != null) return false;
        if (discount != null ? !discount.equals(bill.discount) : bill.discount != null) return false;
        if (actualAmount != null ? !actualAmount.equals(bill.actualAmount) : bill.actualAmount != null) return false;
        if (createDate != null ? !createDate.equals(bill.createDate) : bill.createDate != null) return false;
        if (publicMeterId != null ? !publicMeterId.equals(bill.publicMeterId) : bill.publicMeterId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (exempt != null ? exempt.hashCode() : 0);
        result = 31 * result + (delayCharge != null ? delayCharge.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (paidAmount != null ? paidAmount.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (chargeItemId != null ? chargeItemId.hashCode() : 0);
        result = 31 * result + (chargeItemName != null ? chargeItemName.hashCode() : 0);
        result = 31 * result + (calculationMethod != null ? calculationMethod.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (meteringMode != null ? meteringMode.hashCode() : 0);
        result = 31 * result + (chargingPeriod != null ? chargingPeriod.hashCode() : 0);
        result = 31 * result + (customFormula != null ? customFormula.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (itemCategory != null ? itemCategory.hashCode() : 0);
        result = 31 * result + (chargeItemTypeId != null ? chargeItemTypeId.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        result = 31 * result + (carParkingRegistrationId != null ? carParkingRegistrationId.hashCode() : 0);
        result = 31 * result + (smallChange != null ? smallChange.hashCode() : 0);
        result = 31 * result + (lastReading != null ? lastReading.hashCode() : 0);
        result = 31 * result + (currentReading != null ? currentReading.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (houseMeterId != null ? houseMeterId.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (billDataSourceType != null ? billDataSourceType.hashCode() : 0);
        result = 31 * result + (shouldChargeDate != null ? shouldChargeDate.hashCode() : 0);
        result = 31 * result + (lateFeeEndDate != null ? lateFeeEndDate.hashCode() : 0);
        result = 31 * result + (lateFeeDays != null ? lateFeeDays.hashCode() : 0);
        result = 31 * result + (lateFee != null ? lateFee.hashCode() : 0);
        result = 31 * result + (subLateFee != null ? subLateFee.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (actualAmount != null ? actualAmount.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (publicMeterId != null ? publicMeterId.hashCode() : 0);
        return result;
    }
}
