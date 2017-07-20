package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Staff {
    private Integer id;
    private Integer regionId;
    private String name;
    private String sex;
    private String origin;
    private String position;
    private String duty;
    private String tel;
    private String address;
    private Integer degree;
    private String idCardNo;
    private Timestamp birthday;
    private Timestamp joinDate;
    private Timestamp leaveDate;
    private String remark;
    private Integer userId;
    private Integer organizationItemId;
    private Integer staffStatus;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RegionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
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
    @Column(name = "Sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "Origin")
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Basic
    @Column(name = "Position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "Duty")
    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Basic
    @Column(name = "Tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Degree")
    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "IdCardNo")
    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    @Basic
    @Column(name = "Birthday")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "JoinDate")
    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    @Basic
    @Column(name = "LeaveDate")
    public Timestamp getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Timestamp leaveDate) {
        this.leaveDate = leaveDate;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "UserId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "OrganizationItemId")
    public Integer getOrganizationItemId() {
        return organizationItemId;
    }

    public void setOrganizationItemId(Integer organizationItemId) {
        this.organizationItemId = organizationItemId;
    }

    @Basic
    @Column(name = "StaffStatus")
    public Integer getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(Integer staffStatus) {
        this.staffStatus = staffStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (id != null ? !id.equals(staff.id) : staff.id != null) return false;
        if (regionId != null ? !regionId.equals(staff.regionId) : staff.regionId != null) return false;
        if (name != null ? !name.equals(staff.name) : staff.name != null) return false;
        if (sex != null ? !sex.equals(staff.sex) : staff.sex != null) return false;
        if (origin != null ? !origin.equals(staff.origin) : staff.origin != null) return false;
        if (position != null ? !position.equals(staff.position) : staff.position != null) return false;
        if (duty != null ? !duty.equals(staff.duty) : staff.duty != null) return false;
        if (tel != null ? !tel.equals(staff.tel) : staff.tel != null) return false;
        if (address != null ? !address.equals(staff.address) : staff.address != null) return false;
        if (degree != null ? !degree.equals(staff.degree) : staff.degree != null) return false;
        if (idCardNo != null ? !idCardNo.equals(staff.idCardNo) : staff.idCardNo != null) return false;
        if (birthday != null ? !birthday.equals(staff.birthday) : staff.birthday != null) return false;
        if (joinDate != null ? !joinDate.equals(staff.joinDate) : staff.joinDate != null) return false;
        if (leaveDate != null ? !leaveDate.equals(staff.leaveDate) : staff.leaveDate != null) return false;
        if (remark != null ? !remark.equals(staff.remark) : staff.remark != null) return false;
        if (userId != null ? !userId.equals(staff.userId) : staff.userId != null) return false;
        if (organizationItemId != null ? !organizationItemId.equals(staff.organizationItemId) : staff.organizationItemId != null)
            return false;
        if (staffStatus != null ? !staffStatus.equals(staff.staffStatus) : staff.staffStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (duty != null ? duty.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (degree != null ? degree.hashCode() : 0);
        result = 31 * result + (idCardNo != null ? idCardNo.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
        result = 31 * result + (leaveDate != null ? leaveDate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (organizationItemId != null ? organizationItemId.hashCode() : 0);
        result = 31 * result + (staffStatus != null ? staffStatus.hashCode() : 0);
        return result;
    }
}
