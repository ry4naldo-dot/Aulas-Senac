create database danonations;

create table doador(
-- id int auto_increment not null,
nome_doador varchar(100) not null,
sobrenome_doador varchar(100) not null,
idade int,
numeroT char(13) not null, -- (51) 9456-6756
cpf char(14) primary key not null
)default charset = utf8mb4;

create table food(
id int auto_increment primary key not null,
nomeDoador varchar(100) not null,
comida varchar(100) not null,
peso decimal(10,2) not null,
dataValida date,
inf_id char(14),
foreign key (inf_id) references doador(cpf)
)default charset = utf8mb4;

create table outros(
id int auto_increment primary key not null,
nomeDoador varchar(100) not null,
itemNome varchar(100) not null,
quantidade int,
dataValida date,
inf_id char(14),
foreign key (inf_id) references doador(cpf)
)default charset = utf8mb4;

select * from doador;
select * from food;
select * from outros;

insert into doador (nome_doador, sobrenome_doador, idade,numeroT, cpf) values
('Ryan','Gabriel da Rosa',19,'(51)9456-6756','041.680.260-51');

insert into food (nomeDoador,comida, peso, dataValida,inf_id) values
('Ryan','Arroz',80.00,'2025-02-05','041.680.260-51');

insert into outros (nomeDoador,itemNome, quantidade,dataValida,inf_id) values
('Ryan','Xbox 360 estragado', 1,'2025-02-06','041.680.260-51');

truncate doador;
drop table doador;
drop table food;
drop table outros;