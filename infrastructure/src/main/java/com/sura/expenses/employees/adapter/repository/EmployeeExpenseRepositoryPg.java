package com.sura.expenses.employees.adapter.repository;

import com.sura.expenses.employee.model.entity.EmployeeExpense;
import com.sura.expenses.employee.port.repository.EmployeeExpenseRepository;
import com.sura.expenses.employees.adapter.crud.EmployeeExpenseCrud;
import com.sura.expenses.employees.entity.EmployeeExpenseEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class EmployeeExpenseRepositoryPg implements EmployeeExpenseRepository {

    private final EmployeeExpenseCrud employeeExpenseRepository;

    @Override
    public void save(EmployeeExpense employeeExpense) {


        EmployeeExpenseEntity employeeExpenseEntity = new EmployeeExpenseEntity();

        employeeExpenseEntity.setEmployeeId(employeeExpense.getEmployeeId());
        employeeExpenseEntity.setExpenseDate(employeeExpense.getExpenseDate());
        employeeExpenseEntity.setTotalExpense(employeeExpense.getTotalExpense());

        this.employeeExpenseRepository.save(employeeExpenseEntity);
    }
}
