package com.sura.expenses.employees.adapter.dao;

import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.port.dao.EmployeeDao;
import com.sura.expenses.employees.adapter.EmployeeCrud;
import com.sura.expenses.employees.entity.EmployeeEntity;
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

    @Override
    public void saveEmployee(Employee employee) {
        /*  ADD MAPPER */
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeId(employee.getEmployeeId());
        employeeEntity.setEmployeeName(employee.getEmployeeName());
        this.employeeRepository.save(employeeEntity);
    }
}
