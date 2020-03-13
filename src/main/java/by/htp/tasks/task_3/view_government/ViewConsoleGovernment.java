package by.htp.tasks.task_3.view_government;

import by.htp.tasks.task_3.bean_government.Government;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class ViewConsoleGovernment
{
    public void governmentConsolePrint(Government government)
    {
        System.out.println("Стилица " + government.getCity().getCapitalCity() + " количество областей "
                + government.getRegion().getNumberOfRegion() + " площадь " + government.getAreaGovernment()
                + " областные центры " + government.getDistrict().getCapitalOfRegion());
    }
}
