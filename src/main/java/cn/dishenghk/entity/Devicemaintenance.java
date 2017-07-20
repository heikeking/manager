package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Devicemaintenance {
    private Integer id;
    private Integer deviceId;
    private Integer deviceMaintenancePlanId;
    private Timestamp startDate;
    private Timestamp endDate;
    private String person;
    private Double amount;
    private Double hour;
    private String items;
    private String details;
    private Byte isAssigned;
    private String assinedCompayName;
    private Timestamp auditDate;
    private String contactor;
    private String tel;
    private String auditPerson;
    private String auditOpinion;

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
    @Column(name = "DeviceMaintenancePlanId")
    public Integer getDeviceMaintenancePlanId() {
        return deviceMaintenancePlanId;
    }

    public void setDeviceMaintenancePlanId(Integer deviceMaintenancePlanId) {
        this.deviceMaintenancePlanId = deviceMaintenancePlanId;
    }

    @Basic
    @Column(name = "StartDate")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Person")
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Basic
    @Column(name = "Amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Hour")
    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    @Basic
    @Column(name = "Items")
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Basic
    @Column(name = "Details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
    @Column(name = "AssinedCompayName")
    public String getAssinedCompayName() {
        return assinedCompayName;
    }

    public void setAssinedCompayName(String assinedCompayName) {
        this.assinedCompayName = assinedCompayName;
    }

    @Basic
    @Column(name = "AuditDate")
    public Timestamp getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Timestamp auditDate) {
        this.auditDate = auditDate;
    }

    @Basic
    @Column(name = "Contactor")
    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    @Basic
    @Column(name = "Tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "AuditPerson")
    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson;
    }

    @Basic
    @Column(name = "AuditOpinion")
    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Devicemaintenance that = (Devicemaintenance) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (deviceMaintenancePlanId != null ? !deviceMaintenancePlanId.equals(that.deviceMaintenancePlanId) : that.deviceMaintenancePlanId != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (person != null ? !person.equals(that.person) : that.person != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (hour != null ? !hour.equals(that.hour) : that.hour != null) return false;
        if (items != null ? !items.equals(that.items) : that.items != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (isAssigned != null ? !isAssigned.equals(that.isAssigned) : that.isAssigned != null) return false;
        if (assinedCompayName != null ? !assinedCompayName.equals(that.assinedCompayName) : that.assinedCompayName != null)
            return false;
        if (auditDate != null ? !auditDate.equals(that.auditDate) : that.auditDate != null) return false;
        if (contactor != null ? !contactor.equals(that.contactor) : that.contactor != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (auditPerson != null ? !auditPerson.equals(that.auditPerson) : that.auditPerson != null) return false;
        if (auditOpinion != null ? !auditOpinion.equals(that.auditOpinion) : that.auditOpinion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (deviceMaintenancePlanId != null ? deviceMaintenancePlanId.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (hour != null ? hour.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (isAssigned != null ? isAssigned.hashCode() : 0);
        result = 31 * result + (assinedCompayName != null ? assinedCompayName.hashCode() : 0);
        result = 31 * result + (auditDate != null ? auditDate.hashCode() : 0);
        result = 31 * result + (contactor != null ? contactor.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (auditPerson != null ? auditPerson.hashCode() : 0);
        result = 31 * result + (auditOpinion != null ? auditOpinion.hashCode() : 0);
        return result;
    }
}
