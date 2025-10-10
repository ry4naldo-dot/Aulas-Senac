create database escola
default character set utf8mb4
default collate utf8mb4_general_ci;

use escola;

create table alunos(
id int not null auto_increment,
nome varchar(50) not null,
nascimento date,
turma varchar(3) not null,
email varchar(50) not null,
primary key (id)
)default charset = utf8mb4;

desc alunos;
select * from alunos;

drop table alunos;

insert into alunos values
(default, 'João Silva', '2005-03-15', '8A', 'joao.silva@email.com'); 

create table professores(
id int not null auto_increment,
nome varchar(50) not null,
disciplina varchar(30) not null,
salario decimal(5,2),
primary key (id)
)default charset = utf8mb4;

desc professores;
select * from professores;

insert into professores values
(default, 'Ruan bugi', 'Educação Fisica', '100.69'),
(default, 'Padeirinho', 'Entregador', '200.00');

