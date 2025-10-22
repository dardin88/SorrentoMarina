-- Simple SQLite schema for SorrentoMarina
-- Basic tables for testing

create table if not exists TURISTA (
    id integer primary key autoincrement,
    nome varchar(32) not null,
    cognome varchar(32) not null,
    email varchar(32) not null,
    username varchar(32),
    password_turista varchar(64)
);

create table if not exists RESPONSABILE_ENTE (
    id integer primary key autoincrement,
    nome varchar(32) not null,
    cognome varchar(32) not null,
    email varchar(32) not null,
    username varchar(32),
    password_ente varchar(64)
);

create table if not exists SERVIZI (
    id integer primary key autoincrement,
    bar boolean not null,
    ristorante boolean not null,
    animazione boolean not null,
    wifi boolean not null,
    cabina boolean not null,
    beach_volley boolean not null,
    canoa boolean not null
);

create table if not exists LIDO (
    id integer primary key autoincrement,
    nome varchar(32) not null,
    indirizzo varchar(32) not null,
    telefono varchar(32) not null,
    email varchar(32) not null,
    logo varchar(64),
    prezzo_singolo real not null,
    num_righe integer not null,
    num_colonne integer not null,
    id_servizi integer not null,
    id_resp_ente integer,
    foreign key (id_resp_ente) references RESPONSABILE_ENTE(id),
    foreign key (id_servizi) references SERVIZI(id)
);

create table if not exists RESPONSABILE_LIDO (
    id integer primary key autoincrement,
    nome varchar(32) not null,
    cognome varchar(32) not null,
    email varchar(32) not null,
    username varchar(32) not null,
    password_responsabile_lido varchar(64) not null,
    id_lido integer not null,
    id_resp_ente integer not null,
    foreign key (id_lido) references LIDO(id),
    foreign key (id_resp_ente) references RESPONSABILE_ENTE(id)
);

create table if not exists PRENOTAZIONE (
    id integer primary key autoincrement,
    data_inizio date not null,
    data_fine date not null,
    num_posti integer not null,
    costo real not null,
    codice varchar(8) not null,
    id_lido integer not null,
    id_turista integer not null,
    foreign key (id_lido) references LIDO(id),
    foreign key (id_turista) references TURISTA(id)
);

-- Sample data
insert into SERVIZI(bar, ristorante, animazione, wifi, cabina, beach_volley, canoa) values (1, 1, 1, 1, 1, 1, 1);
insert into SERVIZI(bar, ristorante, animazione, wifi, cabina, beach_volley, canoa) values (1, 0, 1, 1, 1, 0, 1);
insert into SERVIZI(bar, ristorante, animazione, wifi, cabina, beach_volley, canoa) values (0, 1, 0, 1, 1, 1, 0);
insert into SERVIZI(bar, ristorante, animazione, wifi, cabina, beach_volley, canoa) values (1, 1, 1, 1, 0, 1, 1);

insert into RESPONSABILE_ENTE(nome, cognome, email, username, password_ente) values ('Antonio', 'Verdi', 'antonio.verdi@sorrentomarina.it', 'antonio', '77de68daecd823babbb58edb1c8e14d7106e83bb');
insert into RESPONSABILE_ENTE(nome, cognome, email, username, password_ente) values ('Maria', 'Neri', 'maria.neri@sorrentomarina.it', 'maria', '1b6453892473a467d07372d45eb05abc2031647a');

INSERT into LIDO (nome, indirizzo, telefono, email, logo, prezzo_singolo, num_righe, num_colonne, id_servizi, id_resp_ente) 
values('Lido Chicco d''Oro','Via Marina Grande 1, Sorrento','081-123456','info@chiccodoro.it','logo1.jpg',15.0,4,5,1,1);

INSERT into LIDO (nome, indirizzo, telefono, email, logo, prezzo_singolo, num_righe, num_colonne, id_servizi, id_resp_ente) 
values('Lido Margherita','Via Marina Piccola 2, Sorrento','081-234567','info@margherita.it','logo2.jpg',12.5,3,6,2,1);

INSERT into LIDO (nome, indirizzo, telefono, email, logo, prezzo_singolo, num_righe, num_colonne, id_servizi, id_resp_ente) 
values('Lido Nettuno','Corso Italia 100, Sorrento','081-345678','info@nettuno.it','logo3.jpg',18.0,5,4,3,1);

INSERT into LIDO (nome, indirizzo, telefono, email, logo, prezzo_singolo, num_righe, num_colonne, id_servizi, id_resp_ente) 
values('Lido Solara','Via del Mare 50, Sorrento','081-456789','info@solara.it','logo4.jpg',20.0,6,5,4,1);

insert into RESPONSABILE_LIDO(nome, cognome, email, username, password_responsabile_lido, id_lido, id_resp_ente) 
values ('Carla', 'Romano', 'carla.romano@chiccodoro.it', 'carla', '356a192b7913b04c54574d18c28d46e6395428ab',1,1);

insert into RESPONSABILE_LIDO(nome, cognome, email, username, password_responsabile_lido, id_lido, id_resp_ente) 
values ('Francesco', 'Marino', 'francesco.marino@margherita.it', 'francesco', 'da4b9237bacccdf19c0760cab7aec4a8359010b0',2,1);

insert into RESPONSABILE_LIDO(nome, cognome, email, username, password_responsabile_lido, id_lido, id_resp_ente) 
values ('Sofia', 'Costa', 'sofia.costa@nettuno.it', 'sofia', '77de68daecd823babbb58edb1c8e14d7106e83bb',3,1);

insert into RESPONSABILE_LIDO(nome, cognome, email, username, password_responsabile_lido, id_lido, id_resp_ente) 
values ('Andrea', 'Sole', 'andrea.sole@solara.it', 'andrea', '1b6453892473a467d07372d45eb05abc2031647a',4,1);

INSERT into TURISTA(nome, cognome, email, username, password_turista) 
values ('Luca', 'Ferrari', 'luca.ferrari@email.it', 'luca', '356a192b7913b04c54574d18c28d46e6395428ab');

INSERT into TURISTA(nome, cognome, email, username, password_turista) 
values ('Emma', 'Conti', 'emma.conti@email.it', 'emma', 'da4b9237bacccdf19c0760cab7aec4a8359010b0');

INSERT into TURISTA(nome, cognome, email, username, password_turista) 
values ('Matteo', 'Ricci', 'matteo.ricci@email.it', 'matteo', '77de68daecd823babbb58edb1c8e14d7106e83bb');

INSERT into TURISTA(nome, cognome, email, username, password_turista) 
values ('Sara', 'Gallo', 'sara.gallo@email.it', 'sara', '1b6453892473a467d07372d45eb05abc2031647a');

INSERT into PRENOTAZIONE(data_inizio, data_fine, num_posti, costo, codice, id_lido, id_turista) 
values('2024-06-15','2024-06-15',2,30.0,'AA1234',1,1);

INSERT into PRENOTAZIONE(data_inizio, data_fine, num_posti, costo, codice, id_lido, id_turista) 
values('2024-07-20','2024-07-20',4,50.0,'BB1234',2,2);

INSERT into PRENOTAZIONE(data_inizio, data_fine, num_posti, costo, codice, id_lido, id_turista) 
values('2024-08-10','2024-08-10',2,36.0,'CC1234',3,3);