select * from jogos_que_mais_joguei;

select nome from jogos_que_mais_joguei;

select nome from jogos_que_mais_joguei order by nome desc;

select nome,lancamento from jogos_que_mais_joguei;

select * from livros where publicacao >= 2016;

select * from antiquario where quantidade > 20 and ano > 1960;

select * from livros where publicacao between 2000 and 2014;

select * from professores where disciplina like '%dor' and salario > 1500.00;

select * from professores where salario in (3000.00, 6000.00);

select nome, salario from professores where nome | salario;

select * from professores where nome like 'Maria';

select * from alunos;
update alunos set email = 'joaosilva@novoemail2.com' where nome = 'João Silva';

select distinct lancamento, nome from jogos_que_mais_joguei;

select count(*) from alunos;

select AVG(ano),MAX(ano),MIN(ano) from antiquario;