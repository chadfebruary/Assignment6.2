package com.milleniuminfinity.app.milleniuminfintity.factories.employee;

import com.milleniuminfinity.app.milleniuminfintity.domain.employee.Cleaner;
import com.milleniuminfinity.app.milleniuminfintity.domain.employee.Employee;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class CleanerFactory {

    public static Employee getCleaner(String type, String name, String surname, String dateOfBirth, String employeeID) {
        Employee cleaner = new Cleaner.Builder()
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .employeeID(employeeID)
                .build();

        return cleaner;
    }
}
