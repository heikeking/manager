package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Devicemaintenanceplan {
    private Integer id;
    private Integer deviceId;
    private Timestamp createdDate;
    private Integer createdPersonId;
    private Timestamp planStartDate;
    private Timestamp planEndDate;
    private Double estimatedCost;
    private Integer maintenanceLevel;
    private String maintenanceStandard;
    private String maintenanceItem;
    private String executor;
    private String responsiblePerson;
    private String auditor;
    private Timestamp auditTime;
    private String auditOpinion;
    private Timestamp serviceTime;
    private String servicePerson;
    private Double serviceCost;
    private String serviceDetail;
    private Timestamp finishDate;
    private Integer status;
    private Integer deviceMaintenanceId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DeviceId")
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "CreatedDate")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "CreatedPersonId")
    public Integer getCreatedPersonId() {
        return createdPersonId;
    }

    public void setCreatedPersonId(Integer createdPersonId) {
        this.createdPersonId = createdPersonId;
    }

    @Basic
    @Column(name = "PlanStartDate")
    public Timestamp getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Timestamp planStartDate) {
        this.planStartDate = planStartDate;
    }

    @Basic
    @Column(name = "PlanEndDate")
    public Timestamp getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Timestamp planEndDate) {
        this.planEndDate = planEndDate;
    }

    @Basic
    @Column(name = "EstimatedCost")
    public Double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(Double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    @Basic
    @Column(name = "MaintenanceLevel")
    public Integer getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void setMaintenanceLevel(Integer maintenanceLevel) {
        this.maintenanceLevel = maintenanceLevel;
    }

    @Basic
    @Column(name = "MaintenanceStandard")
    public String getMaintenanceStandard() {
        return maintenanceStandard;
    }

    public void setMaintenanceStandard(String maintenanceStandard) {
        this.maintenanceStandard = maintenanceStandard;
    }

    @Basic
    @Column(name = "MaintenanceItem")
    public String getMaintenanceItem() {
        return maintenanceItem;
    }

    public void setMaintenanceItem(String maintenanceItem) {
        this.maintenanceItem = maintenanceItem;
    }

    @Basic
    @Column(name = "Executor")
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    @Basic
    @Column(name = "ResponsiblePerson")
    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    @Basic
    @Column(name = "Auditor")
    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    @Basic
    @Column(name = "AuditTime")
    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    @Basic
    @Column(name = "AuditOpinion")
    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    @Basic
    @Column(name = "ServiceTime")
    public Timestamp getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Timestamp serviceTime) {
        this.serviceTime = serviceTime;
    }

    @Basic
    @Column(name = "ServicePerson")
    public String getServicePerson() {
        return servicePerson;
    }

    public void setServicePerson(String servicePerson) {
        this.servicePerson = servicePerson;
    }

    @Basic
    @Column(name = "ServiceCost")
    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    @Basic
    @Column(name = "ServiceDetail")
    public String getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    @Basic
    @Column(name = "FinishDate")
    public Timestamp getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Timestamp finishDate) {
        this.finishDate = finishDate;
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
    @Column(name = "DeviceMaintenanceId")
    public Integer getDeviceMaintenanceId() {
        return deviceMaintenanceId;
    }

    public void setDeviceMaintenanceId(Integer deviceMaintenanceId) {
        this.deviceMaintenanceId = deviceMaintenanceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Devicemaintenanceplan that = (Devicemaintenanceplan) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdPersonId != null ? !createdPersonId.equals(that.createdPersonId) : that.createdPersonId != null)
            return false;
        if (planStartDate != null ? !planStartDate.equals(that.planStartDate) : that.planStartDate != null)
            return false;
        if (planEndDate != null ? !planEndDate.equals(that.planEndDate) : that.planEndDate != null) return false;
        if (estimatedCost != null ? !estimatedCost.equals(that.estimatedCost) : that.estimatedCost != null)
            return false;
        if (maintenanceLevel != null ? !maintenanceLevel.equals(that.maintenanceLevel) : that.maintenanceLevel != null)
            return false;
        if (maintenanceStandard != null ? !maintenanceStandard.equals(that.maintenanceStandard) : that.maintenanceStandard != null)
            return false;
        if (maintenanceItem != null ? !maintenanceItem.equals(that.maintenanceItem) : that.maintenanceItem != null)
            return false;
        if (executor != null ? !executor.equals(that.executor) : that.executor != null) return false;
        if (responsiblePerson != null ? !responsiblePerson.equals(that.responsiblePerson) : that.responsiblePerson != null)
            return false;
        if (auditor != null ? !auditor.equals(that.auditor) : that.auditor != null) return false;
        if (auditTime != null ? !auditTime.equals(that.auditTime) : that.auditTime != null) return false;
        if (auditOpinion != null ? !auditOpinion.equals(that.auditOpinion) : that.auditOpinion != null) return false;
        if (serviceTime != null ? !serviceTime.equals(that.serviceTime) : that.serviceTime != null) return false;
        if (servicePerson != null ? !servicePerson.equals(that.servicePerson) : that.servicePerson != null)
            return false;
        if (serviceCost != null ? !serviceCost.equals(that.serviceCost) : that.serviceCost != null) return false;
        if (serviceDetail != null ? !serviceDetail.equals(that.serviceDetail) : that.serviceDetail != null)
            return false;
        if (finishDate != null ? !finishDate.equals(that.finishDate) : that.finishDate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (deviceMaintenanceId != null ? !deviceMaintenanceId.equals(that.deviceMaintenanceId) : that.deviceMaintenanceId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdPersonId != null ? createdPersonId.hashCode() : 0);
        result = 31 * result + (planStartDate != null ? planStartDate.hashCode() : 0);
        result = 31 * result + (planEndDate != null ? planEndDate.hashCode() : 0);
        result = 31 * result + (estimatedCost != null ? estimatedCost.hashCode() : 0);
        result = 31 * result + (maintenanceLevel != null ? maintenanceLevel.hashCode() : 0);
        result = 31 * result + (maintenanceStandard != null ? maintenanceStandard.hashCode() : 0);
        result = 31 * result + (maintenanceItem != null ? maintenanceItem.hashCode() : 0);
        result = 31 * result + (executor != null ? executor.hashCode() : 0);
        result = 31 * result + (responsiblePerson != null ? responsiblePerson.hashCode() : 0);
        result = 31 * result + (auditor != null ? auditor.hashCode() : 0);
        result = 31 * result + (auditTime != null ? auditTime.hashCode() : 0);
        result = 31 * result + (auditOpinion != null ? auditOpinion.hashCode() : 0);
        result = 31 * result + (serviceTime != null ? serviceTime.hashCode() : 0);
        result = 31 * result + (servicePerson != null ? servicePerson.hashCode() : 0);
        result = 31 * result + (serviceCost != null ? serviceCost.hashCode() : 0);
        result = 31 * result + (serviceDetail != null ? serviceDetail.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (deviceMaintenanceId != null ? deviceMaintenanceId.hashCode() : 0);
        return result;
    }
}
