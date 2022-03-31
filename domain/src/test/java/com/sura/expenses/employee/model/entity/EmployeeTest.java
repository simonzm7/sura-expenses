package com.sura.expenses.employee.model.entity;

import com.sura.expenses.employee.model.databuilder.EmployeeDataBuilder;
import com.sura.expenses.exception.ArgumentException;
import com.sura.expenses.exception.LengthException;
import com.sura.expenses.exception.RequiredException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("should throws exception if employee id is null")
    void employeeIdNull(){
        EmployeeDataBuilder builder = new EmployeeDataBuilder();
        builder.setEmployeeId(null);
        assertThrows(RequiredException.class, () -> builder.build());
    }

    @Test
    @DisplayName("should throws exception if employee id is less than 0")
    void employeeIdLessThan(){
        EmployeeDataBuilder builder = new EmployeeDataBuilder();
        builder.setEmployeeId(0L);
        assertThrows(LengthException.class, () -> builder.build());
    }


    @Test
    @DisplayName("should throws exception if employee name is null")
    void employeeNameNull(){
        EmployeeDataBuilder builder = new EmployeeDataBuilder();
        builder.setEmployeeName(null);
        assertThrows(RequiredException.class, () -> builder.build());
    }

    @Test
    @DisplayName("should throws exception if employee name have invalid format")
    void employeeNameInvalidFormat(){
        EmployeeDataBuilder builder = new EmployeeDataBuilder();
        builder.setEmployeeName("%%%%");
        assertThrows(ArgumentException.class, () -> builder.build());
    }

    @Test
    @DisplayName("should instantiate Employee object")
    void employee(){
        Employee employee = new EmployeeDataBuilder().build();
        assertNotNull(employee.getEmployeeId());
        assertNotNull(employee.getEmployeeName());
    }

}