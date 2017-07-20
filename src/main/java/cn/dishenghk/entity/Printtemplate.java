package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Printtemplate {
    private Integer id;
    private String name;
    private String templateType;
    private Byte isJoin;
    private Integer tableRowCount;
    private Integer reportTemplateId;
    private Byte isGroupByChargeItemCategory;
    private Integer regionId;

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
    @Column(name = "TemplateType")
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    @Basic
    @Column(name = "IsJoin")
    public Byte getIsJoin() {
        return isJoin;
    }

    public void setIsJoin(Byte isJoin) {
        this.isJoin = isJoin;
    }

    @Basic
    @Column(name = "TableRowCount")
    public Integer getTableRowCount() {
        return tableRowCount;
    }

    public void setTableRowCount(Integer tableRowCount) {
        this.tableRowCount = tableRowCount;
    }

    @Basic
    @Column(name = "ReportTemplateId")
    public Integer getReportTemplateId() {
        return reportTemplateId;
    }

    public void setReportTemplateId(Integer reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
    }

    @Basic
    @Column(name = "IsGroupByChargeItemCategory")
    public Byte getIsGroupByChargeItemCategory() {
        return isGroupByChargeItemCategory;
    }

    public void setIsGroupByChargeItemCategory(Byte isGroupByChargeItemCategory) {
        this.isGroupByChargeItemCategory = isGroupByChargeItemCategory;
    }

    @Basic
    @Column(name = "RegionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Printtemplate that = (Printtemplate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (templateType != null ? !templateType.equals(that.templateType) : that.templateType != null) return false;
        if (isJoin != null ? !isJoin.equals(that.isJoin) : that.isJoin != null) return false;
        if (tableRowCount != null ? !tableRowCount.equals(that.tableRowCount) : that.tableRowCount != null)
            return false;
        if (reportTemplateId != null ? !reportTemplateId.equals(that.reportTemplateId) : that.reportTemplateId != null)
            return false;
        if (isGroupByChargeItemCategory != null ? !isGroupByChargeItemCategory.equals(that.isGroupByChargeItemCategory) : that.isGroupByChargeItemCategory != null)
            return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (templateType != null ? templateType.hashCode() : 0);
        result = 31 * result + (isJoin != null ? isJoin.hashCode() : 0);
        result = 31 * result + (tableRowCount != null ? tableRowCount.hashCode() : 0);
        result = 31 * result + (reportTemplateId != null ? reportTemplateId.hashCode() : 0);
        result = 31 * result + (isGroupByChargeItemCategory != null ? isGroupByChargeItemCategory.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        return result;
    }
}
