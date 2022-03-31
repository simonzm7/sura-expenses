package com.sura.expenses.employee.model.entity;

import com.sura.expenses.employee.model.databuilder.EmployeeExpenseDataBuilder;
import com.sura.expenses.exception.ArgumentException;
import com.sura.expenses.exception.LengthException;
import com.sura.expenses.exception.RequiredException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeExpenseTest {


    @Test
    @DisplayName("should throws error if expense date is null")
    void expenseDateNull(){
        EmployeeExpenseDataBuilder builder = new EmployeeExpenseDataBuilder();
        builder.setExpenseDate(null);
        assertThrows(RequiredException.class, () -> builder.build());
    }

    @Test
    @DisplayName("should throws error if total expense is null")
    void totalExpenseNull(){
        EmployeeExpenseDataBuilder builder = new EmployeeExpenseDataBuilder();
        builder.setTotalExpense(null);
        assertThrows(RequiredException.class, () -> builder.build());
    }

    @Test
    @DisplayName("should throws error if expense is less than 0")
    void expenseLessThan(){
        EmployeeExpenseDataBuilder builder = new EmployeeExpenseDataBuilder();
        builder.setTotalExpense(-1);
        assertThrows(LengthException.class, () -> builder.build());
    }

    @Test
    @DisplayName("should throws error if expense date have invalid format dd/mm/yyyy")
   public  void dateInvalidFormat(){
        EmployeeExpenseDataBuilder builder = new EmployeeExpenseDataBuilder();
        builder.setExpenseDate("2022/01/20");
        assertThrows(ArgumentException.class, () -> builder.build());
    }
}