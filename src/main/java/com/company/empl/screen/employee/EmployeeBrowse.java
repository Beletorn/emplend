package com.company.empl.screen.employee;

import io.jmix.ui.screen.*;
import com.company.empl.entity.Employee;

@UiController("Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
public class EmployeeBrowse extends StandardLookup<Employee> {
}