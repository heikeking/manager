package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Smssend {
    private Integer id;
    private String mobile;
    private String content;
    private Integer smsNumber;
    private Integer status;
    private Timestamp sendDate;
    private Integer operatorId;
    private String errorMessage;
    private Integer templateCategory;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "SMSNumber")
    public Integer getSmsNumber() {
        return smsNumber;
    }

    public void setSmsNumber(Integer smsNumber) {
        this.smsNumber = smsNumber;
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
    @Column(name = "SendDate")
    public Timestamp getSendDate() {
        return sendDate;
    }

    public void setSendDate(Timestamp sendDate) {
        this.sendDate = sendDate;
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
    @Column(name = "ErrorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Basic
    @Column(name = "TemplateCategory")
    public Integer getTemplateCategory() {
        return templateCategory;
    }

    public void setTemplateCategory(Integer templateCategory) {
        this.templateCategory = templateCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smssend smssend = (Smssend) o;

        if (id != null ? !id.equals(smssend.id) : smssend.id != null) return false;
        if (mobile != null ? !mobile.equals(smssend.mobile) : smssend.mobile != null) return false;
        if (content != null ? !content.equals(smssend.content) : smssend.content != null) return false;
        if (smsNumber != null ? !smsNumber.equals(smssend.smsNumber) : smssend.smsNumber != null) return false;
        if (status != null ? !status.equals(smssend.status) : smssend.status != null) return false;
        if (sendDate != null ? !sendDate.equals(smssend.sendDate) : smssend.sendDate != null) return false;
        if (operatorId != null ? !operatorId.equals(smssend.operatorId) : smssend.operatorId != null) return false;
        if (errorMessage != null ? !errorMessage.equals(smssend.errorMessage) : smssend.errorMessage != null)
            return false;
        if (templateCategory != null ? !templateCategory.equals(smssend.templateCategory) : smssend.templateCategory != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (smsNumber != null ? smsNumber.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sendDate != null ? sendDate.hashCode() : 0);
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (errorMessage != null ? errorMessage.hashCode() : 0);
        result = 31 * result + (templateCategory != null ? templateCategory.hashCode() : 0);
        return result;
    }
}
