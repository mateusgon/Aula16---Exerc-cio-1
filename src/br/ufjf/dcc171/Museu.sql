drop table visitante;
create table visitante
(
    id int not null generated always as identity,
    nome varchar(50) not null,
    idade int not null,
    entrada timestamp not null default current_timestamp,
    saida timestamp,
    primary key (id)
)