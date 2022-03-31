package com.sura.expenses.employee.model.databuilder.dto;


import com.sura.expenses.employee.model.dto.EmployeeMonthExpenseDto;

import java.math.BigDecimal;

public class EmployeeMonthExpenseDtoBuilder {

    private BigDecimal totalMonthExpense;
    private String month;
    private String employeeName;
    private BigDecimal assumeSura;
    private BigDecimal assumeEmployee;

    public EmployeeMonthExpenseDtoBuilder() {
        this.totalMonthExpense = BigDecimal.TEN;
        this.month = "May";
        this.employeeName = "Adam";
        this.assumeEmployee = BigDecimal.ONE;
        this.assumeSura = BigDecimal.ZERO;
    }

    public EmployeeMonthExpenseDto build(){
        return new EmployeeMonthExpenseDto(
                this.totalMonthExpense,
                this.month,
                this.employeeName,
                this.assumeSura,
                this.assumeEmployee
        );
    }

}
