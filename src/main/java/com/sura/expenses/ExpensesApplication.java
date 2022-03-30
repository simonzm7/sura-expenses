package com.sura.expenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sura.expenses")
public class ExpensesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensesApplication.class, args);
	}

}
