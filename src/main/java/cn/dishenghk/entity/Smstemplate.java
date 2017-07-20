package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Smstemplate {
    private Integer id;
    private String name;
    private Integer templateCategory;
    private Integer holidayName;
    private String content;
    private Integer tplId;
    private Integer checkStatus;
    private String checkFailReason;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "TemplateCategory")
    public Integer getTemplateCategory() {
        return templateCategory;
    }

    public void setTemplateCategory(Integer templateCategory) {
        this.templateCategory = templateCategory;
    }

    @Basic
    @Column(name = "HolidayName")
    public Integer getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(Integer holidayName) {
        this.holidayName = holidayName;
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
    @Column(name = "tpl_id")
    public Integer getTplId() {
        return tplId;
    }

    public void setTplId(Integer tplId) {
        this.tplId = tplId;
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
    @Column(name = "CheckFailReason")
    public String getCheckFailReason() {
        return checkFailReason;
    }

    public void setCheckFailReason(String checkFailReason) {
        this.checkFailReason = checkFailReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smstemplate that = (Smstemplate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (templateCategory != null ? !templateCategory.equals(that.templateCategory) : that.templateCategory != null)
            return false;
        if (holidayName != null ? !holidayName.equals(that.holidayName) : that.holidayName != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (tplId != null ? !tplId.equals(that.tplId) : that.tplId != null) return false;
        if (checkStatus != null ? !checkStatus.equals(that.checkStatus) : that.checkStatus != null) return false;
        if (checkFailReason != null ? !checkFailReason.equals(that.checkFailReason) : that.checkFailReason != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (templateCategory != null ? templateCategory.hashCode() : 0);
        result = 31 * result + (holidayName != null ? holidayName.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (tplId != null ? tplId.hashCode() : 0);
        result = 31 * result + (checkStatus != null ? checkStatus.hashCode() : 0);
        result = 31 * result + (checkFailReason != null ? checkFailReason.hashCode() : 0);
        return result;
    }
}
