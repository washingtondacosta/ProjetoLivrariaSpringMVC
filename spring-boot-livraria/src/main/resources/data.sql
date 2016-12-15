insert into tb_livro(livro_id, titulo, data_publicacao, numero_paginas, preco) values (1,'Sobre Mouses e Homens', '1954-11-08', 100, 11.00);
insert into tb_livro(livro_id, titulo, data_publicacao, numero_paginas, preco) values (2,'Um Estranho no Ninho', '1973-11-08', 200, 15.00);
insert into tb_livro(livro_id, titulo, data_publicacao, numero_paginas, preco) values (3,'Por Quem os Sinos Dobram', '1932-11-08', 100, 13.00);
insert into tb_livro(livro_id, titulo, data_publicacao, numero_paginas, preco) values (4,'Guerra e Paz', '1955-11-08', 140, 15.00);
insert into tb_livro(livro_id, titulo, data_publicacao, numero_paginas, preco) values (5,'As Vinhas da Ira', '1955-11-08', 300, 16.00);
insert into tb_livro(livro_id, titulo, data_publicacao, numero_paginas, preco) values (6,'Padrões de Design', '1996-11-08', 180, 14.00);
insert into tb_livro(livro_id, titulo, data_publicacao, numero_paginas, preco) values (7,'Um Conto de Duas Cidades', '1943-11-08', 400, 15.00);

insert into tb_autor(autor_id, primeiro_nome, ultimo_nome, pais) values (1, "Rui", "Barbosa", "Brasil");
insert into tb_autor(autor_id, primeiro_nome, ultimo_nome, pais) values (2, "Manoela", "Garcia", "Brasil");
insert into tb_autor(autor_id, primeiro_nome, ultimo_nome, pais) values (3, "Pablo", "Escobar", "Colômbia");
insert into tb_autor(autor_id, primeiro_nome, ultimo_nome, pais) values (4, "Garcia", "Marquez", "Colômbia");
insert into tb_autor(autor_id, primeiro_nome, ultimo_nome, pais) values (5, "Isaac", "Asimov", "Rússia");
insert into tb_autor(autor_id, primeiro_nome, ultimo_nome, pais) values (6, "Aldous", "Huxley", "Inglaterra");

insert into tb_autores_livros(autores_autor_id, livros_livro_id) values (1, 1);
insert into tb_autores_livros(autores_autor_id, livros_livro_id) values (1, 2);
insert into tb_autores_livros(autores_autor_id, livros_livro_id) values (2, 3);
insert into tb_autores_livros(autores_autor_id, livros_livro_id) values (3, 4);
insert into tb_autores_livros(autores_autor_id, livros_livro_id) values (3, 5);
insert into tb_autores_livros(autores_autor_id, livros_livro_id) values (4, 6);
insert into tb_autores_livros(autores_autor_id, livros_livro_id) values (5, 7);

insert into tb_editora(editora_id, nome, cidade) values (1, 'Campus', 'Rio de Janeiro');
insert into tb_editora(editora_id, nome, cidade) values (2, 'Makron Books', 'São Paulo');
insert into tb_editora(editora_id, nome, cidade) values (3, 'Pearson', 'São Paulo');
