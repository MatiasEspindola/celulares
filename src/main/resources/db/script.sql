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
