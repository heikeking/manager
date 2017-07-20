package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Parkingplaceownerchangehistory {
    private Integer id;
    private Integer parkingPlaceId;
    private Integer originalOwnerId;
    private Integer newOwnerId;
    private Integer modifiedBy;
    private Timestamp modifiedOn;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ParkingPlaceId")
    public Integer getParkingPlaceId() {
        return parkingPlaceId;
    }

    public void setParkingPlaceId(Integer parkingPlaceId) {
        this.parkingPlaceId = parkingPlaceId;
    }

    @Basic
    @Column(name = "OriginalOwnerId")
    public Integer getOriginalOwnerId() {
        return originalOwnerId;
    }

    public void setOriginalOwnerId(Integer originalOwnerId) {
        this.originalOwnerId = originalOwnerId;
    }

    @Basic
    @Column(name = "NewOwnerId")
    public Integer getNewOwnerId() {
        return newOwnerId;
    }

    public void setNewOwnerId(Integer newOwnerId) {
        this.newOwnerId = newOwnerId;
    }

    @Basic
    @Column(name = "ModifiedBy")
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "ModifiedOn")
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parkingplaceownerchangehistory that = (Parkingplaceownerchangehistory) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (parkingPlaceId != null ? !parkingPlaceId.equals(that.parkingPlaceId) : that.parkingPlaceId != null)
            return false;
        if (originalOwnerId != null ? !originalOwnerId.equals(that.originalOwnerId) : that.originalOwnerId != null)
            return false;
        if (newOwnerId != null ? !newOwnerId.equals(that.newOwnerId) : that.newOwnerId != null) return false;
        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
        if (modifiedOn != null ? !modifiedOn.equals(that.modifiedOn) : that.modifiedOn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parkingPlaceId != null ? parkingPlaceId.hashCode() : 0);
        result = 31 * result + (originalOwnerId != null ? originalOwnerId.hashCode() : 0);
        result = 31 * result + (newOwnerId != null ? newOwnerId.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        return result;
    }
}
