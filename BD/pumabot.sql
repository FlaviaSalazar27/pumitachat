-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2019-10-31 03:15:54.766

-- tables
-- Table: Anfitrion
CREATE TABLE Anfitrion (
    id_anfitrion int NOT NULL,
    nombre_anfitrion varchar(100) NOT NULL,
    apellido_anfitrion varchar(100) NOT NULL,
    telefono int NOT NULL,
    correo varchar(100) NOT NULL,
    CONSTRAINT Anfitrion_pk PRIMARY KEY (id_anfitrion)
);

-- Table: Bus
CREATE TABLE Bus (
    id_bus int NOT NULL,
    placa varchar(50) NOT NULL,
    nombre_conductor varchar(150) NOT NULL,
    Horario_id_horario int NOT NULL,
    CONSTRAINT Bus_pk PRIMARY KEY (id_bus)
);

-- Table: Horario
CREATE TABLE Horario (
    id_horario int NOT NULL,
    salida time NOT NULL,
    llegada time NOT NULL,
    Ruta_id_ruta int NOT NULL,
    CONSTRAINT Horario_pk PRIMARY KEY (id_horario)
);

-- Table: Informaciones
CREATE TABLE Informaciones (
    id_informaciones int NOT NULL,
    informacion varchar(500) NOT NULL,
    CONSTRAINT Informaciones_pk PRIMARY KEY (id_informaciones)
);

-- Table: Parada
CREATE TABLE Parada (
    id_parada int NOT NULL,
    nombre_parada varchar(250) NOT NULL,
    latitud varchar(100) NOT NULL,
    longitud varchar(100) NOT NULL,
    CONSTRAINT Parada_pk PRIMARY KEY (id_parada)
);

-- Table: Pdf
CREATE TABLE Pdf (
    id_pdf int NOT NULL,
    URL varchar(100) NOT NULL,
    nombre_pdf varchar(100) NOT NULL,
    CONSTRAINT Pdf_pk PRIMARY KEY (id_pdf)
);

-- Table: Ruta
CREATE TABLE Ruta (
    id_ruta int NOT NULL,
    nombre_ruta varchar(250) NOT NULL,
    Pdf_id_pdf int NOT NULL,
    CONSTRAINT Ruta_pk PRIMARY KEY (id_ruta)
);

-- Table: Ruta_Parada
CREATE TABLE Ruta_Parada (
    id_ruta_parada int NOT NULL,
    Ruta_id_ruta int NOT NULL,
    Parada_id_parada int NOT NULL,
    CONSTRAINT Ruta_Parada_pk PRIMARY KEY (id_ruta_parada)
);

-- Table: Tarifario
CREATE TABLE Tarifario (
    id_tarifa int NOT NULL,
    tarifa varchar(100) NOT NULL,
    Pdf_id_pdf int NOT NULL,
    CONSTRAINT Tarifario_pk PRIMARY KEY (id_tarifa)
);

-- Table: Usuario
CREATE TABLE Usuario (
    id_usuario int NOT NULL,
    nombre_usuario varchar(100) NOT NULL,
    apellido_usuario varchar(100) NOT NULL,
    telefono int NOT NULL,
    correo varchar(100) NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (id_usuario)
);

-- Table: bus_anfitrion
CREATE TABLE bus_anfitrion (
    id_bus_anfitrion int NOT NULL,
    Bus_id_bus int NOT NULL,
    Anfitrion_id_anfitrion int NOT NULL,
    CONSTRAINT bus_anfitrion_pk PRIMARY KEY (id_bus_anfitrion)
);

-- foreign keys
-- Reference: Bus_Horario (table: Bus)
ALTER TABLE Bus ADD CONSTRAINT Bus_Horario FOREIGN KEY Bus_Horario (Horario_id_horario)
    REFERENCES Horario (id_horario);

-- Reference: Horario_Ruta (table: Horario)
ALTER TABLE Horario ADD CONSTRAINT Horario_Ruta FOREIGN KEY Horario_Ruta (Ruta_id_ruta)
    REFERENCES Ruta (id_ruta);

-- Reference: Ruta_Parada_Parada (table: Ruta_Parada)
ALTER TABLE Ruta_Parada ADD CONSTRAINT Ruta_Parada_Parada FOREIGN KEY Ruta_Parada_Parada (Parada_id_parada)
    REFERENCES Parada (id_parada);

-- Reference: Ruta_Parada_Ruta (table: Ruta_Parada)
ALTER TABLE Ruta_Parada ADD CONSTRAINT Ruta_Parada_Ruta FOREIGN KEY Ruta_Parada_Ruta (Ruta_id_ruta)
    REFERENCES Ruta (id_ruta);

-- Reference: Ruta_Pdf (table: Ruta)
ALTER TABLE Ruta ADD CONSTRAINT Ruta_Pdf FOREIGN KEY Ruta_Pdf (Pdf_id_pdf)
    REFERENCES Pdf (id_pdf);

-- Reference: Tarifario_Pdf (table: Tarifario)
ALTER TABLE Tarifario ADD CONSTRAINT Tarifario_Pdf FOREIGN KEY Tarifario_Pdf (Pdf_id_pdf)
    REFERENCES Pdf (id_pdf);

-- Reference: bus_anfitrion_Anfitrion (table: bus_anfitrion)
ALTER TABLE bus_anfitrion ADD CONSTRAINT bus_anfitrion_Anfitrion FOREIGN KEY bus_anfitrion_Anfitrion (Anfitrion_id_anfitrion)
    REFERENCES Anfitrion (id_anfitrion);

-- Reference: bus_anfitrion_Bus (table: bus_anfitrion)
ALTER TABLE bus_anfitrion ADD CONSTRAINT bus_anfitrion_Bus FOREIGN KEY bus_anfitrion_Bus (Bus_id_bus)
    REFERENCES Bus (id_bus);

-- End of file.

