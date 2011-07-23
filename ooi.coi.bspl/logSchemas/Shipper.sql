CREATE DATABASE IF NOT EXISTS Shipper;
USE Shipper;
CREATE TABLE IF NOT EXISTS Shipper.ship (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,address varchar(32) NOT NULL,CONSTRAINT PK_ship PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Shipper.deliver (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,address varchar(32) NOT NULL,outcome varchar(32) NOT NULL,CONSTRAINT PK_deliver PRIMARY KEY (ID));
