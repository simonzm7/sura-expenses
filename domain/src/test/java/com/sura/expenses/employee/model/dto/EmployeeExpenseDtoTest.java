package com.sura.expenses.employee.model.dto;

import com.sura.expenses.employee.model.databuilder.dto.EmployeeExpenseDtoBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeExpenseDtoTest {

    @Test
    @DisplayName("should create EmployeeExpenseDto")
    void employeeExpenseDto(){
        EmployeeExpenseDto dto = new EmployeeExpenseDtoBuilder().build();

        assertNotNull(dto.getTotalEmployees());
        assertEquals(dto.getEmployeeMonthExpenseDtos().size(), 1);
    }

}