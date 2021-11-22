CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
id_classe INT NOT NULL AUTO_INCREMENT,
classe VARCHAR(255),
raca VARCHAR(255),
legiao VARCHAR (255), /*Orda ou Império*/
PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem(
id_personagens INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
nivel INT,
defesa INT,
ataque INT,
skill VARCHAR(255),
fk_personagem INT ,
PRIMARY KEY (id_personagens),
FOREIGN KEY (fk_personagem) REFERENCES tb_classe (id_classe)
);

INSERT INTO tb_classe(classe, raca, legiao) VALUES
("Guerreiro", "Humano", "Império"),
("Druida","Elfo","Império"),
("Paladino","Humano","Império"),
("Guerreiro","Orck","Orda"),
("Bruxo","Orck","Orda"),
("Bardo","Orck","Orda");

INSERT INTO tb_personagem(nome, nivel, defesa, ataque, skill) VALUES
("Izak", "45" , "1500" , "1700" , "Mil Cortes Divinos"),
("Kratos", "99" , "3500" , "6700" , "Laminas do Caos"),
("Ulter", "70" , "2500" , "2000" , "Benção divina"),
("Guldan", "80" , "2000" , "3200" , "Maldição Negra"),
("Zeck", "30" , "900" , "1100" , "Lamina Eterna"),
("Mari", "100" , "4500" , "7800" , "Zero Absoluto"),
("Lass", "75" , "3500" , "4700" , "Teleporte"),
("Ridan", "50" , "1500" , "1000" , "Marionete");













