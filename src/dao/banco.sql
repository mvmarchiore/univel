DROP DATABASE IF EXISTS univel;
CREATE DATABASE UNIVEL;

CREATE TABLE usuarios (
nome_usuario varchar(50) NOT NULL UNIQUE,
senha_hash VARCHAR(64) NOT NULL,
data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP,
tipo VARCHAR(1) CHECK ( tipo IN ('u','a'))DEFAULT 'U',
ativo VARCHAR(1) CHECK (ativo IN ('t','f'))DEFAULT 'T'
);

INSERT INTO usuarios Values 
('admcelia','123', current_date(),'A','T');