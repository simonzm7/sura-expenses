package com.sura.expenses.employees.adapter.crud;

import com.sura.expenses.employees.entity.EmployeeExpenseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface EmployeeExpenseCrud extends CrudRepository<EmployeeExpenseEntity, Long> {
    //boolean existsByEmployeeIdAndExpenseDate(Long employeeId, Date expenseDate);
}
