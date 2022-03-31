create table employee (
        id BIGINT PRIMARY KEY,
        employee_id BIGINT NOT NULL,
        employee_name TEXT NOT NULL,
        created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
        unique(employee_id)
);

create SEQUENCE employee_sequence INCREMENT 1 START 1 OWNED by employee.id;