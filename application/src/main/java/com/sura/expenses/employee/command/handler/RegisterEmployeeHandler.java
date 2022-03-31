package com.sura.expenses.employee.command.handler;


import com.sura.expenses.employee.command.CommandEmployee;
import com.sura.expenses.employee.factory.EmployeeFactory;
import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.model.entity.EmployeeExpense;
import com.sura.expenses.employee.service.RegisterEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@RequiredArgsConstructor
public class RegisterEmployeeHandler {

    private final RegisterEmployeeService registerEmployeeService;
    private final EmployeeFactory employeeFactory;
    public void execute(CommandEmployee commandEmployee){
        Employee employee = this.employeeFactory.toEmployee(commandEmployee);
        EmployeeExpense employeeExpense = this.employeeFactory.toEmployeeExpense(employee.getEmployeeId(), commandEmployee);
        this.registerEmployeeService.execute(employee, employeeExpense);
    }
}
