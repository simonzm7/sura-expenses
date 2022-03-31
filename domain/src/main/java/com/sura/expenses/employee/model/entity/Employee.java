package com.sura.expenses.employee.model.entity;


import com.sura.expenses.employee.model.validation.ArgumentValidation;
import com.sura.expenses.employee.model.validation.RegexInputs;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Employee {
    private static final String EID_NULL_ERR_MSG = "Ingresa un id de empleado.";
    private static final String EID_ERR_MSG = "Ingresa un id de empleado.";
    private static final String EID_LEN_ERR_MSG = "Ingresa un id valido.";

    private static final String NAME_NULL_ERR_MSG = "Debes ingresar un nombre";
    private static final String NAME_ERR_MSG = "Ingresa un nombre valido.";

    private Long employeeId;
    private String employeeName;
    public Employee(Long employeeId, String employeeName) {
        ArgumentValidation.notNull(employeeId, EID_NULL_ERR_MSG);
        ArgumentValidation.notNull(employeeName, NAME_NULL_ERR_MSG);
        ArgumentValidation.validateMinLength(employeeId, 0, EID_LEN_ERR_MSG);
        ArgumentValidation.validateRegex(RegexInputs.NAME_REGEX, employeeName, NAME_ERR_MSG);

        this.employeeId = employeeId;
        this.employeeName = employeeName.trim();
    }

}
