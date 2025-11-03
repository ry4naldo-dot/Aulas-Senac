CREATE DATABASE InfoBeto_versão_Beta

-- Isso foi feito em casa antes da versão que eu acho a definitiva

CREATE TABLE Clientes_corrigido (
  id_cliente INT AUTO_INCREMENT PRIMARY KEY,
  nome_completo VARCHAR(255) NOT NULL,
  telefone VARCHAR(20)
);

-- Inserir dados limpos e padronizados na nova tabela Clientes
INSERT INTO Clientes_corrigido (nome_completo, telefone) VALUES
('João Silva', '99887766'),
('Maria', '88776655'),
('Pedro Souza', '77665544'),
('Ana C.', NULL);

-- Criar nova tabela Servicos corrigida

CREATE TABLE Servicos_corrigido (
  servico_id INT AUTO_INCREMENT PRIMARY KEY,
  id_cliente_ref INT,
  equipamento VARCHAR(100),
  defeito_relatado TEXT,
  data_entrada DATE,
  valor_servico DECIMAL(10,2),
  FOREIGN KEY (id_cliente_ref) REFERENCES Clientes_corrigido(id_cliente)
);

-- Serviço 1: João Silva
INSERT INTO Servicos_corrigido (id_cliente_ref, equipamento, defeito_relatado, data_entrada, valor_servico)
VALUES (1, 'Notebook Dell', 'Não liga', '2024-10-05', 150.00);

-- Serviço 2: Maria
INSERT INTO Servicos_corrigido (id_cliente_ref, equipamento, defeito_relatado, data_entrada, valor_servico)
VALUES (2, 'Celular Samsung', 'Tela quebrada', '2024-10-06', 300.00);

-- Serviço 3: Pedro Souza
INSERT INTO Servicos_corrigido (id_cliente_ref, equipamento, defeito_relatado, data_entrada, valor_servico)
VALUES (3, 'PC Gamer', 'Fonte queimada', '2024-10-06', 100.00);

-- Serviço 4: João Silva
INSERT INTO Servicos_corrigido (id_cliente_ref, equipamento, defeito_relatado, data_entrada, valor_servico)
VALUES (1, 'Notebook Dell', 'Formatar', '2024-10-07', 120.00);

-- Criar cliente Paulo 
INSERT INTO Clientes_corrigido (nome_completo, telefone)
VALUES ('Paulo', NULL);

-- Serviço 5: Paulo
INSERT INTO Servicos_corrigido (id_cliente_ref, equipamento, defeito_relatado, data_entrada, valor_servico)
VALUES (5, 'Tablet', 'Não carrega', '2024-10-08', NULL);
