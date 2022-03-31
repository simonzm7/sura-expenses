package com.sura.expenses.employees.config;

import com.sura.expenses.employee.service.RegisterEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public RegisterEmployeeService registerEmployeeService() {
        return new RegisterEmployeeService();
    }
}