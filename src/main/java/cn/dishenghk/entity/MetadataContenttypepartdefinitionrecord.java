package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
@Table(name = "metadata_contenttypepartdefinitionrecord", schema = "demo", catalog = "")
public class MetadataContenttypepartdefinitionrecord {
    private Integer id;
    private String settings;
    private Integer contentPartDefinitionRecordId;
    private Integer contentTypeDefinitionRecordId;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "ContentPartDefinitionRecord_id")
    public Integer getContentPartDefinitionRecordId() {
        return contentPartDefinitionRecordId;
    }

    public void setContentPartDefinitionRecordId(Integer contentPartDefinitionRecordId) {
        this.contentPartDefinitionRecordId = contentPartDefinitionRecordId;
    }

    @Basic
    @Column(name = "ContentTypeDefinitionRecord_Id")
    public Integer getContentTypeDefinitionRecordId() {
        return contentTypeDefinitionRecordId;
    }

    public void setContentTypeDefinitionRecordId(Integer contentTypeDefinitionRecordId) {
        this.contentTypeDefinitionRecordId = contentTypeDefinitionRecordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetadataContenttypepartdefinitionrecord that = (MetadataContenttypepartdefinitionrecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (settings != null ? !settings.equals(that.settings) : that.settings != null) return false;
        if (contentPartDefinitionRecordId != null ? !contentPartDefinitionRecordId.equals(that.contentPartDefinitionRecordId) : that.contentPartDefinitionRecordId != null)
            return false;
        if (contentTypeDefinitionRecordId != null ? !contentTypeDefinitionRecordId.equals(that.contentTypeDefinitionRecordId) : that.contentTypeDefinitionRecordId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (settings != null ? settings.hashCode() : 0);
        result = 31 * result + (contentPartDefinitionRecordId != null ? contentPartDefinitionRecordId.hashCode() : 0);
        result = 31 * result + (contentTypeDefinitionRecordId != null ? contentTypeDefinitionRecordId.hashCode() : 0);
        return result;
    }
}
