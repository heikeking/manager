package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "metadata_contenttypedefinitionrecord", schema = "demo", catalog = "")
public class MetadataContenttypedefinitionrecord {
    private Integer id;
    private String name;
    private String displayName;
    private String settings;

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
    @Column(name = "DisplayName")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Basic
    @Column(name = "Settings")
    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataContenttypedefinitionrecord that = (MetadataContenttypedefinitionrecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (settings != null ? !settings.equals(that.settings) : that.settings != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (settings != null ? settings.hashCode() : 0);
        return result;
    }
}
