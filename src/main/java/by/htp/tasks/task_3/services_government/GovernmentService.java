package by.htp.tasks.task_3.services_government;

import by.htp.tasks.task_3.bean_government.City;
import by.htp.tasks.task_3.bean_government.District;
import by.htp.tasks.task_3.bean_government.Government;
import by.htp.tasks.task_3.bean_government.Region;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class GovernmentService
{
    public Government magentaGovernment()
    {
        Government government = new Government(new City("Washington")
                , new District("willage"), new Region(6)
                , "the USA", 1000000);
        return government;
    }

}
