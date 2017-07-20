package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Accountstatement {
    private Integer id;
    private Integer regionId;
    private Timestamp date;
    private Integer status;
    private String remark;
    private Integer staffId;
    private Integer auditBy;
    private Timestamp auditOn;

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
    @Column(name = "Date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "StaffId")
    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "AuditBy")
    public Integer getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(Integer auditBy) {
        this.auditBy = auditBy;
    }

    @Basic
    @Column(name = "AuditOn")
    public Timestamp getAuditOn() {
        return auditOn;
    }

    public void setAuditOn(Timestamp auditOn) {
        this.auditOn = auditOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accountstatement that = (Accountstatement) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (staffId != null ? !staffId.equals(that.staffId) : that.staffId != null) return false;
        if (auditBy != null ? !auditBy.equals(that.auditBy) : that.auditBy != null) return false;
        if (auditOn != null ? !auditOn.equals(that.auditOn) : that.auditOn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        result = 31 * result + (auditBy != null ? auditBy.hashCode() : 0);
        result = 31 * result + (auditOn != null ? auditOn.hashCode() : 0);
        return result;
    }
}
