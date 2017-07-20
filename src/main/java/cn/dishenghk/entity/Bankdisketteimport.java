package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bankdisketteimport {
    private Integer id;
    private Integer status;
    private Timestamp transferredOn;
    private Integer createdById;
    private Timestamp createdOn;
    private Integer lastUpdatedById;
    private Timestamp lastUpdatedOn;
    private Integer auditedBy;
    private Timestamp auditedOn;
    private Integer bankId;
    private Integer bankDisketteExportId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "TransferredOn")
    public Timestamp getTransferredOn() {
        return transferredOn;
    }

    public void setTransferredOn(Timestamp transferredOn) {
        this.transferredOn = transferredOn;
    }

    @Basic
    @Column(name = "CreatedById")
    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    @Basic
    @Column(name = "CreatedOn")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "LastUpdatedById")
    public Integer getLastUpdatedById() {
        return lastUpdatedById;
    }

    public void setLastUpdatedById(Integer lastUpdatedById) {
        this.lastUpdatedById = lastUpdatedById;
    }

    @Basic
    @Column(name = "LastUpdatedOn")
    public Timestamp getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @Basic
    @Column(name = "AuditedBy")
    public Integer getAuditedBy() {
        return auditedBy;
    }

    public void setAuditedBy(Integer auditedBy) {
        this.auditedBy = auditedBy;
    }

    @Basic
    @Column(name = "AuditedOn")
    public Timestamp getAuditedOn() {
        return auditedOn;
    }

    public void setAuditedOn(Timestamp auditedOn) {
        this.auditedOn = auditedOn;
    }

    @Basic
    @Column(name = "BankId")
    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    @Basic
    @Column(name = "BankDisketteExportId")
    public Integer getBankDisketteExportId() {
        return bankDisketteExportId;
    }

    public void setBankDisketteExportId(Integer bankDisketteExportId) {
        this.bankDisketteExportId = bankDisketteExportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bankdisketteimport that = (Bankdisketteimport) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (transferredOn != null ? !transferredOn.equals(that.transferredOn) : that.transferredOn != null)
            return false;
        if (createdById != null ? !createdById.equals(that.createdById) : that.createdById != null) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (lastUpdatedById != null ? !lastUpdatedById.equals(that.lastUpdatedById) : that.lastUpdatedById != null)
            return false;
        if (lastUpdatedOn != null ? !lastUpdatedOn.equals(that.lastUpdatedOn) : that.lastUpdatedOn != null)
            return false;
        if (auditedBy != null ? !auditedBy.equals(that.auditedBy) : that.auditedBy != null) return false;
        if (auditedOn != null ? !auditedOn.equals(that.auditedOn) : that.auditedOn != null) return false;
        if (bankId != null ? !bankId.equals(that.bankId) : that.bankId != null) return false;
        if (bankDisketteExportId != null ? !bankDisketteExportId.equals(that.bankDisketteExportId) : that.bankDisketteExportId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (transferredOn != null ? transferredOn.hashCode() : 0);
        result = 31 * result + (createdById != null ? createdById.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (lastUpdatedById != null ? lastUpdatedById.hashCode() : 0);
        result = 31 * result + (lastUpdatedOn != null ? lastUpdatedOn.hashCode() : 0);
        result = 31 * result + (auditedBy != null ? auditedBy.hashCode() : 0);
        result = 31 * result + (auditedOn != null ? auditedOn.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (bankDisketteExportId != null ? bankDisketteExportId.hashCode() : 0);
        return result;
    }
}
