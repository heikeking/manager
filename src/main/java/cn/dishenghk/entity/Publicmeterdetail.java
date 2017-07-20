package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Publicmeterdetail {
    private Integer id;
    private Integer publicMeterId;
    private Integer houseId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PublicMeterId")
    public Integer getPublicMeterId() {
        return publicMeterId;
    }

    public void setPublicMeterId(Integer publicMeterId) {
        this.publicMeterId = publicMeterId;
    }

    @Basic
    @Column(name = "HouseId")
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publicmeterdetail that = (Publicmeterdetail) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (publicMeterId != null ? !publicMeterId.equals(that.publicMeterId) : that.publicMeterId != null)
            return false;
        if (houseId != null ? !houseId.equals(that.houseId) : that.houseId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (publicMeterId != null ? publicMeterId.hashCode() : 0);
        result = 31 * result + (houseId != null ? houseId.hashCode() : 0);
        return result;
    }
}
