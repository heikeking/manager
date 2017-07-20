package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "framework_datamigrationrecord", schema = "demo", catalog = "")
public class FrameworkDatamigrationrecord {
    private Integer id;
    private String dataMigrationClass;
    private Integer version;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DataMigrationClass")
    public String getDataMigrationClass() {
        return dataMigrationClass;
    }

    public void setDataMigrationClass(String dataMigrationClass) {
        this.dataMigrationClass = dataMigrationClass;
    }

    @Basic
    @Column(name = "Version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FrameworkDatamigrationrecord that = (FrameworkDatamigrationrecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dataMigrationClass != null ? !dataMigrationClass.equals(that.dataMigrationClass) : that.dataMigrationClass != null)
            return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dataMigrationClass != null ? dataMigrationClass.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
