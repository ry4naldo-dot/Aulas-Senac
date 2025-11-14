-- Empresa:
-- funcionarios: id, nome, cargo, salario, departamento_id
-- departamentos: id, nome

create database Empresas
default character set utf8mb4
default collate utf8mb4_general_ci;

create table departamento(
id int not null auto_increment, 
nome varchar (30) not null,
primary key (id)
)default charset = utf8mb4;



create table Funcionarios(
id int not null auto_increment, 
nome varchar (30) not null,
cargo varchar (30) not null,
admisao date,
salario int,
depart_id int,
foreign key (depart_id) references departamento(id),
primary key (id)
)default charset = utf8mb4;

insert into departamento values
(default, 'Vendas'),
(default, 'Marketing'),
(default, 'Zelador'),
(default, 'Cozinheiro'),
(default, 'TI'),
(default, 'Segurança'),
(default, 'Recepção');

select * from departamento;
select * from Funcionarios;
insert into Funcionarios (nome,cargo,admisao,salario,depart_id)values
('Roger', 'Vendedor','2017-04-18' ,2000 ,1),
('Zé', 'Merketing','2005-10-29' ,1000 ,2),
('João', 'Cozinheiro','2021-07-09' ,3050 ,4),
('Ruan', 'Limpador Profissional de pó','2024-06-02' ,5000 ,3),
('Ryan', 'Em house', '2023-05-30', 2160, 5),
('Kelvin', 'Agiota', '2022-12-31', 500,1),
('Julia', 'Instagram', '2020-01-01',1560,2),
('Ana', 'Facebook', '2016-08-19',1560,2),
('Clara', 'X', '2024-08-29', 1560,2),
('Maria', 'Youtube', '2023-06-17',6569,2),
('Eduarda', 'Canva', '2024-07-05',6569,2),
('Mario', 'Carro do ovo', '2000-01-19',1560,2),
('Eduardo', 'Carro do picole', '2006-10-03',1560,2),
('Pedro', 'Navegador de web', '2025-02-19',3000,2),
('Isaac', 'IA dos marketing', '2023-09-28',17,2),
('Willy Wonka', 'Destribuidor de chocolates', '1999-07-11',550,2),
('Luis', 'HyperGood', '2025-10-09', 1235,2);
-- truncate table funcionarios;

-- 1. Listar o nome de todos os funcionários.
select nome from Funcionarios;

-- 2. Listar o nome e o cargo de todos os funcionários que trabalham no departamento de 'Vendas'.
select f.nome `Nome do Funcionário`, f.cargo `Cargo`, d.nome `Departamento` from 
Funcionarios as f join departamento as d
on d.id = f.depart_id where d.nome = 'Vendas';

-- 3. Listar o nome dos departamentos e o número de funcionários em cada um.
select d.nome `Departamento`, f.id `Número do funcionário` from
departamento as d join Funcionarios as f
on d.id = f.depart_id
order by f.id asc;

-- 4. Listar o nome dos funcionários e seus respectivos departamentos.
select f.nome `Nome dos funcionários`, d.nome `Departamento` from
Funcionarios as f join departamento as d
on d.id = f.depart_id;

-- 5. Listar os nomes dos funcionários que ganham mais de 5000.
select * from Funcionarios
where salario > 5000;

-- 6. Listar os nomes dos funcionários que trabalham no departamento de 'TI' ou 'Marketing'.
select f.nome `Nome do Funcionário`, f.cargo `Cargo`, d.nome `Departamento` from 
Funcionarios as f join departamento as d
on d.id = f.depart_id where d.nome = 'TI' or d.nome = 'Marketing';

-- 7. Listar os nomes dos funcionários que foram admitidos entre '2020-01-01' e '2022-12-31'.
select nome from Funcionarios
where admisao >= '2020-01-01' and admisao <= '2022-12-31';


-- 8. Listar os nomes dos funcionários cujo nome começa com a letra 'M'.
select * from Funcionarios
where nome like 'M%';

-- 9. Listar os cargos distintos presentes na tabela "funcionarios".
select distinct cargo from funcionarios;
 
-- 10. Calcular a média salarial dos funcionários.
select AVG(salario) from funcionarios;

-- 11. Encontrar o funcionário com o maior salário.
select MAX(salario) from funcionarios;

-- 12. Contar o número de funcionários por departamento.
select d.nome `Departamento`, count(f.id) `Número de Funcionários`
from departamento d
left join Funcionarios f on f.depart_id = d.id
group by d.id;

-- 13. Listar os departamentos que possuem mais de 10 funcionários.
select d.nome `Departamento`, COUNT(f.depart_id) `Mais funcionários`
from departamento d
join Funcionarios f on f.depart_id = d.id
group by d.id
having COUNT(f.id) > 10;

-- 14. Atualizar o cargo do funcionário com ID 5 para 'Analista de Sistemas'.
update Funcionarios set cargo = 'Analista de Sistemas' where id = 5;

-- 15. Remover o funcionário com ID 10.
delete from Funcionarios where id = 10;

