package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Parkingplace {
    private Integer id;
    private Integer carbarnId;
    private Double parkingArea;
    private Byte isVirtual;
    private Byte isRentable;
    private Byte isRented;
    private Integer ownerId;
    private Byte isSold;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CarbarnId")
    public Integer getCarbarnId() {
        return carbarnId;
    }

    public void setCarbarnId(Integer carbarnId) {
        this.carbarnId = carbarnId;
    }

    @Basic
    @Column(name = "ParkingArea")
    public Double getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(Double parkingArea) {
        this.parkingArea = parkingArea;
    }

    @Basic
    @Column(name = "IsVirtual")
    public Byte getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Byte isVirtual) {
        this.isVirtual = isVirtual;
    }

    @Basic
    @Column(name = "IsRentable")
    public Byte getIsRentable() {
        return isRentable;
    }

    public void setIsRentable(Byte isRentable) {
        this.isRentable = isRentable;
    }

    @Basic
    @Column(name = "IsRented")
    public Byte getIsRented() {
        return isRented;
    }

    public void setIsRented(Byte isRented) {
        this.isRented = isRented;
    }

    @Basic
    @Column(name = "OwnerId")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "IsSold")
    public Byte getIsSold() {
        return isSold;
    }

    public void setIsSold(Byte isSold) {
        this.isSold = isSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parkingplace that = (Parkingplace) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (carbarnId != null ? !carbarnId.equals(that.carbarnId) : that.carbarnId != null) return false;
        if (parkingArea != null ? !parkingArea.equals(that.parkingArea) : that.parkingArea != null) return false;
        if (isVirtual != null ? !isVirtual.equals(that.isVirtual) : that.isVirtual != null) return false;
        if (isRentable != null ? !isRentable.equals(that.isRentable) : that.isRentable != null) return false;
        if (isRented != null ? !isRented.equals(that.isRented) : that.isRented != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (isSold != null ? !isSold.equals(that.isSold) : that.isSold != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (carbarnId != null ? carbarnId.hashCode() : 0);
        result = 31 * result + (parkingArea != null ? parkingArea.hashCode() : 0);
        result = 31 * result + (isVirtual != null ? isVirtual.hashCode() : 0);
        result = 31 * result + (isRentable != null ? isRentable.hashCode() : 0);
        result = 31 * result + (isRented != null ? isRented.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (isSold != null ? isSold.hashCode() : 0);
        return result;
    }
}
