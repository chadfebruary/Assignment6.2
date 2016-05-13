package com.milleniuminfinity.app.milleniuminfintity.services.employee;

import android.content.Context;

import com.milleniuminfinity.app.milleniuminfintity.domain.employee.Employee;


/**
 * Created by Chad on 5/8/2016.
 */
public interface EmployeeService {

    void addEmployee(Context context, Employee employee);
    void updateEmployee(Context context, Employee employee);
}
