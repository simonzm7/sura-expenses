package com.sura.expenses.employee.query;


import com.sura.expenses.employee.model.dto.EmployeeExpenseDto;
import com.sura.expenses.employee.model.dto.EmployeeMonthExpenseDto;
import com.sura.expenses.employee.port.dao.EmployeeExpenseDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class FindEmployeeExpenseHandler {

    private final EmployeeExpenseDao employeeExpenseDao;

    public EmployeeExpenseDto execute(){
        BigDecimal totalExpenses = this.employeeExpenseDao.getTotalExpenses();
        List<EmployeeMonthExpenseDto> employeeMonthExpenseDtos =  this.employeeExpenseDao.getEmployeeMonthExpense();
        return new EmployeeExpenseDto(totalExpenses, employeeMonthExpenseDtos);
    }
}
