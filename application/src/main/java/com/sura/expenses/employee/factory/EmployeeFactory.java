package com.sura.expenses.employee.factory;

import com.sura.expenses.employee.command.CommandEmployee;
import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.model.entity.EmployeeExpense;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFactory {

    public Employee toEmployee(CommandEmployee commandEmployee){
        return new Employee(commandEmployee.getEmployeeId(), commandEmployee.getEmployeeName());
    }

    public EmployeeExpense toEmployeeExpense(Long employeeId, CommandEmployee commandEmployee){
        return new EmployeeExpense(
                employeeId,
                commandEmployee.getExpenseDate(),
                commandEmployee.getTotalExpense()
        );
    }
}
