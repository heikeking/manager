package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Metertype {
    private Integer id;
    private String name;
    private String description;
    private String unit;

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
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "Unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Metertype metertype = (Metertype) o;

        if (id != null ? !id.equals(metertype.id) : metertype.id != null) return false;
        if (name != null ? !name.equals(metertype.name) : metertype.name != null) return false;
        if (description != null ? !description.equals(metertype.description) : metertype.description != null)
            return false;
        if (unit != null ? !unit.equals(metertype.unit) : metertype.unit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}
