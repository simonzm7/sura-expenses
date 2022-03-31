package com.sura.expenses.employee.port.repository;

import com.sura.expenses.employee.model.entity.Employee;

public interface EmployeeRepository {
    void save(Employee employee);
}
