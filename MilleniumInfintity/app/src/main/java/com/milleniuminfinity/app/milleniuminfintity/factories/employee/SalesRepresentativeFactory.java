package com.milleniuminfinity.app.milleniuminfintity.factories.employee;

import com.milleniuminfinity.app.milleniuminfintity.domain.employee.Employee;
import com.milleniuminfinity.app.milleniuminfintity.domain.employee.SalesRepresentative;

/**
 * Created by 208023429 on 5/13/2016.
 */
public class SalesRepresentativeFactory {

    public static Employee getSalesRepresentative(String type, String name, String surname, String dateOfBirth, String employeeID) {
        Employee salesRep = new SalesRepresentative.Builder()
                .name(name)
                .surname(surname)
                .dateOfBirth(dateOfBirth)
                .employeeID(employeeID)
                .build();

        return salesRep;
    }
}
