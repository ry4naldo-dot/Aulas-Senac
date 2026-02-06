create database danonations;

create table doador(
id int auto_increment primary key not null,
nome_doador varchar(100) not null,
sobrenome_doador varchar(100) not null,
idade int,
numeroT bigint not null,
senha varchar(100) not null,
cpf char(11) not null
)default charset = utf8mb4;

create table food(
id int auto_increment primary key not null,
nomeDoador varchar(100) not null,
comida varchar(100) not null,
peso decimal(10,2) not null,
dataValida date,
inf_id int,
foreign key (inf_id) references doador(id)
)default charset = utf8mb4;

create table outros(
id int auto_increment primary key not null,
nomeDoador varchar(100) not null,
itemNome varchar(100) not null,
quantidade int,
dataValida date,
inf_id int,
foreign key (inf_id) references doador(id)
)default charset = utf8mb4;

select * from doador;
select * from food;
select * from outros;

insert into doador (nome_doador, sobrenome_doador, idade,numeroT,senha, cpf) values
('Ryan','Gabriel da Rosa',994566756,19,'R%4n16301101','04168026051');

insert into food (nomeDoador,comida, peso, dataValida,inf_id) values
('Ryan','Arroz',80.00,'2025-02-05',1);

insert into outros (nomeDoador,itemNome, quantidade,dataValida,inf_id) values
('Ryan','Xbox 360 estragado', 1,'2025-02-06',1);

truncate doador;
drop table doador;
drop table food;
drop table outros;