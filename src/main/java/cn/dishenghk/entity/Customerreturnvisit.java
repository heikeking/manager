package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Customerreturnvisit {
    private Integer id;
    private Integer departmentId;
    private String returnVisitPerson;
    private String returnVisitPhone;
    private Integer satisfaction;
    private String unsatisfyNote;
    private String remark;
    private Timestamp date;
    private Integer customerServiceId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DepartmentId")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "ReturnVisitPerson")
    public String getReturnVisitPerson() {
        return returnVisitPerson;
    }

    public void setReturnVisitPerson(String returnVisitPerson) {
        this.returnVisitPerson = returnVisitPerson;
    }

    @Basic
    @Column(name = "ReturnVisitPhone")
    public String getReturnVisitPhone() {
        return returnVisitPhone;
    }

    public void setReturnVisitPhone(String returnVisitPhone) {
        this.returnVisitPhone = returnVisitPhone;
    }

    @Basic
    @Column(name = "Satisfaction")
    public Integer getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Integer satisfaction) {
        this.satisfaction = satisfaction;
    }

    @Basic
    @Column(name = "UnsatisfyNote")
    public String getUnsatisfyNote() {
        return unsatisfyNote;
    }

    public void setUnsatisfyNote(String unsatisfyNote) {
        this.unsatisfyNote = unsatisfyNote;
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
    @Column(name = "Date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "CustomerServiceId")
    public Integer getCustomerServiceId() {
        return customerServiceId;
    }

    public void setCustomerServiceId(Integer customerServiceId) {
        this.customerServiceId = customerServiceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customerreturnvisit that = (Customerreturnvisit) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (returnVisitPerson != null ? !returnVisitPerson.equals(that.returnVisitPerson) : that.returnVisitPerson != null)
            return false;
        if (returnVisitPhone != null ? !returnVisitPhone.equals(that.returnVisitPhone) : that.returnVisitPhone != null)
            return false;
        if (satisfaction != null ? !satisfaction.equals(that.satisfaction) : that.satisfaction != null) return false;
        if (unsatisfyNote != null ? !unsatisfyNote.equals(that.unsatisfyNote) : that.unsatisfyNote != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (customerServiceId != null ? !customerServiceId.equals(that.customerServiceId) : that.customerServiceId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        result = 31 * result + (returnVisitPerson != null ? returnVisitPerson.hashCode() : 0);
        result = 31 * result + (returnVisitPhone != null ? returnVisitPhone.hashCode() : 0);
        result = 31 * result + (satisfaction != null ? satisfaction.hashCode() : 0);
        result = 31 * result + (unsatisfyNote != null ? unsatisfyNote.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (customerServiceId != null ? customerServiceId.hashCode() : 0);
        return result;
    }
}
