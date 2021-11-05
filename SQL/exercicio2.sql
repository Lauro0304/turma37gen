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






