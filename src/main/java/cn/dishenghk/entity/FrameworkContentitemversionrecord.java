package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "framework_contentitemversionrecord", schema = "demo", catalog = "")
public class FrameworkContentitemversionrecord {
    private Integer id;
    private Integer number;
    private Byte published;
    private Byte latest;
    private String data;
    private Integer contentItemRecordId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "Published")
    public Byte getPublished() {
        return published;
    }

    public void setPublished(Byte published) {
        this.published = published;
    }

    @Basic
    @Column(name = "Latest")
    public Byte getLatest() {
        return latest;
    }

    public void setLatest(Byte latest) {
        this.latest = latest;
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
    @Column(name = "ContentItemRecord_id")
    public Integer getContentItemRecordId() {
        return contentItemRecordId;
    }

    public void setContentItemRecordId(Integer contentItemRecordId) {
        this.contentItemRecordId = contentItemRecordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FrameworkContentitemversionrecord that = (FrameworkContentitemversionrecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (published != null ? !published.equals(that.published) : that.published != null) return false;
        if (latest != null ? !latest.equals(that.latest) : that.latest != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (contentItemRecordId != null ? !contentItemRecordId.equals(that.contentItemRecordId) : that.contentItemRecordId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (published != null ? published.hashCode() : 0);
        result = 31 * result + (latest != null ? latest.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (contentItemRecordId != null ? contentItemRecordId.hashCode() : 0);
        return result;
    }
}
