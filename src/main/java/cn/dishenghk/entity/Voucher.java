package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Voucher {
    private Integer id;
    private String voucherNo;
    private Integer operatorId;
    private Integer supplierId;
    private Timestamp date;
    private String remark;
    private Integer operation;
    private Integer organizationItemId;

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
    @Column(name = "OperatorId")
    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "SupplierId")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "Operation")
    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "OrganizationItemId")
    public Integer getOrganizationItemId() {
        return organizationItemId;
    }

    public void setOrganizationItemId(Integer organizationItemId) {
        this.organizationItemId = organizationItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voucher voucher = (Voucher) o;

        if (id != null ? !id.equals(voucher.id) : voucher.id != null) return false;
        if (voucherNo != null ? !voucherNo.equals(voucher.voucherNo) : voucher.voucherNo != null) return false;
        if (operatorId != null ? !operatorId.equals(voucher.operatorId) : voucher.operatorId != null) return false;
        if (supplierId != null ? !supplierId.equals(voucher.supplierId) : voucher.supplierId != null) return false;
        if (date != null ? !date.equals(voucher.date) : voucher.date != null) return false;
        if (remark != null ? !remark.equals(voucher.remark) : voucher.remark != null) return false;
        if (operation != null ? !operation.equals(voucher.operation) : voucher.operation != null) return false;
        if (organizationItemId != null ? !organizationItemId.equals(voucher.organizationItemId) : voucher.organizationItemId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (voucherNo != null ? voucherNo.hashCode() : 0);
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (supplierId != null ? supplierId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        return result;
    }
}
