package com.sura.expenses.employee.command;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommandEmployee {
    private Long employeeId;
    private String employeeName;
    private String expenseDate;
    private Double totalExpense;
}
