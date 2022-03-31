package com.sura.expenses.employees.adapter.mapper;

import com.sura.expenses.employee.model.dto.EmployeeMonthExpenseDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeMonthExpenseMapper {


    public List<EmployeeMonthExpenseDto> toEmployeeMonthExpenseDto(List<Object[]> rs){
        List<EmployeeMonthExpenseDto> list = new ArrayList<>();
        for(Object[] column : rs){
            list.add(new EmployeeMonthExpenseDto(
                    (BigDecimal) column[0],
                    ((String)column[1]).trim(),
                    ((String)column[2]).trim()
            ));
        }
        return list;
    }
}
