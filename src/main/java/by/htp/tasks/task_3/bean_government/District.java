package by.htp.tasks.task_3.bean_government;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class District
{
    private String capitalOfRegion;

    public District(String capitalOfRegion)
    {
        this.capitalOfRegion = capitalOfRegion;
    }

    public String getCapitalOfRegion()
    {
        return capitalOfRegion;
    }

    public void setCapitalOfRegion(String capitalOfRegion)
    {
        this.capitalOfRegion = capitalOfRegion;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(capitalOfRegion, district.capitalOfRegion);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(capitalOfRegion);
    }

    @Override
    public String toString()
    {
        return "District{" +
                "capitalOfRegion='" + capitalOfRegion + '\'' +
                '}';
    }
}
