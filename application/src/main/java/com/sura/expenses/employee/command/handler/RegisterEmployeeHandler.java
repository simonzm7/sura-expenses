package com.sura.expenses.employee.command.handler;


import com.sura.expenses.employee.command.CommandEmployee;
import com.sura.expenses.employee.factory.EmployeeFactory;
import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.model.entity.EmployeeExpense;
import com.sura.expenses.employee.service.RegisterEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@RequiredArgsConstructor
public class RegisterEmployeeHandler {

    private final RegisterEmployeeService registerEmployeeService;
    private final EmployeeFactory employeeFactory;
    public void execute(List<CommandEmployee> commandEmployees){
        for (CommandEmployee command : commandEmployees) {
            Employee employee = this.employeeFactory.toEmployee(command);
            EmployeeExpense employeeExpense = this.employeeFactory.toEmployeeExpense(employee.getEmployeeId(), command);
            this.registerEmployeeService.execute(employee, employeeExpense);
        }
    }
}
