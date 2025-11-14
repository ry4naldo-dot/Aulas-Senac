-- Carro:
-- carros: id, marca, modelo, ano, proprietario_id
-- proprietarios: id, nome, idade

create database Carrinhos
default character set utf8mb4
default collate utf8mb4_general_ci;

create table Proprietarios(
id int not null auto_increment, 
nome varchar (30) not null,
idade int,
primary key (id)
)default charset = utf8mb4;
select * from Proprietarios;
select * from Carros;
create table Carros(
id int not null auto_increment, 
marca varchar (30) not null,
modelo varchar (30) not null,
ano year,
pro_id int,
foreign key (pro_id) references Proprietarios(id),
primary key (id)
)default charset = utf8mb4;

insert into Proprietarios (nome,idade) values
('Roger', 20),
('Ruan', 16),
('Zé', 30),
('Mana', 21);
insert into Carros (marca, modelo, ano, pro_id) values
('Honda', 'Civic', 2006,1),
('Toyota', 'Corrola', 2009,3),
('Chevrolet','Onix',2019,1),
('Volkswagen','Fusca',1945,2),
('Fiat', 'UNO', 2000, NULL),
('Ferrari', 'F1', 2019, 2),
('Toyota', 'Hilux', 2020,4);

-- 16. Listar a marca e o modelo de todos os carros.
select marca, modelo from Carros;

-- 17. Listar o nome dos proprietários e seus respectivos carros.
select p.nome `Nome`, c.pro_id `Carro` from
Proprietarios as p join Carros as c
on p.id = c.pro_id;

-- 18. Listar os carros fabricados antes de 2010.
select * from Carros 
where ano < 2010;

-- 19. Listar os nomes dos proprietários que possuem carros da marca 'Toyota'.
select p.nome `Nome`, c.marca `Marca` from
Proprietarios as p join Carros as c
on p.id = c.pro_id
where c.marca = 'Toyota';

-- 20. Contar o número de carros por marca.
select marca, count(*) `Quantidade de Carros`
from Carros
group by marca;

-- 21. Listar as marcas de carro que possuem mais de 5 carros cadastrados.
select marca, count(*) `Quantidade`
from Carros
group by marca
having count(*) > 5;

-- 22. Atualizar o ano do carro com ID 3 para 2015.
update Carros
set ano = 2015
where id = 3;


-- 23. Remover o carro com ID 7.
delete from Carros
where id = 7;


