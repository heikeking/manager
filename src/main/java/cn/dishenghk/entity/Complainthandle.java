package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Complainthandle {
    private Integer id;
    private String handlePerson;
    private Integer resolved;
    private Timestamp handleDate;
    private String rectificationOpinion;
    private Integer satisfaction;
    private String solution;
    private String remark;
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
    @Column(name = "HandlePerson")
    public String getHandlePerson() {
        return handlePerson;
    }

    public void setHandlePerson(String handlePerson) {
        this.handlePerson = handlePerson;
    }

    @Basic
    @Column(name = "Resolved")
    public Integer getResolved() {
        return resolved;
    }

    public void setResolved(Integer resolved) {
        this.resolved = resolved;
    }

    @Basic
    @Column(name = "HandleDate")
    public Timestamp getHandleDate() {
        return handleDate;
    }

    public void setHandleDate(Timestamp handleDate) {
        this.handleDate = handleDate;
    }

    @Basic
    @Column(name = "RectificationOpinion")
    public String getRectificationOpinion() {
        return rectificationOpinion;
    }

    public void setRectificationOpinion(String rectificationOpinion) {
        this.rectificationOpinion = rectificationOpinion;
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
    @Column(name = "Solution")
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
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

        Complainthandle that = (Complainthandle) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (handlePerson != null ? !handlePerson.equals(that.handlePerson) : that.handlePerson != null) return false;
        if (resolved != null ? !resolved.equals(that.resolved) : that.resolved != null) return false;
        if (handleDate != null ? !handleDate.equals(that.handleDate) : that.handleDate != null) return false;
        if (rectificationOpinion != null ? !rectificationOpinion.equals(that.rectificationOpinion) : that.rectificationOpinion != null)
            return false;
        if (satisfaction != null ? !satisfaction.equals(that.satisfaction) : that.satisfaction != null) return false;
        if (solution != null ? !solution.equals(that.solution) : that.solution != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (customerServiceId != null ? !customerServiceId.equals(that.customerServiceId) : that.customerServiceId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (handlePerson != null ? handlePerson.hashCode() : 0);
        result = 31 * result + (resolved != null ? resolved.hashCode() : 0);
        result = 31 * result + (handleDate != null ? handleDate.hashCode() : 0);
        result = 31 * result + (rectificationOpinion != null ? rectificationOpinion.hashCode() : 0);
        result = 31 * result + (satisfaction != null ? satisfaction.hashCode() : 0);
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (customerServiceId != null ? customerServiceId.hashCode() : 0);
        return result;
    }
}
