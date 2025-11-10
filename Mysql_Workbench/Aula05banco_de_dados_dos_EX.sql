create database banco_da_Aula05;

-- DESENHOS ANIMADOS
create table desenhos (
id int primary key auto_increment,
nome varchar(100) not null,
criador varchar(100),
ano_lancamento int
);

create table personagens (
id int primary key auto_increment,
nome varchar(100) not null,
idade int,
desenho_id int,
foreign key (desenho_id) references desenhos(id)
);

-- MÚSICA
create table artistas (
id int primary key auto_increment,
nome varchar(100) not null,
genero varchar(50)
);

create table albuns (
id int primary key auto_increment,
titulo varchar(100) not null,
ano_lancamento int,
artista_id int,
foreign key (artista_id) references artistas(id)
);

-- LIVROS
create table autores (
id int primary key auto_increment,
nome varchar(100) not null,
nacionalidade varchar(50)
);

create table livros (
id int primary key auto_increment,
titulo varchar(100) not null,
genero varchar(50),
autor_id int,
foreign key (autor_id) references autores(id)
);

-- DESENHOS
insert into desenhos (nome, criador, ano_lancamento) values
('Tom e Jerry', 'William Hanna e Joseph Barbera', 1940),
('Os Simpsons', 'Matt Groening', 1989),
('Avatar: A Lenda de Aang', 'Michael Dante DiMartino e Bryan Konietzko', 2005);

insert into personagens (nome, idade, desenho_id) values
('Tom', NULL, 1),
('Bart Simpson', 10, 2),
('Aang', 12, 3);

update personagens set desenho_id = 3 where nome = 'Aang';
insert into personagens (nome, idade, desenho_id) values
('Homer Simpson', 40,2);

-- insert into personagens (nome, idade, desenho_id) values
-- ('Teste1', 40,2),
-- ('Teste2', 40,2),
-- ('Teste3', 40,2),
-- ('Teste4', 40,2);
-- truncate table personagens;

insert into personagens (nome, idade, desenho_id) values
('Jerry', NULL, 1),
('Lisa Simpson', 8, 2),
('Zuko', 16, 3),
('Katara', 14, 3),
('Toph', 12, 3);

-- MÚSICA
insert into artistas (nome, genero) values
('Taylor Swift', 'Pop'),
('Queen', 'Rock'),
('Anitta', 'Funk');

insert into albuns (titulo, ano_lancamento, artista_id) values
('1989', 2014, 1),
('A Night at the Opera', 1975, 2),
('Versions of Me', 2022, 3);

insert into albuns (titulo, ano_lancamento, artista_id) values
('Red', 2012, 1),
('Reputation', 2017, 1),
('Evermore', 2020, 1),
('Folklore', 2020, 1),
('Jazz', 1978, 2);

-- LIVROS
insert into autores (nome, nacionalidade) values
('J.K. Rowling', 'Britânica'),
('Machado de Assis', 'Brasileira'),
('George Orwell', 'Britânica');

insert into livros (titulo, genero, autor_id) values
('Harry Potter e a Pedra Filosofal', 'Fantasia', 1),
('Dom Casmurro', 'Romance', 2),
('1984', 'Distopia', 3);

insert into livros (titulo, genero, autor_id) values
('Livro teste', 'Teste', 2);

update livros set titulo = 'A Cartomante' where titulo = 'Livro teste';
update livros set genero = 'Ficção' where genero = 'Teste';

insert into livros (titulo, genero, autor_id) values
('Memórias Póstumas de Brás Cubas', 'Realismo', 2),
('Quincas Borba', 'Filosofia', 2),
('Animal Farm', 'Sátira', 3);
