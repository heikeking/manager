package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Permission {
    private Integer id;
    private String name;
    private String featureName;
    private String description;
    private Integer permissionCategoryId;

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
    @Column(name = "FeatureName")
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
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
    @Column(name = "PermissionCategoryId")
    public Integer getPermissionCategoryId() {
        return permissionCategoryId;
    }

    public void setPermissionCategoryId(Integer permissionCategoryId) {
        this.permissionCategoryId = permissionCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission that = (Permission) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (featureName != null ? !featureName.equals(that.featureName) : that.featureName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (permissionCategoryId != null ? !permissionCategoryId.equals(that.permissionCategoryId) : that.permissionCategoryId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (featureName != null ? featureName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (permissionCategoryId != null ? permissionCategoryId.hashCode() : 0);
        return result;
    }
}
