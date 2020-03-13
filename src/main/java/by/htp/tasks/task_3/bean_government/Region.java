package by.htp.tasks.task_3.bean_government;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Region
{
    private int numberOfRegion;

    public Region(int numberOfRegion)
    {
        this.numberOfRegion = numberOfRegion;
    }

    public int getNumberOfRegion()
    {
        return numberOfRegion;
    }

    public void setNumberOfRegion(int numberOfRegion)
    {
        this.numberOfRegion = numberOfRegion;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return numberOfRegion == region.numberOfRegion;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfRegion);
    }

    @Override
    public String toString()
    {
        return "Region{" +
                "numberOfRegion=" + numberOfRegion +
                '}';
    }
}
