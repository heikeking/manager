package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Pauseparkingplace {
    private Integer id;
    private Integer carParkingRegistrationId;
    private Timestamp pauseDate;
    private Timestamp reusedDate;
    private String remark;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CarParkingRegistrationId")
    public Integer getCarParkingRegistrationId() {
        return carParkingRegistrationId;
    }

    public void setCarParkingRegistrationId(Integer carParkingRegistrationId) {
        this.carParkingRegistrationId = carParkingRegistrationId;
    }

    @Basic
    @Column(name = "PauseDate")
    public Timestamp getPauseDate() {
        return pauseDate;
    }

    public void setPauseDate(Timestamp pauseDate) {
        this.pauseDate = pauseDate;
    }

    @Basic
    @Column(name = "ReusedDate")
    public Timestamp getReusedDate() {
        return reusedDate;
    }

    public void setReusedDate(Timestamp reusedDate) {
        this.reusedDate = reusedDate;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pauseparkingplace that = (Pauseparkingplace) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (carParkingRegistrationId != null ? !carParkingRegistrationId.equals(that.carParkingRegistrationId) : that.carParkingRegistrationId != null)
            return false;
        if (pauseDate != null ? !pauseDate.equals(that.pauseDate) : that.pauseDate != null) return false;
        if (reusedDate != null ? !reusedDate.equals(that.reusedDate) : that.reusedDate != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (carParkingRegistrationId != null ? carParkingRegistrationId.hashCode() : 0);
        result = 31 * result + (pauseDate != null ? pauseDate.hashCode() : 0);
        result = 31 * result + (reusedDate != null ? reusedDate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
