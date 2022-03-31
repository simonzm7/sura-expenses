package com.sura.expenses.employees.adapter.dao;

import com.sura.expenses.employee.port.dao.EmployeeExpenseDao;
import com.sura.expenses.employees.adapter.crud.EmployeeExpenseCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@RequiredArgsConstructor
public class EmployeeExpenseDaoPg implements EmployeeExpenseDao {

    private final EmployeeExpenseCrud employeeExpenseCrud;

    @Override
    public boolean existsExpense(Long employeeId, Date expenseDate) {
        return false;
        //return this.employeeExpenseCrud.existsByEmployeeIdAndExpenseDate(employeeId, expenseDate);
    }
}
