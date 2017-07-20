package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Building {
    private Integer id;
    private Integer regionId;
    private Integer floors;
    private Integer buildingType;
    private Integer purpose;
    private Integer toward;

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
    @Column(name = "Floors")
    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    @Basic
    @Column(name = "BuildingType")
    public Integer getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(Integer buildingType) {
        this.buildingType = buildingType;
    }

    @Basic
    @Column(name = "Purpose")
    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "Toward")
    public Integer getToward() {
        return toward;
    }

    public void setToward(Integer toward) {
        this.toward = toward;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Building building = (Building) o;

        if (id != null ? !id.equals(building.id) : building.id != null) return false;
        if (regionId != null ? !regionId.equals(building.regionId) : building.regionId != null) return false;
        if (floors != null ? !floors.equals(building.floors) : building.floors != null) return false;
        if (buildingType != null ? !buildingType.equals(building.buildingType) : building.buildingType != null)
            return false;
        if (purpose != null ? !purpose.equals(building.purpose) : building.purpose != null) return false;
        if (toward != null ? !toward.equals(building.toward) : building.toward != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (floors != null ? floors.hashCode() : 0);
        result = 31 * result + (buildingType != null ? buildingType.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (toward != null ? toward.hashCode() : 0);
        return result;
    }
}
