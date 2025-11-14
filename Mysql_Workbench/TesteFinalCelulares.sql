create database Celular
default character set utf8mb4
default collate utf8mb4_general_ci;

create table Usuarios(
id int not null auto_increment, 
nome varchar (30) not null,
primary key (id)
)default charset = utf8mb4;



create table Celulares(
id int not null auto_increment, 
marca varchar (30) not null,
modelo varchar (30) not null,
sistema_operacional varchar(30),
processador varchar (30),
memoria_ram int,
usuario_id int,
foreign key (usuario_id) references Usuarios(id),
primary key (id)
)default charset = utf8mb4;

insert into Usuarios (nome) values
('Alice'),
('Bruno'),
('Carla'),
('Daniel'),
('Eduarda'),
('Felipe'),
('Gabriela'),
('Henrique'),
('Isabela'),
('João');

insert into Celulares (marca, modelo, sistema_operacional,processador, memoria_ram, usuario_id) values
('Apple', 'iPhone 13', 'IOS','A15 Bionic', 4, 1),
('Samsung', 'Galaxy S21', 'Android','Exynos 2100', 8, 2),
('Motorola', 'Moto G100', 'Android','Snapdragon 870', 8, 3),
('Xiaomi', 'Redmi Note 10', 'Android','Snapdragon 678', 6, 4),
('Apple', 'iPhone SE', 'IOS','A13 Bionic', 3, 5),
('Samsung', 'Galaxy A52', 'Android','Snapdragon 720G', 6, 6),
('Asus', 'ROG Phone 5', 'Android','Snapdragon 888', 16, 7),
('Realme', 'GT Neo 2', 'Android','Snapdragon 870', 8, 8),
('Nokia', 'G20', 'Android','MediaTek Helio G35', 4, 9),
('LG', 'Velvet', 'Android','Snapdragon 845', 6, 10),
('Sony', 'Xperia 5', 'Android','Snapdragon 855', 6, NULL),
('Huawei', 'P30 Pro', 'Android','Kirin 980', 8, NULL);

-- 32. Listar a marca e o modelo de todos os celulares.
select marca, modelo from Celulares;

-- 33. Listar o nome dos proprietários e seus respectivos celulares.
select u.nome `Nome`, c.usuario_id `Celular` from
Usuarios as u join Celulares as c
on u.id = c.usuario_id;

select u.nome `Nomes`, c.marca `Marcas`, c.modelo `Modelos` from
Usuarios as u join Celulares as c
on u.id = c.usuario_id;

-- 34. Listar os celulares com sistema operacional 'Android'.
select u.nome `Nome`, c.sistema_operacional `Marca` from
usuarios as u join Celulares as c
on u.id = c.usuario_id
where c.sistema_operacional = 'Android';

-- 35. Listar os nomes dos proprietários que possuem celulares da marca 'Samsung’
select u.nome `Nome dos Proprietários`, c.modelo `Celulares` from 
Usuarios as u join Celulares as c
on u.id = c.usuario_id where c.marca = 'Samsung';

-- 36. Contar o número de celulares por sistema operacional.
select sistema_operacional, count(*) as quantidade
from Celulares
group by sistema_operacional;

-- 37. Listar os sistemas operacionais que possuem mais de 10 celulares cadastrados.
select sistema_operacional, count(*) as quantidade
from Celulares
group by sistema_operacional
having count(*) > 10;

-- 38. Atualizar o sistema operacional do celular com ID 4 para 'iOS'.
update Celulares
set sistema_operacional = 'IOS'
where id = 4;

-- 39. Remover o celular com ID 9.
delete from Celulares
where id = 9;




