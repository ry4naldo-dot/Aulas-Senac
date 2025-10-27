-- 1. Criar banco de dados "ecommerce"
Create database ecommerce 
default character set utf8mb4
default collate utf8mb4_general_ci;

Use ecommerce;

-- 2. Criar tabela "produtos"
Create table produtos (
id int auto_increment,
nome varchar(100),
preco decimal(10,2),
primary key(id)
)default charset = utf8mb4;

-- 3. Adicionar coluna "descricao" após "nome"
alter table produtos add descricao text after nome;

-- 4. Inserir produto
insert into produtos (nome, descricao, preco)
values 
('Camiseta', 'Camiseta de algodão, tamanho M', 29.90);

-- 5. Remover coluna "descricao"
alter table produtos drop column descricao;

-- 6. Criar tabela "clientes"
create table clientes (
    id int auto_increment,
    nome varchar(100),
    primary key(id)
)default charset = utf8mb4;

-- 7. Adicionar colunas "email" e "telefone"
alter table clientes add email varchar(100) first;
alter table clientes add telefone bigint after nome;

-- 8. Modificar "telefone" para aceitar apenas valores positivos
alter table clientes modify telefone bigint unsigned;

-- 9. Inserir dois clientes
insert into clientes (email, nome, telefone)
values 
('ryanzindosenac@email.com', 'Ryan da Rosa', 51999999999),
('naoseioquedigitar@email.com', 'Não sei', 51988888888);

-- 10. Renomear tabela "clientes" para "usuarios"
alter table clientes
rename to usuarios;

desc produtos;
select * from produtos;

desc clientes;
select * from clientes;
desc usuarios;
select * from usuarios;

drop table produtos;
-- drop database produtos;

drop table clientes;
-- drop database clientes;
