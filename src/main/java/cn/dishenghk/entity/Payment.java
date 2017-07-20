package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Payment {
    private Integer id;
    private Integer customerId;
    private Double paidMoney;
    private Timestamp paidDate;
    private String ticketType;
    private String ticketNo;
    private Integer operatorId;
    private Integer status;
    private Double receivableAmount;
    private Integer regionId;
    private String remark;
    private String invoiceNumber;
    private Double smallChange;
    private Double smallChangeAccountPaidAmount;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "PaidMoney")
    public Double getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(Double paidMoney) {
        this.paidMoney = paidMoney;
    }

    @Basic
    @Column(name = "PaidDate")
    public Timestamp getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Timestamp paidDate) {
        this.paidDate = paidDate;
    }

    @Basic
    @Column(name = "TicketType")
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Basic
    @Column(name = "TicketNo")
    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    @Basic
    @Column(name = "OperatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
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
    @Column(name = "ReceivableAmount")
    public Double getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(Double receivableAmount) {
        this.receivableAmount = receivableAmount;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "InvoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Basic
    @Column(name = "SmallChange")
    public Double getSmallChange() {
        return smallChange;
    }

    public void setSmallChange(Double smallChange) {
        this.smallChange = smallChange;
    }

    @Basic
    @Column(name = "SmallChangeAccountPaidAmount")
    public Double getSmallChangeAccountPaidAmount() {
        return smallChangeAccountPaidAmount;
    }

    public void setSmallChangeAccountPaidAmount(Double smallChangeAccountPaidAmount) {
        this.smallChangeAccountPaidAmount = smallChangeAccountPaidAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (id != null ? !id.equals(payment.id) : payment.id != null) return false;
        if (customerId != null ? !customerId.equals(payment.customerId) : payment.customerId != null) return false;
        if (paidMoney != null ? !paidMoney.equals(payment.paidMoney) : payment.paidMoney != null) return false;
        if (paidDate != null ? !paidDate.equals(payment.paidDate) : payment.paidDate != null) return false;
        if (ticketType != null ? !ticketType.equals(payment.ticketType) : payment.ticketType != null) return false;
        if (ticketNo != null ? !ticketNo.equals(payment.ticketNo) : payment.ticketNo != null) return false;
        if (operatorId != null ? !operatorId.equals(payment.operatorId) : payment.operatorId != null) return false;
        if (status != null ? !status.equals(payment.status) : payment.status != null) return false;
        if (receivableAmount != null ? !receivableAmount.equals(payment.receivableAmount) : payment.receivableAmount != null)
            return false;
        if (regionId != null ? !regionId.equals(payment.regionId) : payment.regionId != null) return false;
        if (remark != null ? !remark.equals(payment.remark) : payment.remark != null) return false;
        if (invoiceNumber != null ? !invoiceNumber.equals(payment.invoiceNumber) : payment.invoiceNumber != null)
            return false;
        if (smallChange != null ? !smallChange.equals(payment.smallChange) : payment.smallChange != null) return false;
        if (smallChangeAccountPaidAmount != null ? !smallChangeAccountPaidAmount.equals(payment.smallChangeAccountPaidAmount) : payment.smallChangeAccountPaidAmount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (paidMoney != null ? paidMoney.hashCode() : 0);
        result = 31 * result + (paidDate != null ? paidDate.hashCode() : 0);
        result = 31 * result + (ticketType != null ? ticketType.hashCode() : 0);
        result = 31 * result + (ticketNo != null ? ticketNo.hashCode() : 0);
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (receivableAmount != null ? receivableAmount.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (invoiceNumber != null ? invoiceNumber.hashCode() : 0);
        result = 31 * result + (smallChange != null ? smallChange.hashCode() : 0);
        result = 31 * result + (smallChangeAccountPaidAmount != null ? smallChangeAccountPaidAmount.hashCode() : 0);
        return result;
    }
}
