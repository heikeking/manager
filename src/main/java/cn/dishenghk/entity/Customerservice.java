package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Customerservice {
    private Integer id;
    private String voucherNo;
    private Integer regionId;
    private Integer houseId;
    private Integer serviceSource;
    private Integer priority;
    private Integer status;
    private String customerName;
    private String phone;
    private Timestamp finishTimeRequired;
    private Timestamp acceptedDate;
    private String details;
    private Integer serviceType;
    private Integer customerId;
    private Timestamp appointmentTime;
    private Integer acceptedById;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "VoucherNo")
    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
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
    @Column(name = "HouseId")
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "ServiceSource")
    public Integer getServiceSource() {
        return serviceSource;
    }

    public void setServiceSource(Integer serviceSource) {
        this.serviceSource = serviceSource;
    }

    @Basic
    @Column(name = "Priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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
    @Column(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "FinishTimeRequired")
    public Timestamp getFinishTimeRequired() {
        return finishTimeRequired;
    }

    public void setFinishTimeRequired(Timestamp finishTimeRequired) {
        this.finishTimeRequired = finishTimeRequired;
    }

    @Basic
    @Column(name = "AcceptedDate")
    public Timestamp getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(Timestamp acceptedDate) {
        this.acceptedDate = acceptedDate;
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
    @Column(name = "ServiceType")
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    @Basic
    @Column(name = "CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "AppointmentTime")
    public Timestamp getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Timestamp appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Basic
    @Column(name = "AcceptedById")
    public Integer getAcceptedById() {
        return acceptedById;
    }

    public void setAcceptedById(Integer acceptedById) {
        this.acceptedById = acceptedById;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customerservice that = (Customerservice) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (voucherNo != null ? !voucherNo.equals(that.voucherNo) : that.voucherNo != null) return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;
        if (serviceSource != null ? !serviceSource.equals(that.serviceSource) : that.serviceSource != null)
            return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (finishTimeRequired != null ? !finishTimeRequired.equals(that.finishTimeRequired) : that.finishTimeRequired != null)
            return false;
        if (acceptedDate != null ? !acceptedDate.equals(that.acceptedDate) : that.acceptedDate != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (serviceType != null ? !serviceType.equals(that.serviceType) : that.serviceType != null) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (appointmentTime != null ? !appointmentTime.equals(that.appointmentTime) : that.appointmentTime != null)
            return false;
        if (acceptedById != null ? !acceptedById.equals(that.acceptedById) : that.acceptedById != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (voucherNo != null ? voucherNo.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        result = 31 * result + (serviceSource != null ? serviceSource.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (finishTimeRequired != null ? finishTimeRequired.hashCode() : 0);
        result = 31 * result + (acceptedDate != null ? acceptedDate.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (serviceType != null ? serviceType.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (appointmentTime != null ? appointmentTime.hashCode() : 0);
        result = 31 * result + (acceptedById != null ? acceptedById.hashCode() : 0);
        return result;
    }
}
