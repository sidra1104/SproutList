create table todolist(
    id int auto_increment,
    title varchar(255) NOT NULL,
    completed varchar(255) NOT NULL
);

insert into todolist(title,completed) values ('Have lunch','False');