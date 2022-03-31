package com.sura.expenses.employee.model.entity;

import com.sura.expenses.employee.model.validation.ArgumentValidation;
import com.sura.expenses.exception.ArgumentException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Slf4j
public class EmployeeExpense {

    private static final String DATE_ERR_MESSAGE = "La fecha no debe estar vacia.";
    private static final String EXPENSE_ERR_MESSAGE = "El gasto no debe ser nulo.";
    private static final String MIN_EXPENSE_ERR_MESSAGE = "El gasto debe ser mayor o igual a 0.";
    private static final String TOTAL_EXPENSE_ERR_MESSAGE = "El gasto debe tener un formato valido.";
    private static final String DATE_FORMAT_ERR_MESSAGE = "La fecha debe tener un formato valido";
    private static final String DATE_PATTERN = "dd/MM/yyyy";

    private Long employeeId;
    private Date expenseDate;
    private BigDecimal totalExpense;

    private Date toDate(String dateStr){
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
        dateFormat.setLenient(false);
        try{
            return dateFormat.parse(dateStr);
        }catch (ParseException e){
            throw new ArgumentException(DATE_FORMAT_ERR_MESSAGE);
        }
    }



    public EmployeeExpense(
            Long employeeId,
            String expenseDate,
            BigDecimal totalExpense
    ){
        ArgumentValidation.notNull(expenseDate, DATE_ERR_MESSAGE);
        ArgumentValidation.notNull(totalExpense, EXPENSE_ERR_MESSAGE);
        ArgumentValidation.validateMinLength(totalExpense.longValue(), 0, MIN_EXPENSE_ERR_MESSAGE);
        this.employeeId = employeeId;
        this.expenseDate = this.toDate(expenseDate);
        this.totalExpense = totalExpense;
    }
}
