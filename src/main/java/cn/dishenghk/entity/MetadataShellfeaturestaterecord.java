package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "metadata_shellfeaturestaterecord", schema = "demo", catalog = "")
public class MetadataShellfeaturestaterecord {
    private Integer id;
    private String name;
    private String installState;
    private String enableState;
    private Integer shellStateRecordId;

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
    @Column(name = "InstallState")
    public String getInstallState() {
        return installState;
    }

    public void setInstallState(String installState) {
        this.installState = installState;
    }

    @Basic
    @Column(name = "EnableState")
    public String getEnableState() {
        return enableState;
    }

    public void setEnableState(String enableState) {
        this.enableState = enableState;
    }

    @Basic
    @Column(name = "ShellStateRecord_Id")
    public Integer getShellStateRecordId() {
        return shellStateRecordId;
    }

    public void setShellStateRecordId(Integer shellStateRecordId) {
        this.shellStateRecordId = shellStateRecordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataShellfeaturestaterecord that = (MetadataShellfeaturestaterecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (installState != null ? !installState.equals(that.installState) : that.installState != null) return false;
        if (enableState != null ? !enableState.equals(that.enableState) : that.enableState != null) return false;
        if (shellStateRecordId != null ? !shellStateRecordId.equals(that.shellStateRecordId) : that.shellStateRecordId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (installState != null ? installState.hashCode() : 0);
        result = 31 * result + (enableState != null ? enableState.hashCode() : 0);
        result = 31 * result + (shellStateRecordId != null ? shellStateRecordId.hashCode() : 0);
        return result;
    }
}
