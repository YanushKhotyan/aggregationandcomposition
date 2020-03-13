package by.htp.tasks.task_3.bean_government;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Government
{
    private City city;
    private District district;
    private Region region;
    private String nameGovernment;
    private int areaGovernment;

    public Government(City city, District district, Region region, String nameGovernment, int areaGovernment)
    {
        this.city = city;
        this.district = district;
        this.region = region;
        this.nameGovernment = nameGovernment;
        this.areaGovernment = areaGovernment;
    }

    public int getAreaGovernment()
    {
        return areaGovernment;
    }

    public void setAreaGovernment(int areaGovernment)
    {
        this.areaGovernment = areaGovernment;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    public District getDistrict()
    {
        return district;
    }

    public void setDistrict(District district)
    {
        this.district = district;
    }

    public Region getRegion()
    {
        return region;
    }

    public void setRegion(Region region)
    {
        this.region = region;
    }

    public String getNameGovernment()
    {
        return nameGovernment;
    }

    public void setNameGovernment(String nameGovernment)
    {
        this.nameGovernment = nameGovernment;
    }

    @Override
    public boolean equals(Object o)
    {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Government that = (Government) o;
        return areaGovernment == that.areaGovernment &&
                Objects.equals(city, that.city) &&
                Objects.equals(district, that.district) &&
                Objects.equals(region, that.region) &&
                Objects.equals(nameGovernment, that.nameGovernment);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(city, district, region, nameGovernment, areaGovernment);
    }

    @Override
    public String toString()
    {
        return "Government{" +
                "city=" + city +
                ", district=" + district +
                ", region=" + region +
                ", nameGovernment='" + nameGovernment + '\'' +
                ", areaGovernment=" + areaGovernment +
                '}';
    }

}
