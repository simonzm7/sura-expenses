package com.sura.expenses.employees.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "employee_expense")
@Data
public class EmployeeExpenseEntity {

    @Id
    @SequenceGenerator(
            name = "employee_expense_sequence",
            sequenceName = "employee_expense_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_expense_sequence"
    )
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "expense_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expenseDate;

    @Column(name = "total_expense")
    private BigDecimal totalExpense;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @PrePersist
    private void prePersist() {
        this.createdAt = new Date();
    }

}
