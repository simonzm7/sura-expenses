package com.sura.expenses.employee.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class EmployeeMonthExpenseDto {

    private BigDecimal totalMonthExpense;
    private String month;
    private String employeeName;
    private BigDecimal assumeSura;
    private BigDecimal assumeEmployee;
}
