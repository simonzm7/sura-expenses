package com.sura.expenses.employees.adapter;

import com.sura.expenses.employees.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrud extends CrudRepository<EmployeeEntity, Long> {
    boolean existsByEmployeeId(Long employeeId);
}
