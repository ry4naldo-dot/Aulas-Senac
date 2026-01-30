create database danonations;

create table informacoes(
id int(11) auto_increment primary key not null,
nome_doador varchar(100) not null,
sobrenome_doador varchar(100) not null,
numeroT varchar(100) not null,
itemNome varchar(100) not null,
quantidade varchar(100) not null,
dataValida date
)default charset = utf8mb4;

select * from informacoes;

insert into informacoes (nome_doador, sobrenome_doador, numeroT,itemNome, quantidade,dataValida) values
('Ryan','Gabriel da Rosa','994566756','Arroz','80KG','2026-09-11');


truncate informacoes;
