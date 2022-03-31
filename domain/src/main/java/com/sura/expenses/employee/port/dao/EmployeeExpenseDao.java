package com.sura.expenses.employee.port.dao;

import java.sql.Date;

public interface EmployeeExpenseDao {
    boolean existsExpense(Long employeeId, Date expenseDate);
}
