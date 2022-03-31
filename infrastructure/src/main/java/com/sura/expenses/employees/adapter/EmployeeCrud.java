package com.sura.expenses.employees.adapter;

import com.sura.expenses.employees.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrud extends CrudRepository<Employee, Long> {
}
