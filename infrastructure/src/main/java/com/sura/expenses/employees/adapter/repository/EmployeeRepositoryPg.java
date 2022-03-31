package com.sura.expenses.employees.adapter.repository;

import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.port.repository.EmployeeRepository;
import com.sura.expenses.employees.adapter.crud.EmployeeCrud;
import com.sura.expenses.employees.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeRepositoryPg implements EmployeeRepository {

    private final EmployeeCrud employeeRepository;

    @Override
    public void save(Employee employee) {
        /*  ADD MAPPER */
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeId(employee.getEmployeeId());
        employeeEntity.setEmployeeName(employee.getEmployeeName());
        this.employeeRepository.save(employeeEntity);
    }
}
