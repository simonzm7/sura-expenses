package com.sura.expenses.employees.controller;


import com.sura.expenses.employee.command.CommandEmployee;
import com.sura.expenses.employee.command.handler.RegisterEmployeeHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@Slf4j
public class CommandEmployeeController {

    private final RegisterEmployeeHandler registerEmployeeHandler;

    @PostMapping()
    public void registerEmployees(@RequestBody CommandEmployee commandEmployee) {
        this.registerEmployeeHandler.execute(commandEmployee);
    }
}
