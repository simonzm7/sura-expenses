package com.sura.expenses.employee.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class EmployeeExpenseDto {

    private BigDecimal totalEmployees;
    private List<EmployeeMonthExpenseDto> employeeMonthExpenseDtos;
}
