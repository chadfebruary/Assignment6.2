package com.milleniuminfinity.app.milleniuminfintity.factories.employee;

import com.milleniuminfinity.app.milleniuminfintity.domain.employee.Employee;
import com.milleniuminfinity.app.milleniuminfintity.domain.employee.Manager;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class ManagerFactory {

    public static Employee getManager(String type, String name, String surname, String dateOfBirth, String employeeID) {
        Employee manager = new Manager.Builder()
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .employeeID(employeeID)
                .build();

        return manager;
    }
}
