DROP DATABASE celularesDB;
CREATE DATABASE celularesDB;
USE celularesDB;

CREATE TABLE celulares(
	id int not null primary key auto_increment,
    modelo varchar(55) not null,
    nombre varchar(55) not null
);

CREATE TABLE marcas(
	id int not null primary key auto_increment,
    marca varchar(55) not null
);

ALTER TABLE celulares ADD COLUMN id_marca INT NULL;
ALTER TABLE celulares ADD CONSTRAINT id_marca FOREIGN KEY
(id_marca) REFERENCES marcas(id);

select * from celulares;

-- INSERT

INSERT INTO MARCAS(marca) VALUES ('Samsung');

INSERT INTO CELULARES(nombre, modelo, id_marca) VALUES ('Samsung A10', 'ABC123', 1);
INSERT INTO CELULARES(nombre, modelo, id_marca) VALUES ('Samsung A20', 'DEF456', 1);
INSERT INTO CELULARES(nombre, modelo, id_marca) VALUES ('Samsung A30', 'GHI789', 1);
INSERT INTO CELULARES(nombre, modelo, id_marca) VALUES ('Samsung A40', 'JKL000', 1);