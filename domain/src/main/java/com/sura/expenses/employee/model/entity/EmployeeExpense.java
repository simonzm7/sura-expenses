package com.sura.expenses.employee.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeExpense {
    private Long employeeId;
    private LocalDateTime expenseDate;
    private Double totalExpense;
}
