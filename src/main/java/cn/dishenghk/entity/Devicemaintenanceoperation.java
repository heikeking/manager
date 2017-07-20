package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Devicemaintenanceoperation {
    private Integer id;
    private Integer deviceId;
    private Timestamp checkDate;
    private String checkPerson;
    private Integer checkStatus;
    private String operational;
    private Timestamp repairDate;
    private String repairPerson;
    private Double repairCost;
    private Double repairHours;
    private String faultDetail;
    private String repairItem;
    private String treatment;
    private Timestamp finishDate;
    private String accepter;
    private Timestamp receptionTime;
    private Integer acceptStatus;

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
    @Column(name = "CheckDate")
    public Timestamp getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Timestamp checkDate) {
        this.checkDate = checkDate;
    }

    @Basic
    @Column(name = "CheckPerson")
    public String getCheckPerson() {
        return checkPerson;
    }

    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson;
    }

    @Basic
    @Column(name = "CheckStatus")
    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Basic
    @Column(name = "Operational")
    public String getOperational() {
        return operational;
    }

    public void setOperational(String operational) {
        this.operational = operational;
    }

    @Basic
    @Column(name = "RepairDate")
    public Timestamp getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Timestamp repairDate) {
        this.repairDate = repairDate;
    }

    @Basic
    @Column(name = "RepairPerson")
    public String getRepairPerson() {
        return repairPerson;
    }

    public void setRepairPerson(String repairPerson) {
        this.repairPerson = repairPerson;
    }

    @Basic
    @Column(name = "RepairCost")
    public Double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(Double repairCost) {
        this.repairCost = repairCost;
    }

    @Basic
    @Column(name = "RepairHours")
    public Double getRepairHours() {
        return repairHours;
    }

    public void setRepairHours(Double repairHours) {
        this.repairHours = repairHours;
    }

    @Basic
    @Column(name = "FaultDetail")
    public String getFaultDetail() {
        return faultDetail;
    }

    public void setFaultDetail(String faultDetail) {
        this.faultDetail = faultDetail;
    }

    @Basic
    @Column(name = "RepairItem")
    public String getRepairItem() {
        return repairItem;
    }

    public void setRepairItem(String repairItem) {
        this.repairItem = repairItem;
    }

    @Basic
    @Column(name = "Treatment")
    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
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
    @Column(name = "Accepter")
    public String getAccepter() {
        return accepter;
    }

    public void setAccepter(String accepter) {
        this.accepter = accepter;
    }

    @Basic
    @Column(name = "ReceptionTime")
    public Timestamp getReceptionTime() {
        return receptionTime;
    }

    public void setReceptionTime(Timestamp receptionTime) {
        this.receptionTime = receptionTime;
    }

    @Basic
    @Column(name = "AcceptStatus")
    public Integer getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(Integer acceptStatus) {
        this.acceptStatus = acceptStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Devicemaintenanceoperation that = (Devicemaintenanceoperation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (checkDate != null ? !checkDate.equals(that.checkDate) : that.checkDate != null) return false;
        if (checkPerson != null ? !checkPerson.equals(that.checkPerson) : that.checkPerson != null) return false;
        if (checkStatus != null ? !checkStatus.equals(that.checkStatus) : that.checkStatus != null) return false;
        if (operational != null ? !operational.equals(that.operational) : that.operational != null) return false;
        if (repairDate != null ? !repairDate.equals(that.repairDate) : that.repairDate != null) return false;
        if (repairPerson != null ? !repairPerson.equals(that.repairPerson) : that.repairPerson != null) return false;
        if (repairCost != null ? !repairCost.equals(that.repairCost) : that.repairCost != null) return false;
        if (repairHours != null ? !repairHours.equals(that.repairHours) : that.repairHours != null) return false;
        if (faultDetail != null ? !faultDetail.equals(that.faultDetail) : that.faultDetail != null) return false;
        if (repairItem != null ? !repairItem.equals(that.repairItem) : that.repairItem != null) return false;
        if (treatment != null ? !treatment.equals(that.treatment) : that.treatment != null) return false;
        if (finishDate != null ? !finishDate.equals(that.finishDate) : that.finishDate != null) return false;
        if (accepter != null ? !accepter.equals(that.accepter) : that.accepter != null) return false;
        if (receptionTime != null ? !receptionTime.equals(that.receptionTime) : that.receptionTime != null)
            return false;
        if (acceptStatus != null ? !acceptStatus.equals(that.acceptStatus) : that.acceptStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (checkDate != null ? checkDate.hashCode() : 0);
        result = 31 * result + (checkPerson != null ? checkPerson.hashCode() : 0);
        result = 31 * result + (checkStatus != null ? checkStatus.hashCode() : 0);
        result = 31 * result + (operational != null ? operational.hashCode() : 0);
        result = 31 * result + (repairDate != null ? repairDate.hashCode() : 0);
        result = 31 * result + (repairPerson != null ? repairPerson.hashCode() : 0);
        result = 31 * result + (repairCost != null ? repairCost.hashCode() : 0);
        result = 31 * result + (repairHours != null ? repairHours.hashCode() : 0);
        result = 31 * result + (faultDetail != null ? faultDetail.hashCode() : 0);
        result = 31 * result + (repairItem != null ? repairItem.hashCode() : 0);
        result = 31 * result + (treatment != null ? treatment.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        result = 31 * result + (accepter != null ? accepter.hashCode() : 0);
        result = 31 * result + (receptionTime != null ? receptionTime.hashCode() : 0);
        result = 31 * result + (acceptStatus != null ? acceptStatus.hashCode() : 0);
        return result;
    }
}
