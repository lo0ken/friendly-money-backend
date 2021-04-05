create table category_type(
    id serial not null primary key,
    code varchar not null unique,
    name varchar not null
);

insert into category_type(id, code, name)
values (default, 'EXPENSE', 'Expense'),
        (default, 'INCOME', 'Income');

create table category(
    id serial not null primary key,
    name varchar not null,
    type_id int not null references category_type(id),
    user_id int not null references users(id)
);
