package com.sura.expenses.employees.controller;


import com.sura.expenses.employee.model.dto.EmployeeExpenseDto;
import com.sura.expenses.employee.query.FindEmployeeExpenseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
public class QueryEmployeeExpenseController {

    private final FindEmployeeExpenseHandler findEmployeeExpenseHandler;

    @GetMapping
    public ResponseEntity<EmployeeExpenseDto> findEmployeeExpense(){
        return new ResponseEntity<>(this.findEmployeeExpenseHandler.execute(), HttpStatus.OK);
    }
}
