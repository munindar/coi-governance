CREATE DATABASE IF NOT EXISTS ANF;
USE ANF;
CREATE TABLE IF NOT EXISTS ANF.launch (binding varchar(32) NOT NULL,CONSTRAINT PK_launch PRIMARY KEY (binding));
CREATE TABLE IF NOT EXISTS ANF.done (binding varchar(32) NOT NULL,confirm varchar(32) NOT NULL,CONSTRAINT PK_done PRIMARY KEY (binding));
