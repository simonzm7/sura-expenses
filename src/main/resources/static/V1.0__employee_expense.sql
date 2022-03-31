create table employee_expense (
        id BIGINT PRIMARY KEY,
        created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
        expense_date TEXT NOT NULL,
        total_expense INTEGER NOT NULL DEFAULT 0,
        employee_id BIGINT NOT NULL,
        CONSTRAINT fk_employee_id FOREIGN KEY(employee_id) REFERENCES employee(employee_id)
);

CREATE SEQUENCE employee_expense_sequence INCREMENT 1 START 1 OWNED BY employee_expense.id;


insert into employee_expense("id", "expense_date", "total_expense", "employee_id") VALUES('2', '01/02/2022',  '2000000', '2');