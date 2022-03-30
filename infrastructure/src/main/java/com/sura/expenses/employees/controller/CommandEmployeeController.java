package com.sura.expenses.employees.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class CommandEmployeeController {



    @PostMapping()
    public void registerEmployees() {

    }
}
