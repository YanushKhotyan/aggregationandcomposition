package by.htp.tasks;

import by.htp.tasks.task_3.services_government.GovernmentService;
import by.htp.tasks.task_3.view_government.ViewConsoleGovernment;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Start
{
    public static void main(String [] args){
        GovernmentService governmentService = new GovernmentService();
        ViewConsoleGovernment viewConsoleGovernment = new ViewConsoleGovernment();
        viewConsoleGovernment.governmentConsolePrint(governmentService.magentaGovernment());
    }
}
