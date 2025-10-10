create database biblioteca;

use biblioteca;

create table livros(
id int not null auto_increment,
titulo varchar(50) not null,
autor varchar(50) not null,
publicacao year,
disponivel bit,
primary key (id)
);

desc livros;
select * from livros;

drop table livros;

insert into livros values
(default, 'Os 3 palmeirenses', 'Padeirinho', '1951', false),
(default, 'Mazembe day', 'Tigres', '2010', true),
(default, 'Setux a uno', 'Germany', '2014', true);

select titulo, autor, publicacao,
if(disponivel,'Sim','Não') as esta_disponivel
from biblioteca.livros;