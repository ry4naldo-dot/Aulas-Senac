-- DESAFIO:
-- Cenário: Considere os seguintes bancos de dados e tabelas para os exercícios:
-- ● escola:
-- ○ alunos: id, nome, data_nascimento, turma, email
-- ○ professores: id, nome, disciplina, salario
-- ● biblioteca:
-- ○ livros: id, titulo, autor, ano_publicacao, disponivel
-- ● empresa:
-- ○ funcionarios: id, nome, cargo, salario, data_admissao

-- Empresa
select * from funcionarios;

-- Escola
select * from alunos;
select * from professores;

-- Biblioteca
select * from livros;

--  Exercicios
-- 1
select * from alunos where turma like '8A';

-- 2
alter table professores add email varchar(255);
update professores set email = 'JonasPietro@email.com' where id = 4;

select nome,email from professores;

-- 3


