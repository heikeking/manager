package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Device {
    private Integer id;
    private Integer regionId;
    private String category;
    private String code;
    private String name;
    private String model;
    private String specifications;
    private Timestamp installDate;
    private String installAddress;
    private Double weight;
    private String material;
    private String maintenancePeriod;
    private String maintenanceTimes;
    private String repairTimes;
    private String usedMonths;
    private Timestamp retirementDate;
    private String factory;
    private String factoryAddress;
    private String factoryTel;
    private Double originalValue;
    private Double depreciationValue;
    private Double netValue;
    private String serviceCompany;
    private String serviceTel;
    private String serviceAddress;
    private String durableYears;
    private String responsible;
    private Timestamp createDate;
    private String remark;
    private Integer status;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "Category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "Model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "Specifications")
    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    @Basic
    @Column(name = "InstallDate")
    public Timestamp getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Timestamp installDate) {
        this.installDate = installDate;
    }

    @Basic
    @Column(name = "InstallAddress")
    public String getInstallAddress() {
        return installAddress;
    }

    public void setInstallAddress(String installAddress) {
        this.installAddress = installAddress;
    }

    @Basic
    @Column(name = "Weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "Material")
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Basic
    @Column(name = "MaintenancePeriod")
    public String getMaintenancePeriod() {
        return maintenancePeriod;
    }

    public void setMaintenancePeriod(String maintenancePeriod) {
        this.maintenancePeriod = maintenancePeriod;
    }

    @Basic
    @Column(name = "MaintenanceTimes")
    public String getMaintenanceTimes() {
        return maintenanceTimes;
    }

    public void setMaintenanceTimes(String maintenanceTimes) {
        this.maintenanceTimes = maintenanceTimes;
    }

    @Basic
    @Column(name = "RepairTimes")
    public String getRepairTimes() {
        return repairTimes;
    }

    public void setRepairTimes(String repairTimes) {
        this.repairTimes = repairTimes;
    }

    @Basic
    @Column(name = "UsedMonths")
    public String getUsedMonths() {
        return usedMonths;
    }

    public void setUsedMonths(String usedMonths) {
        this.usedMonths = usedMonths;
    }

    @Basic
    @Column(name = "RetirementDate")
    public Timestamp getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(Timestamp retirementDate) {
        this.retirementDate = retirementDate;
    }

    @Basic
    @Column(name = "Factory")
    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Basic
    @Column(name = "FactoryAddress")
    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    @Basic
    @Column(name = "FactoryTel")
    public String getFactoryTel() {
        return factoryTel;
    }

    public void setFactoryTel(String factoryTel) {
        this.factoryTel = factoryTel;
    }

    @Basic
    @Column(name = "OriginalValue")
    public Double getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(Double originalValue) {
        this.originalValue = originalValue;
    }

    @Basic
    @Column(name = "DepreciationValue")
    public Double getDepreciationValue() {
        return depreciationValue;
    }

    public void setDepreciationValue(Double depreciationValue) {
        this.depreciationValue = depreciationValue;
    }

    @Basic
    @Column(name = "NetValue")
    public Double getNetValue() {
        return netValue;
    }

    public void setNetValue(Double netValue) {
        this.netValue = netValue;
    }

    @Basic
    @Column(name = "ServiceCompany")
    public String getServiceCompany() {
        return serviceCompany;
    }

    public void setServiceCompany(String serviceCompany) {
        this.serviceCompany = serviceCompany;
    }

    @Basic
    @Column(name = "ServiceTel")
    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }

    @Basic
    @Column(name = "ServiceAddress")
    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @Basic
    @Column(name = "DurableYears")
    public String getDurableYears() {
        return durableYears;
    }

    public void setDurableYears(String durableYears) {
        this.durableYears = durableYears;
    }

    @Basic
    @Column(name = "Responsible")
    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "Status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (id != null ? !id.equals(device.id) : device.id != null) return false;
        if (regionId != null ? !regionId.equals(device.regionId) : device.regionId != null) return false;
        if (category != null ? !category.equals(device.category) : device.category != null) return false;
        if (code != null ? !code.equals(device.code) : device.code != null) return false;
        if (name != null ? !name.equals(device.name) : device.name != null) return false;
        if (model != null ? !model.equals(device.model) : device.model != null) return false;
        if (specifications != null ? !specifications.equals(device.specifications) : device.specifications != null)
            return false;
        if (installDate != null ? !installDate.equals(device.installDate) : device.installDate != null) return false;
        if (installAddress != null ? !installAddress.equals(device.installAddress) : device.installAddress != null)
            return false;
        if (weight != null ? !weight.equals(device.weight) : device.weight != null) return false;
        if (material != null ? !material.equals(device.material) : device.material != null) return false;
        if (maintenancePeriod != null ? !maintenancePeriod.equals(device.maintenancePeriod) : device.maintenancePeriod != null)
            return false;
        if (maintenanceTimes != null ? !maintenanceTimes.equals(device.maintenanceTimes) : device.maintenanceTimes != null)
            return false;
        if (repairTimes != null ? !repairTimes.equals(device.repairTimes) : device.repairTimes != null) return false;
        if (usedMonths != null ? !usedMonths.equals(device.usedMonths) : device.usedMonths != null) return false;
        if (retirementDate != null ? !retirementDate.equals(device.retirementDate) : device.retirementDate != null)
            return false;
        if (factory != null ? !factory.equals(device.factory) : device.factory != null) return false;
        if (factoryAddress != null ? !factoryAddress.equals(device.factoryAddress) : device.factoryAddress != null)
            return false;
        if (factoryTel != null ? !factoryTel.equals(device.factoryTel) : device.factoryTel != null) return false;
        if (originalValue != null ? !originalValue.equals(device.originalValue) : device.originalValue != null)
            return false;
        if (depreciationValue != null ? !depreciationValue.equals(device.depreciationValue) : device.depreciationValue != null)
            return false;
        if (netValue != null ? !netValue.equals(device.netValue) : device.netValue != null) return false;
        if (serviceCompany != null ? !serviceCompany.equals(device.serviceCompany) : device.serviceCompany != null)
            return false;
        if (serviceTel != null ? !serviceTel.equals(device.serviceTel) : device.serviceTel != null) return false;
        if (serviceAddress != null ? !serviceAddress.equals(device.serviceAddress) : device.serviceAddress != null)
            return false;
        if (durableYears != null ? !durableYears.equals(device.durableYears) : device.durableYears != null)
            return false;
        if (responsible != null ? !responsible.equals(device.responsible) : device.responsible != null) return false;
        if (createDate != null ? !createDate.equals(device.createDate) : device.createDate != null) return false;
        if (remark != null ? !remark.equals(device.remark) : device.remark != null) return false;
        if (status != null ? !status.equals(device.status) : device.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (specifications != null ? specifications.hashCode() : 0);
        result = 31 * result + (installDate != null ? installDate.hashCode() : 0);
        result = 31 * result + (installAddress != null ? installAddress.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        result = 31 * result + (maintenancePeriod != null ? maintenancePeriod.hashCode() : 0);
        result = 31 * result + (maintenanceTimes != null ? maintenanceTimes.hashCode() : 0);
        result = 31 * result + (repairTimes != null ? repairTimes.hashCode() : 0);
        result = 31 * result + (usedMonths != null ? usedMonths.hashCode() : 0);
        result = 31 * result + (retirementDate != null ? retirementDate.hashCode() : 0);
        result = 31 * result + (factory != null ? factory.hashCode() : 0);
        result = 31 * result + (factoryAddress != null ? factoryAddress.hashCode() : 0);
        result = 31 * result + (factoryTel != null ? factoryTel.hashCode() : 0);
        result = 31 * result + (originalValue != null ? originalValue.hashCode() : 0);
        result = 31 * result + (depreciationValue != null ? depreciationValue.hashCode() : 0);
        result = 31 * result + (netValue != null ? netValue.hashCode() : 0);
        result = 31 * result + (serviceCompany != null ? serviceCompany.hashCode() : 0);
        result = 31 * result + (serviceTel != null ? serviceTel.hashCode() : 0);
        result = 31 * result + (serviceAddress != null ? serviceAddress.hashCode() : 0);
        result = 31 * result + (durableYears != null ? durableYears.hashCode() : 0);
        result = 31 * result + (responsible != null ? responsible.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
