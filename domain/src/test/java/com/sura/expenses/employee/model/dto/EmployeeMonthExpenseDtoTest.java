package com.sura.expenses.employee.model.dto;

import com.sura.expenses.employee.model.databuilder.dto.EmployeeMonthExpenseDtoBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EmployeeMonthExpenseDtoTest {


    @Test
    @DisplayName("should create EmployeeMonthExpenseDto")
    void employeeMonthExpenseDto(){
        EmployeeMonthExpenseDto dto = new EmployeeMonthExpenseDtoBuilder().build();
        assertNotNull(dto.getEmployeeName());
        assertNotNull(dto.getMonth());
        assertNotNull(dto.getTotalMonthExpense());
        assertNotNull(dto.getAssumeSura());
        assertNotNull(dto.getAssumeEmployee());
    }
}