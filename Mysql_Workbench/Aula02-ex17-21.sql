-- 17. Criar banco de dados "rh"
Create database rh 
default character set utf8mb4 
default collate utf8mb4_general_ci;
use rh;

-- 18. Criar tabela "funcionarios"
create table funcionarios (
nome varchar(100),
cargo varchar(100),
salario decimal(10,2)
)default charset = utf8mb4;

-- 19. adicionaando o id com chave primaria com auto incremento no inicio
alter table funcionarios add id int auto_increment primary key first;

-- 20. Inserindo um funcionario
insert into funcionarios values
(default, 'Arthur Morgan', 'Procurado', 1000.00);

select * from funcionarios;

-- 21. Renomear a coluna "salario" para "remuneracao"
alter table funcionarios 
change column salario remuneracao decimal(10,2);

