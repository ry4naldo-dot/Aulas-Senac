create database cinema;

use cinema;

-- Crie um banco de dados chamado "cinema".
-- Crie uma tabela "filmes" com as colunas: id (chave primária com auto
-- incremento), titulo, diretor, genero, duracao (em minutos) e
-- classificacao_etaria.
-- Insira dois filmes na tabela "filmes".

create table filmes(
id int not null auto_increment,
titulo varchar(50) not null,
diretor varchar(50) not null,
genero varchar(50) not null,
duracao int(11),
classificacao varchar(3),
primary key (id)
);

desc filmes;
select * from filmes;

drop table filmes;

insert into filmes values
(default, 'Batalha dos Aflitos', 'Grêmio', 'Terror', '97', '+16'),
(default, 'Psicopata Baiano', 'Juninho', 'Suspense', '93', '+18');
