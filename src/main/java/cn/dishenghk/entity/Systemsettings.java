package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Systemsettings {
    private Integer id;
    private Integer roundingMode;
    private Integer decimalDigit;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RoundingMode")
    public Integer getRoundingMode() {
        return roundingMode;
    }

    public void setRoundingMode(Integer roundingMode) {
        this.roundingMode = roundingMode;
    }

    @Basic
    @Column(name = "DecimalDigit")
    public Integer getDecimalDigit() {
        return decimalDigit;
    }

    public void setDecimalDigit(Integer decimalDigit) {
        this.decimalDigit = decimalDigit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Systemsettings that = (Systemsettings) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (roundingMode != null ? !roundingMode.equals(that.roundingMode) : that.roundingMode != null) return false;
        if (decimalDigit != null ? !decimalDigit.equals(that.decimalDigit) : that.decimalDigit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (roundingMode != null ? roundingMode.hashCode() : 0);
        result = 31 * result + (decimalDigit != null ? decimalDigit.hashCode() : 0);
        return result;
    }
}
