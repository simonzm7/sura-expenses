package com.sura.expenses.employees.adapter.dao;

import com.sura.expenses.employee.port.dao.EmployeeDao;
import com.sura.expenses.employees.adapter.crud.EmployeeCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeDaoPg implements EmployeeDao {

    private final EmployeeCrud employeeRepository;

    @Override
    public boolean employeeExists(Long employeeId) {
        return this.employeeRepository.existsByEmployeeId(employeeId);
    }
}
