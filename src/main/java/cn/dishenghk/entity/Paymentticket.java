package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Paymentticket {
    private Integer id;
    private Integer paymentId;
    private Integer ticketId;
    private String ticketNumber;
    private String status;
    private String templateType;
    private Integer organizationItemId;
    private Integer paidMethod;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PaymentId")
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    @Basic
    @Column(name = "TicketId")
    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    @Basic
    @Column(name = "TicketNumber")
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "TemplateType")
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    @Basic
    @Column(name = "OrganizationItemId")
    public Integer getOrganizationItemId() {
        return organizationItemId;
    }

    public void setOrganizationItemId(Integer organizationItemId) {
        this.organizationItemId = organizationItemId;
    }

    @Basic
    @Column(name = "PaidMethod")
    public Integer getPaidMethod() {
        return paidMethod;
    }

    public void setPaidMethod(Integer paidMethod) {
        this.paidMethod = paidMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paymentticket that = (Paymentticket) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;
        if (ticketId != null ? !ticketId.equals(that.ticketId) : that.ticketId != null) return false;
        if (ticketNumber != null ? !ticketNumber.equals(that.ticketNumber) : that.ticketNumber != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (templateType != null ? !templateType.equals(that.templateType) : that.templateType != null) return false;
        if (organizationItemId != null ? !organizationItemId.equals(that.organizationItemId) : that.organizationItemId != null)
            return false;
        if (paidMethod != null ? !paidMethod.equals(that.paidMethod) : that.paidMethod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        result = 31 * result + (ticketId != null ? ticketId.hashCode() : 0);
        result = 31 * result + (ticketNumber != null ? ticketNumber.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (templateType != null ? templateType.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        result = 31 * result + (paidMethod != null ? paidMethod.hashCode() : 0);
        return result;
    }
}
