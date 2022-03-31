package com.sura.expenses.employee.service;

import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.model.entity.EmployeeExpense;
import com.sura.expenses.employee.port.dao.EmployeeDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class RegisterEmployeeService {

    private final EmployeeDao employeeDao;

    private void validateIfExpenseExists(){

    }

    private void saveEmployee(Employee employee){
        boolean exists = this.employeeDao.employeeExists(employee.getEmployeeId());
        if(!exists){
            this.employeeDao.saveEmployee(employee);
        }
    }
    private void saveEmployeeExpense(EmployeeExpense employeeExpense){
        this.validateIfExpenseExists();
    }

    public void execute(Employee employee, EmployeeExpense employeeExpense){
        this.saveEmployee(employee);
        this.saveEmployeeExpense(employeeExpense);
    }
}
