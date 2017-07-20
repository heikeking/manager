package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "metadata_shellfeaturerecord", schema = "demo", catalog = "")
public class MetadataShellfeaturerecord {
    private Integer id;
    private String name;
    private Integer shellDescriptorRecordId;

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
    @Column(name = "ShellDescriptorRecord_id")
    public Integer getShellDescriptorRecordId() {
        return shellDescriptorRecordId;
    }

    public void setShellDescriptorRecordId(Integer shellDescriptorRecordId) {
        this.shellDescriptorRecordId = shellDescriptorRecordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataShellfeaturerecord that = (MetadataShellfeaturerecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (shellDescriptorRecordId != null ? !shellDescriptorRecordId.equals(that.shellDescriptorRecordId) : that.shellDescriptorRecordId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shellDescriptorRecordId != null ? shellDescriptorRecordId.hashCode() : 0);
        return result;
    }
}
