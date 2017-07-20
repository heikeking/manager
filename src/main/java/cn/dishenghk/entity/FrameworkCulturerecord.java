package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "framework_culturerecord", schema = "demo", catalog = "")
public class FrameworkCulturerecord {
    private Integer id;
    private String culture;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Culture")
    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FrameworkCulturerecord that = (FrameworkCulturerecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (culture != null ? !culture.equals(that.culture) : that.culture != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (culture != null ? culture.hashCode() : 0);
        return result;
    }
}
