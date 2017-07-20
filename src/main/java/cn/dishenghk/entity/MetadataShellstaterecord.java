package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "metadata_shellstaterecord", schema = "demo", catalog = "")
public class MetadataShellstaterecord {
    private Integer id;
    private String unused;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Unused")
    public String getUnused() {
        return unused;
    }

    public void setUnused(String unused) {
        this.unused = unused;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataShellstaterecord that = (MetadataShellstaterecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (unused != null ? !unused.equals(that.unused) : that.unused != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (unused != null ? unused.hashCode() : 0);
        return result;
    }
}
