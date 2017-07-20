package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Housecustomerchangehistory {
    private Integer id;
    private Integer houseId;
    private Integer originalCustomerId;
    private Integer newCustomerId;
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
    @Column(name = "HouseId")
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "OriginalCustomerId")
    public Integer getOriginalCustomerId() {
        return originalCustomerId;
    }

    public void setOriginalCustomerId(Integer originalCustomerId) {
        this.originalCustomerId = originalCustomerId;
    }

    @Basic
    @Column(name = "NewCustomerId")
    public Integer getNewCustomerId() {
        return newCustomerId;
    }

    public void setNewCustomerId(Integer newCustomerId) {
        this.newCustomerId = newCustomerId;
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

        Housecustomerchangehistory that = (Housecustomerchangehistory) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;
        if (originalCustomerId != null ? !originalCustomerId.equals(that.originalCustomerId) : that.originalCustomerId != null)
            return false;
        if (newCustomerId != null ? !newCustomerId.equals(that.newCustomerId) : that.newCustomerId != null)
            return false;
        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
        if (modifiedOn != null ? !modifiedOn.equals(that.modifiedOn) : that.modifiedOn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        result = 31 * result + (originalCustomerId != null ? originalCustomerId.hashCode() : 0);
        result = 31 * result + (newCustomerId != null ? newCustomerId.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        return result;
    }
}
