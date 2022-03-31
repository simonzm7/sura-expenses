package com.sura.expenses.employees.adapter.dao;

import com.sura.expenses.employee.model.dto.EmployeeMonthExpenseDto;
import com.sura.expenses.employee.port.dao.EmployeeExpenseDao;
import com.sura.expenses.employees.adapter.crud.EmployeeExpenseCrud;
import com.sura.expenses.employees.adapter.mapper.EmployeeMonthExpenseMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;


@Component
@RequiredArgsConstructor
@Slf4j
public class EmployeeExpenseDaoPg implements EmployeeExpenseDao {

    private final EmployeeExpenseCrud employeeExpenseCrud;
    private final EmployeeMonthExpenseMapper employeeMonthExpenseMapper;
    @Override
    public BigDecimal getTotalExpenses() {
        return this.employeeExpenseCrud.getTotalExpenses();
    }

    @Override
    public List<EmployeeMonthExpenseDto> getEmployeeMonthExpense() {
        List<Object[]> rs = this.employeeExpenseCrud.getEmployeeMonthExpense();
        return this.employeeMonthExpenseMapper.toEmployeeMonthExpenseDto(rs);
    }
}
