package com.sura.expenses.employee.command;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommandEmployee {
    private Long employeeId;
    private String employeeName;
    private String expenseDate;
    private Integer totalExpense;
}
