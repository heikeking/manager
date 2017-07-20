package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Assignresult {
    private Integer id;
    private Integer publicMeterDataId;
    private Integer houseMeterId;
    private Integer houseId;
    private Double assignCount;
    private Byte isGenerateBill;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PublicMeterDataId")
    public Integer getPublicMeterDataId() {
        return publicMeterDataId;
    }

    public void setPublicMeterDataId(Integer publicMeterDataId) {
        this.publicMeterDataId = publicMeterDataId;
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
    @Column(name = "HouseId")
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "AssignCount")
    public Double getAssignCount() {
        return assignCount;
    }

    public void setAssignCount(Double assignCount) {
        this.assignCount = assignCount;
    }

    @Basic
    @Column(name = "IsGenerateBill")
    public Byte getIsGenerateBill() {
        return isGenerateBill;
    }

    public void setIsGenerateBill(Byte isGenerateBill) {
        this.isGenerateBill = isGenerateBill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Assignresult that = (Assignresult) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (publicMeterDataId != null ? !publicMeterDataId.equals(that.publicMeterDataId) : that.publicMeterDataId != null)
            return false;
        if (houseMeterId != null ? !houseMeterId.equals(that.houseMeterId) : that.houseMeterId != null) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;
        if (assignCount != null ? !assignCount.equals(that.assignCount) : that.assignCount != null) return false;
        if (isGenerateBill != null ? !isGenerateBill.equals(that.isGenerateBill) : that.isGenerateBill != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (publicMeterDataId != null ? publicMeterDataId.hashCode() : 0);
        result = 31 * result + (houseMeterId != null ? houseMeterId.hashCode() : 0);
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        result = 31 * result + (assignCount != null ? assignCount.hashCode() : 0);
        result = 31 * result + (isGenerateBill != null ? isGenerateBill.hashCode() : 0);
        return result;
    }
}
