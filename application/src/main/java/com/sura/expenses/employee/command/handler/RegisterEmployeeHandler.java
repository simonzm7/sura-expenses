package com.sura.expenses.employee.command.handler;


import com.sura.expenses.employee.command.CommandEmployee;
import com.sura.expenses.employee.service.RegisterEmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@Slf4j
@RequiredArgsConstructor
public class RegisterEmployeeHandler {

    private final RegisterEmployeeService registerEmployeeService;

    public void execute(CommandEmployee commandEmployee){
        this.registerEmployeeService.execute();
    }
}
