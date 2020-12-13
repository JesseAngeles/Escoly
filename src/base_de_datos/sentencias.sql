DROP DATABASE IF EXISTS DBEscoly;

CREATE DATABASE DBEscoly;

USE DBEscoly;

CREATE TABLE IF NOT EXISTS Administrativos (
    adm_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    adm_nombre VARCHAR(255) NOT NULL,
    adm_correo VARCHAR(255) NOT NULL UNIQUE,
    adm_contrasena VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Profesores (
    pro_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    pro_nombre VARCHAR(255) NOT NULL,
    pro_apellidoP VARCHAR(255) NOT NULL,
    pro_apellidoM VARCHAR(255) NOT NULL,
    pro_correo VARCHAR(255) NOT NULL UNIQUE,
    pro_contrasena VARCHAR(255) NOT NULL,
    pro_grupo VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Alumnos (
    alu_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    pro_id INT UNSIGNED,
    alu_nombre VARCHAR(255) NOT NULL,
    alu_apellidoP VARCHAR(255) NOT NULL,
    alu_apellidoM VARCHAR(255) NOT NULL,
    alu_estado ENUM('1','2','3','4'),
    FOREIGN KEY (pro_id) REFERENCES Profesores(pro_id)
);

CREATE TABLE IF NOT EXISTS Tutores (
    tut_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    alu_id INT UNSIGNED,
    tut_nombre VARCHAR(255) NOT NULL,
    tut_apellidoP VARCHAR(255) NOT NULL,
    tut_apellidoM VARCHAR(255) NOT NULL,
    tut_correo VARCHAR(255) NOT NULL UNIQUE,
    tut_contrasena VARCHAR(255) NOT NULL,
    FOREIGN KEY (alu_id) REFERENCES Alumnos(alu_id)
);

DESC Administrativos;
DESC Profesores;
DESC Alumnos;
DESC Tutores;