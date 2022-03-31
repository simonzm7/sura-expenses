package com.sura.expenses.employee.port.repository;

import com.sura.expenses.employee.model.entity.EmployeeExpense;

public interface EmployeeExpenseRepository {
    void save(EmployeeExpense employeeExpense);
}
