create database musica;

use musica;

-- Crie um banco de dados chamado "musica".
-- Crie uma tabela "albuns" com as colunas: id (chave primária com
-- auto incremento), nome, artista, ano_lancamento e genero.


create table albuns(
id int not null auto_increment,
nome varchar(50) not null,
artista varchar(50) not null,
lancamento year,
genero varchar(50) not null,
primary key (id)
);

drop table albuns;

desc albuns;
select * from albuns;

