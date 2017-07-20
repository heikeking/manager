package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Rolespermissions {
    private Integer id;
    private Integer roleId;
    private Integer permissionId;
    private Integer roleRecordId;
    private Integer accessLevel;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Role_id")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "Permission_id")
    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "RoleRecord_Id")
    public Integer getRoleRecordId() {
        return roleRecordId;
    }

    public void setRoleRecordId(Integer roleRecordId) {
        this.roleRecordId = roleRecordId;
    }

    @Basic
    @Column(name = "AccessLevel")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rolespermissions that = (Rolespermissions) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (permissionId != null ? !permissionId.equals(that.permissionId) : that.permissionId != null) return false;
        if (roleRecordId != null ? !roleRecordId.equals(that.roleRecordId) : that.roleRecordId != null) return false;
        if (accessLevel != null ? !accessLevel.equals(that.accessLevel) : that.accessLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (permissionId != null ? permissionId.hashCode() : 0);
        result = 31 * result + (roleRecordId != null ? roleRecordId.hashCode() : 0);
        result = 31 * result + (accessLevel != null ? accessLevel.hashCode() : 0);
        return result;
    }
}
