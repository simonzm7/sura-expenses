package com.sura.expenses.employee.port.dao;

import com.sura.expenses.employee.model.entity.Employee;

public interface EmployeeDao {

    boolean employeeExists(Long employeeId);
    void saveEmployee(Employee employee);
}
