package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Publicmeter {
    private Integer id;
    private Integer regionId;
    private String name;
    private Integer formula;
    private Integer meterTypeId;
    private Timestamp lastReadDate;
    private Double lastReadCount;
    private Integer publicMeterType;
    private Byte isMetaData;
    private Double multiple;
    private Double maxValue;
    private Double wastingRate;
    private String description;
    private Integer lastReadId;
    private Integer parentId;
    private String customFormula;
    private Byte isAvailable;

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
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Formula")
    public Integer getFormula() {
        return formula;
    }

    public void setFormula(Integer formula) {
        this.formula = formula;
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
    @Column(name = "LastReadDate")
    public Timestamp getLastReadDate() {
        return lastReadDate;
    }

    public void setLastReadDate(Timestamp lastReadDate) {
        this.lastReadDate = lastReadDate;
    }

    @Basic
    @Column(name = "LastReadCount")
    public Double getLastReadCount() {
        return lastReadCount;
    }

    public void setLastReadCount(Double lastReadCount) {
        this.lastReadCount = lastReadCount;
    }

    @Basic
    @Column(name = "PublicMeterType")
    public Integer getPublicMeterType() {
        return publicMeterType;
    }

    public void setPublicMeterType(Integer publicMeterType) {
        this.publicMeterType = publicMeterType;
    }

    @Basic
    @Column(name = "IsMetaData")
    public Byte getIsMetaData() {
        return isMetaData;
    }

    public void setIsMetaData(Byte isMetaData) {
        this.isMetaData = isMetaData;
    }

    @Basic
    @Column(name = "Multiple")
    public Double getMultiple() {
        return multiple;
    }

    public void setMultiple(Double multiple) {
        this.multiple = multiple;
    }

    @Basic
    @Column(name = "MaxValue")
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    @Basic
    @Column(name = "WastingRate")
    public Double getWastingRate() {
        return wastingRate;
    }

    public void setWastingRate(Double wastingRate) {
        this.wastingRate = wastingRate;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "LastReadId")
    public Integer getLastReadId() {
        return lastReadId;
    }

    public void setLastReadId(Integer lastReadId) {
        this.lastReadId = lastReadId;
    }

    @Basic
    @Column(name = "ParentId")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
    @Column(name = "IsAvailable")
    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publicmeter that = (Publicmeter) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (formula != null ? !formula.equals(that.formula) : that.formula != null) return false;
        if (meterTypeId != null ? !meterTypeId.equals(that.meterTypeId) : that.meterTypeId != null) return false;
        if (lastReadDate != null ? !lastReadDate.equals(that.lastReadDate) : that.lastReadDate != null) return false;
        if (lastReadCount != null ? !lastReadCount.equals(that.lastReadCount) : that.lastReadCount != null)
            return false;
        if (publicMeterType != null ? !publicMeterType.equals(that.publicMeterType) : that.publicMeterType != null)
            return false;
        if (isMetaData != null ? !isMetaData.equals(that.isMetaData) : that.isMetaData != null) return false;
        if (multiple != null ? !multiple.equals(that.multiple) : that.multiple != null) return false;
        if (maxValue != null ? !maxValue.equals(that.maxValue) : that.maxValue != null) return false;
        if (wastingRate != null ? !wastingRate.equals(that.wastingRate) : that.wastingRate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (lastReadId != null ? !lastReadId.equals(that.lastReadId) : that.lastReadId != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (customFormula != null ? !customFormula.equals(that.customFormula) : that.customFormula != null)
            return false;
        if (isAvailable != null ? !isAvailable.equals(that.isAvailable) : that.isAvailable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (formula != null ? formula.hashCode() : 0);
        result = 31 * result + (meterTypeId != null ? meterTypeId.hashCode() : 0);
        result = 31 * result + (lastReadDate != null ? lastReadDate.hashCode() : 0);
        result = 31 * result + (lastReadCount != null ? lastReadCount.hashCode() : 0);
        result = 31 * result + (publicMeterType != null ? publicMeterType.hashCode() : 0);
        result = 31 * result + (isMetaData != null ? isMetaData.hashCode() : 0);
        result = 31 * result + (multiple != null ? multiple.hashCode() : 0);
        result = 31 * result + (maxValue != null ? maxValue.hashCode() : 0);
        result = 31 * result + (wastingRate != null ? wastingRate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (lastReadId != null ? lastReadId.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (customFormula != null ? customFormula.hashCode() : 0);
        result = 31 * result + (isAvailable != null ? isAvailable.hashCode() : 0);
        return result;
    }
}
