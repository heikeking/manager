package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Accountstatementitem {
    private Integer id;
    private Integer accountStatementId;
    private Integer paymentId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AccountStatementId")
    public Integer getAccountStatementId() {
        return accountStatementId;
    }

    public void setAccountStatementId(Integer accountStatementId) {
        this.accountStatementId = accountStatementId;
    }

    @Basic
    @Column(name = "PaymentId")
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accountstatementitem that = (Accountstatementitem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (accountStatementId != null ? !accountStatementId.equals(that.accountStatementId) : that.accountStatementId != null)
            return false;
        if (paymentId != null ? !paymentId.equals(that.paymentId) : that.paymentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accountStatementId != null ? accountStatementId.hashCode() : 0);
        result = 31 * result + (paymentId != null ? paymentId.hashCode() : 0);
        return result;
    }
}
