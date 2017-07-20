package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Region {
    private Integer id;
    private Double coveredArea;
    private Double landsArea;
    private Double usingArea;
    private Double publicArea;
    private Double greenSpaceRatio;
    private Double floorAreaRatio;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CoveredArea")
    public Double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(Double coveredArea) {
        this.coveredArea = coveredArea;
    }

    @Basic
    @Column(name = "LandsArea")
    public Double getLandsArea() {
        return landsArea;
    }

    public void setLandsArea(Double landsArea) {
        this.landsArea = landsArea;
    }

    @Basic
    @Column(name = "UsingArea")
    public Double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(Double usingArea) {
        this.usingArea = usingArea;
    }

    @Basic
    @Column(name = "PublicArea")
    public Double getPublicArea() {
        return publicArea;
    }

    public void setPublicArea(Double publicArea) {
        this.publicArea = publicArea;
    }

    @Basic
    @Column(name = "GreenSpaceRatio")
    public Double getGreenSpaceRatio() {
        return greenSpaceRatio;
    }

    public void setGreenSpaceRatio(Double greenSpaceRatio) {
        this.greenSpaceRatio = greenSpaceRatio;
    }

    @Basic
    @Column(name = "FloorAreaRatio")
    public Double getFloorAreaRatio() {
        return floorAreaRatio;
    }

    public void setFloorAreaRatio(Double floorAreaRatio) {
        this.floorAreaRatio = floorAreaRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Region region = (Region) o;

        if (id != null ? !id.equals(region.id) : region.id != null) return false;
        if (coveredArea != null ? !coveredArea.equals(region.coveredArea) : region.coveredArea != null) return false;
        if (landsArea != null ? !landsArea.equals(region.landsArea) : region.landsArea != null) return false;
        if (usingArea != null ? !usingArea.equals(region.usingArea) : region.usingArea != null) return false;
        if (publicArea != null ? !publicArea.equals(region.publicArea) : region.publicArea != null) return false;
        if (greenSpaceRatio != null ? !greenSpaceRatio.equals(region.greenSpaceRatio) : region.greenSpaceRatio != null)
            return false;
        if (floorAreaRatio != null ? !floorAreaRatio.equals(region.floorAreaRatio) : region.floorAreaRatio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (coveredArea != null ? coveredArea.hashCode() : 0);
        result = 31 * result + (landsArea != null ? landsArea.hashCode() : 0);
        result = 31 * result + (usingArea != null ? usingArea.hashCode() : 0);
        result = 31 * result + (publicArea != null ? publicArea.hashCode() : 0);
        result = 31 * result + (greenSpaceRatio != null ? greenSpaceRatio.hashCode() : 0);
        result = 31 * result + (floorAreaRatio != null ? floorAreaRatio.hashCode() : 0);
        return result;
    }
}
