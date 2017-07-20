package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bankdiskettetemplate {
    private Integer id;
    private String name;
    private Integer bankId;
    private Double commission;
    private String exportSummaryFileName;
    private String exportFileName;
    private Integer exportTotalRowOption;
    private Byte exportPrintRequred;
    private Integer exportFileType;
    private Integer reportTemplateId;
    private Integer importTotalRowOption;
    private Integer importFileType;
    private String description;
    private Byte isActive;
    private Integer createdById;
    private Timestamp createdOn;
    private Integer lastUpdatedById;
    private Timestamp lastUpdatedOn;

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
    @Column(name = "BankId")
    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    @Basic
    @Column(name = "Commission")
    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    @Basic
    @Column(name = "ExportSummaryFileName")
    public String getExportSummaryFileName() {
        return exportSummaryFileName;
    }

    public void setExportSummaryFileName(String exportSummaryFileName) {
        this.exportSummaryFileName = exportSummaryFileName;
    }

    @Basic
    @Column(name = "ExportFileName")
    public String getExportFileName() {
        return exportFileName;
    }

    public void setExportFileName(String exportFileName) {
        this.exportFileName = exportFileName;
    }

    @Basic
    @Column(name = "ExportTotalRowOption")
    public Integer getExportTotalRowOption() {
        return exportTotalRowOption;
    }

    public void setExportTotalRowOption(Integer exportTotalRowOption) {
        this.exportTotalRowOption = exportTotalRowOption;
    }

    @Basic
    @Column(name = "ExportPrintRequred")
    public Byte getExportPrintRequred() {
        return exportPrintRequred;
    }

    public void setExportPrintRequred(Byte exportPrintRequred) {
        this.exportPrintRequred = exportPrintRequred;
    }

    @Basic
    @Column(name = "ExportFileType")
    public Integer getExportFileType() {
        return exportFileType;
    }

    public void setExportFileType(Integer exportFileType) {
        this.exportFileType = exportFileType;
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
    @Column(name = "ImportTotalRowOption")
    public Integer getImportTotalRowOption() {
        return importTotalRowOption;
    }

    public void setImportTotalRowOption(Integer importTotalRowOption) {
        this.importTotalRowOption = importTotalRowOption;
    }

    @Basic
    @Column(name = "ImportFileType")
    public Integer getImportFileType() {
        return importFileType;
    }

    public void setImportFileType(Integer importFileType) {
        this.importFileType = importFileType;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "IsActive")
    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "CreatedById")
    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    @Basic
    @Column(name = "CreatedOn")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "LastUpdatedById")
    public Integer getLastUpdatedById() {
        return lastUpdatedById;
    }

    public void setLastUpdatedById(Integer lastUpdatedById) {
        this.lastUpdatedById = lastUpdatedById;
    }

    @Basic
    @Column(name = "LastUpdatedOn")
    public Timestamp getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bankdiskettetemplate that = (Bankdiskettetemplate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (bankId != null ? !bankId.equals(that.bankId) : that.bankId != null) return false;
        if (commission != null ? !commission.equals(that.commission) : that.commission != null) return false;
        if (exportSummaryFileName != null ? !exportSummaryFileName.equals(that.exportSummaryFileName) : that.exportSummaryFileName != null)
            return false;
        if (exportFileName != null ? !exportFileName.equals(that.exportFileName) : that.exportFileName != null)
            return false;
        if (exportTotalRowOption != null ? !exportTotalRowOption.equals(that.exportTotalRowOption) : that.exportTotalRowOption != null)
            return false;
        if (exportPrintRequred != null ? !exportPrintRequred.equals(that.exportPrintRequred) : that.exportPrintRequred != null)
            return false;
        if (exportFileType != null ? !exportFileType.equals(that.exportFileType) : that.exportFileType != null)
            return false;
        if (reportTemplateId != null ? !reportTemplateId.equals(that.reportTemplateId) : that.reportTemplateId != null)
            return false;
        if (importTotalRowOption != null ? !importTotalRowOption.equals(that.importTotalRowOption) : that.importTotalRowOption != null)
            return false;
        if (importFileType != null ? !importFileType.equals(that.importFileType) : that.importFileType != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (createdById != null ? !createdById.equals(that.createdById) : that.createdById != null) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (lastUpdatedById != null ? !lastUpdatedById.equals(that.lastUpdatedById) : that.lastUpdatedById != null)
            return false;
        if (lastUpdatedOn != null ? !lastUpdatedOn.equals(that.lastUpdatedOn) : that.lastUpdatedOn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (commission != null ? commission.hashCode() : 0);
        result = 31 * result + (exportSummaryFileName != null ? exportSummaryFileName.hashCode() : 0);
        result = 31 * result + (exportFileName != null ? exportFileName.hashCode() : 0);
        result = 31 * result + (exportTotalRowOption != null ? exportTotalRowOption.hashCode() : 0);
        result = 31 * result + (exportPrintRequred != null ? exportPrintRequred.hashCode() : 0);
        result = 31 * result + (exportFileType != null ? exportFileType.hashCode() : 0);
        result = 31 * result + (reportTemplateId != null ? reportTemplateId.hashCode() : 0);
        result = 31 * result + (importTotalRowOption != null ? importTotalRowOption.hashCode() : 0);
        result = 31 * result + (importFileType != null ? importFileType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (createdById != null ? createdById.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (lastUpdatedById != null ? lastUpdatedById.hashCode() : 0);
        result = 31 * result + (lastUpdatedOn != null ? lastUpdatedOn.hashCode() : 0);
        return result;
    }
}
