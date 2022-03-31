package com.sura.expenses.employees.adapter.crud;

import com.sura.expenses.employees.entity.EmployeeExpenseEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmployeeExpenseCrud extends CrudRepository<EmployeeExpenseEntity, Long> {

    @Query(value = "select sum(total_expense) as total_expense from employee_expense", nativeQuery = true)
    BigDecimal getTotalExpenses();

    @Query(value = "select sum(ee.total_expense) as total_month, to_char(to_date(cast(EXTRACT(MONTH FROM ee.expense_date) as TEXT), 'MM'), 'Month') as month, e.employee_name, CASE when round((sum(ee.total_expense) * 19 / 100) + sum(ee.total_expense)) > 1000000 then round((sum(ee.total_expense) * 19 / 100) + sum(ee.total_expense)) else 0 END as assume_sura, CASE when round((sum(ee.total_expense) * 19 / 100) + sum(ee.total_expense)) < 1000000 then round((sum(ee.total_expense) * 19 / 100) + sum(ee.total_expense)) else 0 END as assume_employee from employee_expense ee inner join employee e on e.id = ee.employee_id where EXTRACT(MONTH FROM ee.expense_date) >=  EXTRACT(MONTH FROM ee.expense_date) and EXTRACT(MONTH FROM ee.expense_date) <= EXTRACT(MONTH FROM ee.expense_date) group by ee.employee_id, e.employee_name, EXTRACT(MONTH FROM ee.expense_date) order by employee_name, month ASC ", nativeQuery = true)
    List<Object[]> getEmployeeMonthExpense();

}

