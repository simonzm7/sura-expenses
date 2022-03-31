package com.sura.expenses.employee.service;

import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.model.entity.EmployeeExpense;
import com.sura.expenses.employee.port.dao.EmployeeDao;
import com.sura.expenses.employee.port.repository.EmployeeExpenseRepository;
import com.sura.expenses.employee.port.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
public class RegisterEmployeeService {

    private final EmployeeDao employeeDao;
    private final EmployeeRepository employeeRepository;
    private final EmployeeExpenseRepository employeeExpenseRepository;

    private void saveEmployee(Employee employee){
        boolean exists = this.employeeDao.employeeExists(employee.getEmployeeId());
        if(!exists){
            this.employeeRepository.save(employee);
        }
    }
    private void saveEmployeeExpense(EmployeeExpense employeeExpense) {
        this.employeeExpenseRepository.save(employeeExpense);
    }

    public void execute(Employee employee, EmployeeExpense employeeExpense)
    {
        this.saveEmployee(employee);
        this.saveEmployeeExpense(employeeExpense);
    }
}
