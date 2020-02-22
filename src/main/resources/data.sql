insert into ROLE (id, authority) values (nextval('role_seq'), 'GUARDIAN');
insert into ROLE (id, authority) values (nextval('role_seq'), 'OWNER');
insert into ROLE (id, authority) values (nextval('role_seq'), 'ADMIN');


INSERT INTO USER (username, password , first_name, last_name, email, role_id) values ('user','$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC','Mateusz', 'Koss','use@ol.pl', 1);
INSERT INTO USER (username, password , first_name, last_name, email, role_id) values ('user1','$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC','Mateusz', 'Koss','use@ol.pl', 1);
INSERT INTO USER (username, password, first_name, last_name, email, role_id) values ('Mark','$2a$10$IPJizmA0rxJBq9incE/PWub6B2nIDGm3z/2cIz6hAs/hgvKlQ5F9q','Marek','Nowak','use@ol.pl', 2);
INSERT INTO USER (username, password, first_name, last_name, email, role_id) values ('Mateusz','$2a$10$IPJizmA0rxJBq9incE/PWub6B2nIDGm3z/2cIz6hAs/hgvKlQ5F9q','Mateusz','Max','mati@ol.pl', 3);


INSERT INTO ANIMAL (nickname, name_animal, race) values ('Puszek','Puszek', 'pies');
INSERT INTO ANIMAL (nickname, name_animal, race) values ('Max','Max', 'pies');
commit ;