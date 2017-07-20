package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Smsuser {
    private Integer id;
    private Integer regionId;
    private String name;
    private String password;
    private String phone;
    private String apikey;
    private Byte autoSendBirthdayMsg;
    private Byte autoSendHolidayMsg;

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
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "APIKEY")
    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @Basic
    @Column(name = "AutoSendBirthdayMsg")
    public Byte getAutoSendBirthdayMsg() {
        return autoSendBirthdayMsg;
    }

    public void setAutoSendBirthdayMsg(Byte autoSendBirthdayMsg) {
        this.autoSendBirthdayMsg = autoSendBirthdayMsg;
    }

    @Basic
    @Column(name = "AutoSendHolidayMsg")
    public Byte getAutoSendHolidayMsg() {
        return autoSendHolidayMsg;
    }

    public void setAutoSendHolidayMsg(Byte autoSendHolidayMsg) {
        this.autoSendHolidayMsg = autoSendHolidayMsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smsuser smsuser = (Smsuser) o;

        if (id != null ? !id.equals(smsuser.id) : smsuser.id != null) return false;
        if (regionId != null ? !regionId.equals(smsuser.regionId) : smsuser.regionId != null) return false;
        if (name != null ? !name.equals(smsuser.name) : smsuser.name != null) return false;
        if (password != null ? !password.equals(smsuser.password) : smsuser.password != null) return false;
        if (phone != null ? !phone.equals(smsuser.phone) : smsuser.phone != null) return false;
        if (apikey != null ? !apikey.equals(smsuser.apikey) : smsuser.apikey != null) return false;
        if (autoSendBirthdayMsg != null ? !autoSendBirthdayMsg.equals(smsuser.autoSendBirthdayMsg) : smsuser.autoSendBirthdayMsg != null)
            return false;
        if (autoSendHolidayMsg != null ? !autoSendHolidayMsg.equals(smsuser.autoSendHolidayMsg) : smsuser.autoSendHolidayMsg != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (apikey != null ? apikey.hashCode() : 0);
        result = 31 * result + (autoSendBirthdayMsg != null ? autoSendBirthdayMsg.hashCode() : 0);
        result = 31 * result + (autoSendHolidayMsg != null ? autoSendHolidayMsg.hashCode() : 0);
        return result;
    }
}
