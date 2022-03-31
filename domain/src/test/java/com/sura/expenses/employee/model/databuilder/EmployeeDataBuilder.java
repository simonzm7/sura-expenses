package com.sura.expenses.employee.model.databuilder;

import com.sura.expenses.employee.model.entity.Employee;
import com.sura.expenses.employee.model.validation.ArgumentValidation;
import com.sura.expenses.employee.model.validation.RegexInputs;

public class EmployeeDataBuilder {

    private Long employeeId;
    private String employeeName;
    public EmployeeDataBuilder() {
        this.employeeId = 1L;
        this.employeeName = "Adam";
    }

    public Employee build(){
        return new Employee(
                this.employeeId,
                this.employeeName
        );
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
