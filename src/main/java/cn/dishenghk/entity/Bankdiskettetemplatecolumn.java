package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Bankdiskettetemplatecolumn {
    private Integer id;
    private String name;
    private String fieldName;
    private Integer width;
    private Integer alignment;
    private String format;
    private Byte fixedWidth;
    private Byte isTotoalColumn;
    private String fixedValue;
    private Integer bankDisketteTemplateId;
    private Integer usageType;
    private Integer orderId;
    private String fillCharacter;
    private Byte isFixedValue;

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
    @Column(name = "FieldName")
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "Width")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Basic
    @Column(name = "Alignment")
    public Integer getAlignment() {
        return alignment;
    }

    public void setAlignment(Integer alignment) {
        this.alignment = alignment;
    }

    @Basic
    @Column(name = "Format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "FixedWidth")
    public Byte getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(Byte fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    @Basic
    @Column(name = "IsTotoalColumn")
    public Byte getIsTotoalColumn() {
        return isTotoalColumn;
    }

    public void setIsTotoalColumn(Byte isTotoalColumn) {
        this.isTotoalColumn = isTotoalColumn;
    }

    @Basic
    @Column(name = "FixedValue")
    public String getFixedValue() {
        return fixedValue;
    }

    public void setFixedValue(String fixedValue) {
        this.fixedValue = fixedValue;
    }

    @Basic
    @Column(name = "BankDisketteTemplateId")
    public Integer getBankDisketteTemplateId() {
        return bankDisketteTemplateId;
    }

    public void setBankDisketteTemplateId(Integer bankDisketteTemplateId) {
        this.bankDisketteTemplateId = bankDisketteTemplateId;
    }

    @Basic
    @Column(name = "UsageType")
    public Integer getUsageType() {
        return usageType;
    }

    public void setUsageType(Integer usageType) {
        this.usageType = usageType;
    }

    @Basic
    @Column(name = "OrderID")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "FillCharacter")
    public String getFillCharacter() {
        return fillCharacter;
    }

    public void setFillCharacter(String fillCharacter) {
        this.fillCharacter = fillCharacter;
    }

    @Basic
    @Column(name = "IsFixedValue")
    public Byte getIsFixedValue() {
        return isFixedValue;
    }

    public void setIsFixedValue(Byte isFixedValue) {
        this.isFixedValue = isFixedValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bankdiskettetemplatecolumn that = (Bankdiskettetemplatecolumn) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (fieldName != null ? !fieldName.equals(that.fieldName) : that.fieldName != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (alignment != null ? !alignment.equals(that.alignment) : that.alignment != null) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (fixedWidth != null ? !fixedWidth.equals(that.fixedWidth) : that.fixedWidth != null) return false;
        if (isTotoalColumn != null ? !isTotoalColumn.equals(that.isTotoalColumn) : that.isTotoalColumn != null)
            return false;
        if (fixedValue != null ? !fixedValue.equals(that.fixedValue) : that.fixedValue != null) return false;
        if (bankDisketteTemplateId != null ? !bankDisketteTemplateId.equals(that.bankDisketteTemplateId) : that.bankDisketteTemplateId != null)
            return false;
        if (usageType != null ? !usageType.equals(that.usageType) : that.usageType != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (fillCharacter != null ? !fillCharacter.equals(that.fillCharacter) : that.fillCharacter != null)
            return false;
        if (isFixedValue != null ? !isFixedValue.equals(that.isFixedValue) : that.isFixedValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fieldName != null ? fieldName.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (alignment != null ? alignment.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (fixedWidth != null ? fixedWidth.hashCode() : 0);
        result = 31 * result + (isTotoalColumn != null ? isTotoalColumn.hashCode() : 0);
        result = 31 * result + (fixedValue != null ? fixedValue.hashCode() : 0);
        result = 31 * result + (bankDisketteTemplateId != null ? bankDisketteTemplateId.hashCode() : 0);
        result = 31 * result + (usageType != null ? usageType.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (fillCharacter != null ? fillCharacter.hashCode() : 0);
        result = 31 * result + (isFixedValue != null ? isFixedValue.hashCode() : 0);
        return result;
    }
}
