package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class House {
    private Integer id;
    private Integer buildingId;
    private Integer customerId;
    private String houseNumber;
    private String unit;
    private Integer floor;
    private Double coveredArea;
    private Double usedArea;
    private Integer houseStatus;
    private Timestamp handoverDate;
    private Timestamp recieveDate;
    private Timestamp checkInDate;
    private Timestamp decrateStartDate;
    private Timestamp decrateEndDate;
    private Integer type;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BuildingId")
    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
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
    @Column(name = "HouseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Basic
    @Column(name = "Unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "Floor")
    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @Basic
    @Column(name = "CoveredArea")
    public Double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(Double coveredArea) {
        this.coveredArea = coveredArea;
    }

    @Basic
    @Column(name = "UsedArea")
    public Double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(Double usedArea) {
        this.usedArea = usedArea;
    }

    @Basic
    @Column(name = "HouseStatus")
    public Integer getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(Integer houseStatus) {
        this.houseStatus = houseStatus;
    }

    @Basic
    @Column(name = "HandoverDate")
    public Timestamp getHandoverDate() {
        return handoverDate;
    }

    public void setHandoverDate(Timestamp handoverDate) {
        this.handoverDate = handoverDate;
    }

    @Basic
    @Column(name = "RecieveDate")
    public Timestamp getRecieveDate() {
        return recieveDate;
    }

    public void setRecieveDate(Timestamp recieveDate) {
        this.recieveDate = recieveDate;
    }

    @Basic
    @Column(name = "CheckInDate")
    public Timestamp getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Timestamp checkInDate) {
        this.checkInDate = checkInDate;
    }

    @Basic
    @Column(name = "DecrateStartDate")
    public Timestamp getDecrateStartDate() {
        return decrateStartDate;
    }

    public void setDecrateStartDate(Timestamp decrateStartDate) {
        this.decrateStartDate = decrateStartDate;
    }

    @Basic
    @Column(name = "DecrateEndDate")
    public Timestamp getDecrateEndDate() {
        return decrateEndDate;
    }

    public void setDecrateEndDate(Timestamp decrateEndDate) {
        this.decrateEndDate = decrateEndDate;
    }

    @Basic
    @Column(name = "Type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (id != null ? !id.equals(house.id) : house.id != null) return false;
        if (buildingId != null ? !buildingId.equals(house.buildingId) : house.buildingId != null) return false;
        if (customerId != null ? !customerId.equals(house.customerId) : house.customerId != null) return false;
        if (houseNumber != null ? !houseNumber.equals(house.houseNumber) : house.houseNumber != null) return false;
        if (unit != null ? !unit.equals(house.unit) : house.unit != null) return false;
        if (floor != null ? !floor.equals(house.floor) : house.floor != null) return false;
        if (coveredArea != null ? !coveredArea.equals(house.coveredArea) : house.coveredArea != null) return false;
        if (usedArea != null ? !usedArea.equals(house.usedArea) : house.usedArea != null) return false;
        if (houseStatus != null ? !houseStatus.equals(house.houseStatus) : house.houseStatus != null) return false;
        if (handoverDate != null ? !handoverDate.equals(house.handoverDate) : house.handoverDate != null) return false;
        if (recieveDate != null ? !recieveDate.equals(house.recieveDate) : house.recieveDate != null) return false;
        if (checkInDate != null ? !checkInDate.equals(house.checkInDate) : house.checkInDate != null) return false;
        if (decrateStartDate != null ? !decrateStartDate.equals(house.decrateStartDate) : house.decrateStartDate != null)
            return false;
        if (decrateEndDate != null ? !decrateEndDate.equals(house.decrateEndDate) : house.decrateEndDate != null)
            return false;
        if (type != null ? !type.equals(house.type) : house.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (buildingId != null ? buildingId.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (houseNumber != null ? houseNumber.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (floor != null ? floor.hashCode() : 0);
        result = 31 * result + (coveredArea != null ? coveredArea.hashCode() : 0);
        result = 31 * result + (usedArea != null ? usedArea.hashCode() : 0);
        result = 31 * result + (houseStatus != null ? houseStatus.hashCode() : 0);
        result = 31 * result + (handoverDate != null ? handoverDate.hashCode() : 0);
        result = 31 * result + (recieveDate != null ? recieveDate.hashCode() : 0);
        result = 31 * result + (checkInDate != null ? checkInDate.hashCode() : 0);
        result = 31 * result + (decrateStartDate != null ? decrateStartDate.hashCode() : 0);
        result = 31 * result + (decrateEndDate != null ? decrateEndDate.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
