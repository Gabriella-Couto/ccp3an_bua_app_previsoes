insert into Dias_Semana(id, dia) values (1, 'Domingo');
insert into Dias_Semana(id, dia) values (2, 'Segunda-Feira');
insert into Dias_Semana(id, dia) values (3, 'Terça-Feira');
insert into Dias_Semana(id, dia) values (4, 'Quarta-Feira');
insert into Dias_Semana(id, dia) values (5, 'Quinta-Feira');
insert into Dias_Semana(id, dia) values (6, 'Sexta-Feira');
insert into Dias_Semana(id, dia) values (7, 'Sábado');

insert into Cidades(id, nome, latitude, longitude) values (1, 'São Paulo', -23.590510, -46.660463);

insert into Usuarios (id, login, senha) values (1, 'admin@usjt.com', '123456');


insert into Previsoes(id, id_diaSemana, min, max, humidade, descricao, data, hora, id_cidade) values (1, 2, 26.0, 31.9, 57, 'Sol. Pancadas de chuva a qualquer hora do dia.', CURRENT_TIMESTAMP(), '15:45', 1);
insert into Previsoes(id, id_diaSemana, min, max, humidade, descricao, data, hora, id_cidade) values (2, 3, 21.7, 28.7, 65, 'Sol com pancadas de chuva à tarde.', CURRENT_TIMESTAMP(), '12:00', 1);
insert into Previsoes(id, id_diaSemana, min, max, humidade, descricao, data, hora, id_cidade) values (3, 4, 20.1, 25.0, 64, 'Dia nublado, sem previsão de chuva.', CURRENT_TIMESTAMP(), '09:00', 1);
