package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Ticket {
    private Integer id;
    private String name;
    private String type;
    private String prefix;
    private Integer length;
    private Integer firstNumber;
    private Integer lastNumber;
    private Integer currentNumber;
    private Integer useSequence;
    private String usageScope;
    private Integer regionId;
    private Integer tollCollectorId;
    private Timestamp destributedOn;
    private String status;
    private String suffix;
    private Integer width;
    private String fillCharacter;

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
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Prefix")
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Basic
    @Column(name = "Length")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Basic
    @Column(name = "FirstNumber")
    public Integer getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Basic
    @Column(name = "LastNumber")
    public Integer getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Integer lastNumber) {
        this.lastNumber = lastNumber;
    }

    @Basic
    @Column(name = "CurrentNumber")
    public Integer getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Basic
    @Column(name = "UseSequence")
    public Integer getUseSequence() {
        return useSequence;
    }

    public void setUseSequence(Integer useSequence) {
        this.useSequence = useSequence;
    }

    @Basic
    @Column(name = "UsageScope")
    public String getUsageScope() {
        return usageScope;
    }

    public void setUsageScope(String usageScope) {
        this.usageScope = usageScope;
    }

    @Basic
    @Column(name = "RegionId")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "TollCollectorId")
    public Integer getTollCollectorId() {
        return tollCollectorId;
    }

    public void setTollCollectorId(Integer tollCollectorId) {
        this.tollCollectorId = tollCollectorId;
    }

    @Basic
    @Column(name = "DestributedOn")
    public Timestamp getDestributedOn() {
        return destributedOn;
    }

    public void setDestributedOn(Timestamp destributedOn) {
        this.destributedOn = destributedOn;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Suffix")
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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
    @Column(name = "FillCharacter")
    public String getFillCharacter() {
        return fillCharacter;
    }

    public void setFillCharacter(String fillCharacter) {
        this.fillCharacter = fillCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (id != null ? !id.equals(ticket.id) : ticket.id != null) return false;
        if (name != null ? !name.equals(ticket.name) : ticket.name != null) return false;
        if (type != null ? !type.equals(ticket.type) : ticket.type != null) return false;
        if (prefix != null ? !prefix.equals(ticket.prefix) : ticket.prefix != null) return false;
        if (length != null ? !length.equals(ticket.length) : ticket.length != null) return false;
        if (firstNumber != null ? !firstNumber.equals(ticket.firstNumber) : ticket.firstNumber != null) return false;
        if (lastNumber != null ? !lastNumber.equals(ticket.lastNumber) : ticket.lastNumber != null) return false;
        if (currentNumber != null ? !currentNumber.equals(ticket.currentNumber) : ticket.currentNumber != null)
            return false;
        if (useSequence != null ? !useSequence.equals(ticket.useSequence) : ticket.useSequence != null) return false;
        if (usageScope != null ? !usageScope.equals(ticket.usageScope) : ticket.usageScope != null) return false;
        if (regionId != null ? !regionId.equals(ticket.regionId) : ticket.regionId != null) return false;
        if (tollCollectorId != null ? !tollCollectorId.equals(ticket.tollCollectorId) : ticket.tollCollectorId != null)
            return false;
        if (destributedOn != null ? !destributedOn.equals(ticket.destributedOn) : ticket.destributedOn != null)
            return false;
        if (status != null ? !status.equals(ticket.status) : ticket.status != null) return false;
        if (suffix != null ? !suffix.equals(ticket.suffix) : ticket.suffix != null) return false;
        if (width != null ? !width.equals(ticket.width) : ticket.width != null) return false;
        if (fillCharacter != null ? !fillCharacter.equals(ticket.fillCharacter) : ticket.fillCharacter != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (firstNumber != null ? firstNumber.hashCode() : 0);
        result = 31 * result + (lastNumber != null ? lastNumber.hashCode() : 0);
        result = 31 * result + (currentNumber != null ? currentNumber.hashCode() : 0);
        result = 31 * result + (useSequence != null ? useSequence.hashCode() : 0);
        result = 31 * result + (usageScope != null ? usageScope.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (tollCollectorId != null ? tollCollectorId.hashCode() : 0);
        result = 31 * result + (destributedOn != null ? destributedOn.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (fillCharacter != null ? fillCharacter.hashCode() : 0);
        return result;
    }
}
