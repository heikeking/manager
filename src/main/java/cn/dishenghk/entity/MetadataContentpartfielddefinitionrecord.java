package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "metadata_contentpartfielddefinitionrecord", schema = "demo", catalog = "")
public class MetadataContentpartfielddefinitionrecord {
    private Integer id;
    private String name;
    private String settings;
    private Integer contentFieldDefinitionRecordId;
    private Integer contentPartDefinitionRecordId;

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
    @Column(name = "Settings")
    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Basic
    @Column(name = "ContentFieldDefinitionRecord_id")
    public Integer getContentFieldDefinitionRecordId() {
        return contentFieldDefinitionRecordId;
    }

    public void setContentFieldDefinitionRecordId(Integer contentFieldDefinitionRecordId) {
        this.contentFieldDefinitionRecordId = contentFieldDefinitionRecordId;
    }

    @Basic
    @Column(name = "ContentPartDefinitionRecord_Id")
    public Integer getContentPartDefinitionRecordId() {
        return contentPartDefinitionRecordId;
    }

    public void setContentPartDefinitionRecordId(Integer contentPartDefinitionRecordId) {
        this.contentPartDefinitionRecordId = contentPartDefinitionRecordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataContentpartfielddefinitionrecord that = (MetadataContentpartfielddefinitionrecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (settings != null ? !settings.equals(that.settings) : that.settings != null) return false;
        if (contentFieldDefinitionRecordId != null ? !contentFieldDefinitionRecordId.equals(that.contentFieldDefinitionRecordId) : that.contentFieldDefinitionRecordId != null)
            return false;
        if (contentPartDefinitionRecordId != null ? !contentPartDefinitionRecordId.equals(that.contentPartDefinitionRecordId) : that.contentPartDefinitionRecordId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (settings != null ? settings.hashCode() : 0);
        result = 31 * result + (contentFieldDefinitionRecordId != null ? contentFieldDefinitionRecordId.hashCode() : 0);
        result = 31 * result + (contentPartDefinitionRecordId != null ? contentPartDefinitionRecordId.hashCode() : 0);
        return result;
    }
}
