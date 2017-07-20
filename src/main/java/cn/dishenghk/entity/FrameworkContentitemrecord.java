package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "framework_contentitemrecord", schema = "demo", catalog = "")
public class FrameworkContentitemrecord {
    private Integer id;
    private String data;
    private Integer contentTypeId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Basic
    @Column(name = "ContentType_id")
    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FrameworkContentitemrecord that = (FrameworkContentitemrecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (contentTypeId != null ? !contentTypeId.equals(that.contentTypeId) : that.contentTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (contentTypeId != null ? contentTypeId.hashCode() : 0);
        return result;
    }
}
