package com.company.empl.screen.employee;

import io.jmix.ui.screen.*;
import com.company.empl.entity.Employee;

@UiController("Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
public class EmployeeEdit extends StandardEditor<Employee> {
}