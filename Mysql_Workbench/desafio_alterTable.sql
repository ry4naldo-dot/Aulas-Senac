create database desafio_alterTable
default character set utf8mb4
default collate utf8mb4_general_ci;

use desafio_alterTable;

create table jogos_que_mais_joguei(
id int not null auto_increment,
nome varchar(50) not null,
lancamento date,
plataforma varchar(100) not null,
genero varchar(25) not null,
desenvolvedora varchar(50) not null,
publicadora varchar(50) not null,
primary key (id)
)default charset = utf8mb4;

alter table jogos_que_mais_joguei add column duracao varchar(50);

alter table jogos_que_mais_joguei add unique (nome);

desc jogos_que_mais_joguei;
select * from jogos_que_mais_joguei;

drop database desafio_alterTable;
drop table jogos_que_mais_joguei;

insert into jogos_que_mais_joguei values
(default, 'Elden Ring', '2022-02-25', 'Ps5, Ps4, Microsoft Windows, Xbox Series X e Series S, Xbox One', 'RPG de ação, soulslike', 'From Software', 'Bandai Namco', '60 Horas'),
(default, 'Red Dead Redemption 2', '2018-10-26', 'Ps4, Xbox One, PC', 'Ação - aventura', 'Rockstar', 'Rockstar', '65 Horas'),
(default, 'Halo:CE', '2001-11-15', 'Xbox', 'FPS', 'Bungie', 'Microsoft', '10 Horas'),
(default, 'Stardew Valley', '2016-02-26', 'Ps4, PC, Xbox One, PS Vita, Nintendo Switch', 'RPG, simulação, indie', 'ConcernedApe', 'Chucklefish', '168 Horas'),
(default, 'Halo Reach', '2010-09-14', 'Xbox 360', 'FPS', 'Bungie', 'Microsoft', '8 Horas');