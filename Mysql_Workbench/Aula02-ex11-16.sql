-- 11. Criar banco de dados "livraria"
create database livraria
default character set utf8mb4 
default collate utf8mb4_general_ci;
use livraria;

-- 12. Criar tabela "livros"
create table livros (
titulo varchar(200),
autor varchar(100),
ano_publicacao year
);

-- 13. Adicionar coluna "id" como chave primária
alter table livros add id int auto_increment primary key first;

-- 14. Adicionar coluna "estoque" com valor padrão 0
alter table livros add estoque int default 0;

-- 15. Inserir três livros
insert into livros (titulo, autor, ano_publicacao, estoque)
values ('Os 3 Palmeirenses', 'Padeirinho', 1951, 10),
       ('Mazembe day', 'Tigres', 2010, 5),
       ('Setux a uno', 'Germany', 2014, 7);

-- 16. Remover tabela "livros" se existir
drop table if exists livros;

