package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Dispatch {
    private Integer id;
    private Integer customerServiceId;
    private Integer assigneeId;
    private Timestamp createdDate;
    private String remark;
    private String address;
    private Integer createdById;
    private Integer chargeType;
    private Timestamp startDate;
    private Timestamp finishDate;
    private Integer status;
    private Timestamp printDate;
    private String processRemark;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CustomerServiceId")
    public Integer getCustomerServiceId() {
        return customerServiceId;
    }

    public void setCustomerServiceId(Integer customerServiceId) {
        this.customerServiceId = customerServiceId;
    }

    @Basic
    @Column(name = "AssigneeId")
    public Integer getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "ChargeType")
    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
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
    @Column(name = "PrintDate")
    public Timestamp getPrintDate() {
        return printDate;
    }

    public void setPrintDate(Timestamp printDate) {
        this.printDate = printDate;
    }

    @Basic
    @Column(name = "ProcessRemark")
    public String getProcessRemark() {
        return processRemark;
    }

    public void setProcessRemark(String processRemark) {
        this.processRemark = processRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dispatch dispatch = (Dispatch) o;

        if (id != null ? !id.equals(dispatch.id) : dispatch.id != null) return false;
        if (customerServiceId != null ? !customerServiceId.equals(dispatch.customerServiceId) : dispatch.customerServiceId != null)
            return false;
        if (assigneeId != null ? !assigneeId.equals(dispatch.assigneeId) : dispatch.assigneeId != null) return false;
        if (createdDate != null ? !createdDate.equals(dispatch.createdDate) : dispatch.createdDate != null)
            return false;
        if (remark != null ? !remark.equals(dispatch.remark) : dispatch.remark != null) return false;
        if (address != null ? !address.equals(dispatch.address) : dispatch.address != null) return false;
        if (createdById != null ? !createdById.equals(dispatch.createdById) : dispatch.createdById != null)
            return false;
        if (chargeType != null ? !chargeType.equals(dispatch.chargeType) : dispatch.chargeType != null) return false;
        if (startDate != null ? !startDate.equals(dispatch.startDate) : dispatch.startDate != null) return false;
        if (finishDate != null ? !finishDate.equals(dispatch.finishDate) : dispatch.finishDate != null) return false;
        if (status != null ? !status.equals(dispatch.status) : dispatch.status != null) return false;
        if (printDate != null ? !printDate.equals(dispatch.printDate) : dispatch.printDate != null) return false;
        if (processRemark != null ? !processRemark.equals(dispatch.processRemark) : dispatch.processRemark != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customerServiceId != null ? customerServiceId.hashCode() : 0);
        result = 31 * result + (assigneeId != null ? assigneeId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (createdById != null ? createdById.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (printDate != null ? printDate.hashCode() : 0);
        result = 31 * result + (processRemark != null ? processRemark.hashCode() : 0);
        return result;
    }
}
