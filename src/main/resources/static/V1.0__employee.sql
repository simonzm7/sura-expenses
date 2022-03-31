create table employee (
        id BIGINT PRIMARY KEY,
        employee_id BIGINT NOT NULL,
        employee_name TEXT NOT NULL,
        created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
        unique(employee_id)
);

CREATE SEQUENCE employee_sequence INCREMENT 1 START 1 OWNED BY employee.id;


insert into employee("id","employee_id", "employee_name") VALUES('1', '1', 'Adam');

select * from employee_expense INNER JOIN employee ON employee.employee_id = '1' WHERE employee_expense.employee_id = '1';