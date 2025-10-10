create database empresa
default character set utf8mb4
default collate utf8mb4_general_ci;

use empresa;

create table funcionarios(
id int not null auto_increment,
nome varchar(50) not null,
cargo varchar(50) not null,
salario decimal (6,2),
admissao date,
primary key (id)
)default charset = utf8mb4;

desc funcionarios;
select * from funcionarios;

drop table funcionarios;

insert into funcionarios values
(default, 'José', 'Segurança', '1234.64', '2010-07-01');
