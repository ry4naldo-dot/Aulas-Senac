-- 1. Nome dos personagens e nome do desenho
select p.nome as personagem, d.nome as desenho
from personagens p
join desenhos d on p.desenho_id = d.id;

-- 2. Nome dos álbuns e nome do artista
select a.titulo as album, ar.nome as artista
from albuns a
join artistas ar on a.artista_id = ar.id;

-- 3. Título dos livros e nacionalidade do autor
select l.titulo as livro, au.nacionalidade
from livros l
join autores au on l.autor_id = au.id;

-- 4. Todos os personagens, mesmo sem desenho
select p.nome as personagem, d.nome as desenho
from personagens p
left join desenhos d on p.desenho_id = d.id;

-- 5. Todos os desenhos, mesmo sem personagens
select d.nome as desenho, p.nome as personagem
from desenhos d
left join personagens p on p.desenho_id = d.id;

-- 6. Todos os álbuns, mesmo sem artista
select a.titulo as album, ar.nome as artista
from albuns a
left join artistas ar on a.artista_id = ar.id;

-- 7. Todos os artistas, mesmo sem álbuns
select ar.nome as artista, a.titulo as album
from artistas ar
left join albuns a on a.artista_id = ar.id;

-- 8. Todos os livros, mesmo sem autor
select l.titulo as livro, au.nome as autor
from livros l
left join autores au on l.autor_id = au.id;

-- 9. Todos os autores, mesmo sem livros
select au.nome as autor, l.titulo as livro
from autores au
left join livros l on l.autor_id = au.id;

-- 10. Personagens maiores de 18 anos e seus desenhos
select p.nome as personagem, d.nome as desenho
from personagens p
join desenhos d on p.desenho_id = d.id
where p.idade > 18;

-- 11. Álbuns lançados antes de 2000 e nome do artista
select a.titulo as album, ar.nome as artista
from albuns a
join artistas ar on a.artista_id = ar.id
where a.ano_lancamento < 2000;

-- 12. Livros de autores brasileiros
select l.titulo as livro
from livros l
join autores au on l.autor_id = au.id
where au.nacionalidade = 'Brasileira';

-- 13. Personagens e desenhos ordenados pelo nome do desenho
select p.nome as personagem, d.nome as desenho
from personagens p
join desenhos d on p.desenho_id = d.id
order by d.nome;

-- 14. Álbuns e artistas ordenados por ano de lançamento decrescente
select a.titulo as album, ar.nome as artista
from albuns a
join artistas ar on a.artista_id = ar.id
order by a.ano_lancamento desc;

-- 15. Livros e autores ordenados pelo título do livro
select l.titulo as livro, au.nome as autor
from livros l
join autores au on l.autor_id = au.id
order by l.titulo;

-- 16. Quantos personagens pertencem a cada desenho
select d.nome as desenho, COUNT(p.id) as total_personagens
from desenhos d
left join personagens p on p.desenho_id = d.id
group by d.id;

-- 17. Média de idade dos personagens por desenho
select d.nome as desenho, AVG(p.idade) as idade_media
from desenhos d
join personagens p on p.desenho_id = d.id
group by d.id;

-- 18. Artistas com mais de 3 álbuns
select ar.nome as artista, COUNT(a.id) as total_albuns
from artistas ar
join albuns a on a.artista_id = ar.id
group by ar.id
having COUNT(a.id) > 3;

-- 19. Autores com livros em mais de um gênero
select au.nome as autor, COUNT(DISTINCT l.genero) as generos
from autores au
join livros l on l.autor_id = au.id
group by au.id
having COUNT(DISTINCT l.genero) > 1;

-- 20. Desenhos com personagens cuja idade média é maior que 30
select d.nome as desenho, AVG(p.idade) as idade_media
from desenhos d
join personagens p on p.desenho_id = d.id
group by d.id
having AVG(p.idade) > 30;

