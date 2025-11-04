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

-- drop table alunos;

insert into alunos values
(default, 'João Silva', '2005-03-15', '8A', 'joao.silva@email.com'); 

update alunos set turma = '9A' where id = 3;

delete from alunos where turma = '8B';

truncate table alunos;

update alunos set email = 'joaosilva@novoemail.com' where nome = 'João Silva';

delete from alunos where id = 5;

update alunos set data_nascimento = date_sub(data_nascimento, interval 1 year);

delete from alunos where email is null or email = '';



create table professores(
id int not null auto_increment,
nome varchar(50) not null,
disciplina varchar(30) not null,
salario decimal(10,2),
primary key (id)
)default charset = utf8mb4;

desc professores;
select * from professores;

insert into professores values
(default, 'Ruan bugi', 'Educação Fisica', '1000.69'),
(default, 'Padeirinho', 'Entregador', '2000.00'),
(default, 'Meu PC', 'Anjo da luz', '3000.00'),
(default, 'Jonas', 'Encanador', '6000.00');

update professores set salario = salario * 1.10 where id in (1, 2);

delete from professores where id in (1, 2, 3);

alter table professores add column cargo varchar(50);
update professores set cargo = 'Gerente' where salario > 5000 limit 2;

