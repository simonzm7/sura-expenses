package com.sura.expenses.employee.model.databuilder;

import com.sura.expenses.employee.model.entity.EmployeeExpense;

import java.math.BigDecimal;

public class EmployeeExpenseDataBuilder {

    private Long employeeId;
    private String expenseDate;
    private BigDecimal totalExpense;

    public EmployeeExpenseDataBuilder(){
        this.employeeId = 1L;
        this.expenseDate = "01/03/2022";
        this.totalExpense = BigDecimal.valueOf(10000);
    }

    public EmployeeExpense build(){
        return new EmployeeExpense(
                this.employeeId,
                this.expenseDate,
                this.totalExpense
        );
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public void setTotalExpense(BigDecimal totalExpense) {
        this.totalExpense = totalExpense;
    }
}
