package com.sura.expenses.employee.port.dao;

import com.sura.expenses.employee.model.dto.EmployeeMonthExpenseDto;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeExpenseDao  {
    BigDecimal getTotalExpenses();

    List<EmployeeMonthExpenseDto> getEmployeeMonthExpense();
}
