-- 25. Criar banco de dados "restaurante"
create database restaurante 
character set utf8mb4 
default collate utf8mb4_general_ci;
use restaurante;

-- 26. Criar tabela "pratos"
create table pratos (
nome varchar(100),
descricao text,
preco decimal(10,2)
);

-- 27. Adicionar coluna "id" como chave primária com auto incremento no início
alter table pratos add id int auto_increment primary key first;

select * from pratos;