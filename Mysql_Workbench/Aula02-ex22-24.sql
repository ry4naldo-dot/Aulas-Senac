-- 22. Criar banco de dados "streaming"
create database streaming 
default character set utf8mb4 
default Collate utf8mb4_general_ci;
use streaming;

-- 23. Criar tabela "series" com id como chave primária e titulo como único
create table series (
id int auto_increment,
titulo varchar(200) unique,
genero varchar(100),
num_temporadas int,
primary key (id)
);

select * from series;

-- 24. Inserir duas séries
insert into series values 
(default,'Breaking Bad', 'Ação, Drama, Crime', 5),
(default, 'Sopranos', 'Ação, Drama, Crime', 6);

