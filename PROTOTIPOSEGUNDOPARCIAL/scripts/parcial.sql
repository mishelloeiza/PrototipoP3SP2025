#DROP DATABASE parcial;
CREATE DATABASE parcial;
USE parcial;
CREATE TABLE IF NOT EXISTS usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(60) NOT NULL,
  password VARCHAR(25)NOT NULL,
  PRIMARY KEY (id_usuario) )
ENGINE = InnoDB CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS pacientes(
id_paci VARCHAR(60) NOT NULL,
nombre_paci VARCHAR(50) NOT NULL,
apellido_paci VARCHAR(60) NOT NULL,
genero_paci VARCHAR(30) NOT NULL,
direccion_paci VARCHAR(60) NOT NULL,
telefono_paci VARCHAR(60) NOT NULL,
estado_paci VARCHAR(30) NOT NULL,
PRIMARY KEY (id_paci)
 ) ENGINE = InnoDB DEFAULT CHARSET=latin1;