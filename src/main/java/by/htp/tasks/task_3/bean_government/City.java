package by.htp.tasks.task_3.bean_government;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class City
{
    private String capitalCity;

    public City(String capitalCity)
    {
        this.capitalCity = capitalCity;
    }

    public String getCapitalCity()
    {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity)
    {
        this.capitalCity = capitalCity;
    }

    @Override
    public String toString()
    {
        return "City{" +
                "capitalCity='" + capitalCity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(capitalCity, city.capitalCity);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(capitalCity);
    }
}
