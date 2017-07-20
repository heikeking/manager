package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Publicmeterdata {
    private Integer id;
    private Integer publicMeterId;
    private Timestamp lastReadDate;
    private Double lastReadCount;
    private Double currentReadCount;
    private Timestamp currentReadDate;
    private Double actualCount;
    private Byte isAssigned;
    private String description;
    private Integer lastReadId;
    private Timestamp assignDate;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "CurrentReadCount")
    public Double getCurrentReadCount() {
        return currentReadCount;
    }

    public void setCurrentReadCount(Double currentReadCount) {
        this.currentReadCount = currentReadCount;
    }

    @Basic
    @Column(name = "CurrentReadDate")
    public Timestamp getCurrentReadDate() {
        return currentReadDate;
    }

    public void setCurrentReadDate(Timestamp currentReadDate) {
        this.currentReadDate = currentReadDate;
    }

    @Basic
    @Column(name = "ActualCount")
    public Double getActualCount() {
        return actualCount;
    }

    public void setActualCount(Double actualCount) {
        this.actualCount = actualCount;
    }

    @Basic
    @Column(name = "IsAssigned")
    public Byte getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(Byte isAssigned) {
        this.isAssigned = isAssigned;
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
    @Column(name = "AssignDate")
    public Timestamp getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Timestamp assignDate) {
        this.assignDate = assignDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publicmeterdata that = (Publicmeterdata) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (publicMeterId != null ? !publicMeterId.equals(that.publicMeterId) : that.publicMeterId != null)
            return false;
        if (lastReadDate != null ? !lastReadDate.equals(that.lastReadDate) : that.lastReadDate != null) return false;
        if (lastReadCount != null ? !lastReadCount.equals(that.lastReadCount) : that.lastReadCount != null)
            return false;
        if (currentReadCount != null ? !currentReadCount.equals(that.currentReadCount) : that.currentReadCount != null)
            return false;
        if (currentReadDate != null ? !currentReadDate.equals(that.currentReadDate) : that.currentReadDate != null)
            return false;
        if (actualCount != null ? !actualCount.equals(that.actualCount) : that.actualCount != null) return false;
        if (isAssigned != null ? !isAssigned.equals(that.isAssigned) : that.isAssigned != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (lastReadId != null ? !lastReadId.equals(that.lastReadId) : that.lastReadId != null) return false;
        if (assignDate != null ? !assignDate.equals(that.assignDate) : that.assignDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (publicMeterId != null ? publicMeterId.hashCode() : 0);
        result = 31 * result + (lastReadDate != null ? lastReadDate.hashCode() : 0);
        result = 31 * result + (lastReadCount != null ? lastReadCount.hashCode() : 0);
        result = 31 * result + (currentReadCount != null ? currentReadCount.hashCode() : 0);
        result = 31 * result + (currentReadDate != null ? currentReadDate.hashCode() : 0);
        result = 31 * result + (actualCount != null ? actualCount.hashCode() : 0);
        result = 31 * result + (isAssigned != null ? isAssigned.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (lastReadId != null ? lastReadId.hashCode() : 0);
        result = 31 * result + (assignDate != null ? assignDate.hashCode() : 0);
        return result;
    }
}
