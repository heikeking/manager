package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Arrays;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Reporttemplate {
    private Integer id;
    private String reportId;
    private byte[] reportLayout;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ReportId")
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "ReportLayout")
    public byte[] getReportLayout() {
        return reportLayout;
    }

    public void setReportLayout(byte[] reportLayout) {
        this.reportLayout = reportLayout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reporttemplate that = (Reporttemplate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (reportId != null ? !reportId.equals(that.reportId) : that.reportId != null) return false;
        if (!Arrays.equals(reportLayout, that.reportLayout)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (reportId != null ? reportId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(reportLayout);
        return result;
    }
}
