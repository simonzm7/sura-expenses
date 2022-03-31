package com.sura.expenses.employee.service;

import com.sura.expenses.employee.model.databuilder.EmployeeDataBuilder;
import com.sura.expenses.employee.model.databuilder.EmployeeExpenseDataBuilder;
import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.model.entity.EmployeeExpense;
import com.sura.expenses.employee.port.dao.EmployeeDao;
import com.sura.expenses.employee.port.repository.EmployeeExpenseRepository;
import com.sura.expenses.employee.port.repository.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class RegisterEmployeeServiceTest {

    @Test
    @DisplayName("should register employee")
    public void registerEmployee(){
        EmployeeDao employeeDao = Mockito.mock(EmployeeDao.class);
        EmployeeRepository employeeRepository = Mockito.mock(EmployeeRepository.class);
        EmployeeExpenseRepository employeeExpenseRepository = Mockito.mock(EmployeeExpenseRepository.class);

        Employee employee = new EmployeeDataBuilder().build();
        EmployeeExpense employeeExpense = new EmployeeExpenseDataBuilder().build();

        Mockito.when(employeeDao.employeeExists(1L)).thenReturn(false);


        RegisterEmployeeService registerEmployeeService = new RegisterEmployeeService(employeeDao, employeeRepository, employeeExpenseRepository);
        registerEmployeeService.execute(employee, employeeExpense);
        Mockito.verify(employeeRepository, Mockito.times(1)).save(employee);
        Mockito.verify(employeeExpenseRepository, Mockito.times(1)).save(employeeExpense);

    }

}