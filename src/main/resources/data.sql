insert into ROLE (id, authority) values (nextval('role_seq'), 'GUARDIAN');
insert into ROLE (id, authority) values (nextval('role_seq'), 'OWNER');


INSERT INTO USER (username, password , first_name, last_name, role_id) values ('user','$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC','Mateusz', 'Koss',1);
INSERT INTO USER (username, password, first_name, last_name, role_id) values ('Mark','$2a$10$IPJizmA0rxJBq9incE/PWub6B2nIDGm3z/2cIz6hAs/hgvKlQ5F9q','Marek','Nowak',2);


INSERT INTO ANIMAL (nickname, name_animal, race) values ('Puszek','Puszek', 'pies');
INSERT INTO ANIMAL (nickname, name_animal, race) values ('Max','Max', 'pies');
