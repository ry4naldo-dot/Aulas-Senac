create database InfoBeto
default character set utf8mb4
default collate utf8mb4_general_ci;

use InfoBeto;

-- Tabela 1: Clientes

CREATE TABLE Clientes (
id_cliente VARCHAR(10), -- Beto disse que o ID podia ser o apelido
nome_completo TEXT,
telefone INT -- Ele achou que número era sempre 'INT'
);

INSERT INTO Clientes (id_cliente, nome_completo, telefone) VALUES
('JOAO', ' joao silva', 99887766),
('maria', 'Maria (vizinha)', 88776655),
('PEDRO', 'PEDRO SOUZA', 77665544),
('JOAO', 'Joao Silva', 99887766), -- ID duplicado, nome diferente?
('ana', 'Ana C.', NULL); -- Telefone nulo

select * from Clientes;

alter table Clientes
drop column id_cliente;

alter table Clientes add id_cliente int not null auto_increment primary key first;

alter table Clientes
modify column nome_completo varchar(255) not null;

alter table Clientes
modify column telefone varchar(20);

-- Tabela 2: Serviços

CREATE TABLE Servicos (
servico_id INT,
id_cliente_ref VARCHAR(50), -- Chave para o cliente
equipamento VARCHAR(100),
defeito_relatado TEXT,
data_entrada VARCHAR(20), -- Salvo como texto
valor_servico VARCHAR(50) -- Beto colocou "R$" junto
);

select * from Servicos;

INSERT INTO Servicos (servico_id, id_cliente_ref, equipamento, defeito_relatado,
data_entrada, valor_servico) VALUES
(1, 'JOAO', 'Notbook Dell', 'nao liga', '05/10/2024', '150.00'),
(2, 'maria', 'Celular Sansung', 'Tela quebrada', '06/10/2024', 'R$ 300,00'),
(3, 'PEDRO', 'PC Gamer', 'fonte keimada', '06-10-2024', 'R$ 100,00'),
(4, 'JOAO', 'Notbook Dell', 'formatar', '07/10/2024', '120'),
(5, 'paulo', 'Tablet', 'nao carrega', '08/10/2024', 'N/A'); -- Cliente "paulo" não existe em Clientes!

alter table Servicos
modify column servico_id int not null auto_increment primary key;

alter table Servicos
drop column id_cliente_ref;

alter table Servicos add constraint id_cliente_ref foreign key (servico_id) references Clientes(id_cliente);

update Servicos
set valor_servico = '0'
where servico_id = '5';

-- drop table Servicos;
-- drop table Clientes;

alter table Servicos
modify column valor_servico decimal(10,2);


INSERT INTO Clientes (id_cliente, nome_completo, telefone) VALUES
(deafult, 'Paulo', NULL);

update Clientes set nome_completo = 'João Silva' where nome_completo = ' joao silva';

delete from Clientes where id_cliente = 4;
delete from Clientes where id_cliente = 4;

update Servicos
set equipamento = 'Notebook Dell'
where servico_id = '1';

update Servicos
set equipamento = 'Celular Samsumg'
where servico_id = '2';

update Servicos
set defeito_relatado = 'Fonte queimada'
where servico_id = '3';

update Servicos
set defeito_relatado = 'Não Liga'
where servico_id = '1';

update Servicos
set defeito_relatado = 'Não Carrega'
where servico_id = '5';
