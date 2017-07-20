package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Housemeter {
    private Integer id;
    private Integer meterTypeId;
    private Double ratio;
    private Integer houseId;
    private Double initialReading;
    private Double maxReading;
    private Timestamp initialDate;
    private Double minOccurNumber;
    private String name;
    private Byte isAvailable;
    private Double lastReadData;
    private Timestamp lastReadDate;
    private Byte isMaster;
    private Integer publicMeterId;
    private Byte isMetaData;
    private Integer lastReadId;
    private Integer regionId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "Ratio")
    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    @Basic
    @Column(name = "HouseId")
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "InitialReading")
    public Double getInitialReading() {
        return initialReading;
    }

    public void setInitialReading(Double initialReading) {
        this.initialReading = initialReading;
    }

    @Basic
    @Column(name = "MaxReading")
    public Double getMaxReading() {
        return maxReading;
    }

    public void setMaxReading(Double maxReading) {
        this.maxReading = maxReading;
    }

    @Basic
    @Column(name = "InitialDate")
    public Timestamp getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Timestamp initialDate) {
        this.initialDate = initialDate;
    }

    @Basic
    @Column(name = "MinOccurNumber")
    public Double getMinOccurNumber() {
        return minOccurNumber;
    }

    public void setMinOccurNumber(Double minOccurNumber) {
        this.minOccurNumber = minOccurNumber;
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
    @Column(name = "IsAvailable")
    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Basic
    @Column(name = "LastReadData")
    public Double getLastReadData() {
        return lastReadData;
    }

    public void setLastReadData(Double lastReadData) {
        this.lastReadData = lastReadData;
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
    @Column(name = "IsMaster")
    public Byte getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Byte isMaster) {
        this.isMaster = isMaster;
    }

    @Basic
    @Column(name = "PublicMeterId")
    public Integer getPublicMeterId() {
        return publicMeterId;
    }

    public void setPublicMeterId(Integer publicMeterId) {
        this.publicMeterId = publicMeterId;
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
    @Column(name = "LastReadId")
    public Integer getLastReadId() {
        return lastReadId;
    }

    public void setLastReadId(Integer lastReadId) {
        this.lastReadId = lastReadId;
    }

    @Basic
    @Column(name = "RegionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Housemeter that = (Housemeter) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (meterTypeId != null ? !meterTypeId.equals(that.meterTypeId) : that.meterTypeId != null) return false;
        if (ratio != null ? !ratio.equals(that.ratio) : that.ratio != null) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;
        if (initialReading != null ? !initialReading.equals(that.initialReading) : that.initialReading != null)
            return false;
        if (maxReading != null ? !maxReading.equals(that.maxReading) : that.maxReading != null) return false;
        if (initialDate != null ? !initialDate.equals(that.initialDate) : that.initialDate != null) return false;
        if (minOccurNumber != null ? !minOccurNumber.equals(that.minOccurNumber) : that.minOccurNumber != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (isAvailable != null ? !isAvailable.equals(that.isAvailable) : that.isAvailable != null) return false;
        if (lastReadData != null ? !lastReadData.equals(that.lastReadData) : that.lastReadData != null) return false;
        if (lastReadDate != null ? !lastReadDate.equals(that.lastReadDate) : that.lastReadDate != null) return false;
        if (isMaster != null ? !isMaster.equals(that.isMaster) : that.isMaster != null) return false;
        if (publicMeterId != null ? !publicMeterId.equals(that.publicMeterId) : that.publicMeterId != null)
            return false;
        if (isMetaData != null ? !isMetaData.equals(that.isMetaData) : that.isMetaData != null) return false;
        if (lastReadId != null ? !lastReadId.equals(that.lastReadId) : that.lastReadId != null) return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (meterTypeId != null ? meterTypeId.hashCode() : 0);
        result = 31 * result + (ratio != null ? ratio.hashCode() : 0);
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        result = 31 * result + (initialReading != null ? initialReading.hashCode() : 0);
        result = 31 * result + (maxReading != null ? maxReading.hashCode() : 0);
        result = 31 * result + (initialDate != null ? initialDate.hashCode() : 0);
        result = 31 * result + (minOccurNumber != null ? minOccurNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isAvailable != null ? isAvailable.hashCode() : 0);
        result = 31 * result + (lastReadData != null ? lastReadData.hashCode() : 0);
        result = 31 * result + (lastReadDate != null ? lastReadDate.hashCode() : 0);
        result = 31 * result + (isMaster != null ? isMaster.hashCode() : 0);
        result = 31 * result + (publicMeterId != null ? publicMeterId.hashCode() : 0);
        result = 31 * result + (isMetaData != null ? isMetaData.hashCode() : 0);
        result = 31 * result + (lastReadId != null ? lastReadId.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        return result;
    }
}
