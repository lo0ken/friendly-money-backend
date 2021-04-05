create table transaction_type(
    id serial not null primary key,
    code varchar not null unique,
    name varchar not null
);

insert into transaction_type(id, code, name)
values (default, 'EXPENSE', 'Expense'),
       (default, 'INCOME', 'Income');

create table transaction(
    id serial not null primary key,
    name varchar not null,
    amount decimal not null,
    type_id int not null references transaction_type(id),
    category_id int not null references category(id),
    comment varchar,
    creation_date date not null
);