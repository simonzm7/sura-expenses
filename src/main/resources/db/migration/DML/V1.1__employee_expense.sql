create table employee_expense (
        id BIGINT PRIMARY KEY,
        created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
        expense_date DATE NOT NULL,
        total_expense NUMERIC NOT NULL DEFAULT 0,
        employee_id BIGINT NOT NULL,
        CONSTRAINT fk_employee_id FOREIGN KEY(employee_id) REFERENCES employee(employee_id)
);

create SEQUENCE employee_expense_sequence INCREMENT 1 START 1 OWNED by employee_expense.id;
