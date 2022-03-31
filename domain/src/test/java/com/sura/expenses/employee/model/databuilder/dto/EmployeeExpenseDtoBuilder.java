package com.sura.expenses.employee.model.databuilder.dto;

import com.sura.expenses.employee.model.dto.EmployeeExpenseDto;
import com.sura.expenses.employee.model.dto.EmployeeMonthExpenseDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeExpenseDtoBuilder {

    private BigDecimal totalEmployees;
    private List<EmployeeMonthExpenseDto> employeeMonthExpenseDtos;

    public EmployeeExpenseDtoBuilder(){
        this.totalEmployees = BigDecimal.ONE;
        this.employeeMonthExpenseDtos = new ArrayList<>();
        this.employeeMonthExpenseDtos.add(new EmployeeMonthExpenseDtoBuilder().build());
    }

    public EmployeeExpenseDto build(){
        return new EmployeeExpenseDto(
                this.totalEmployees,
                this.employeeMonthExpenseDtos
        );
    }
}
