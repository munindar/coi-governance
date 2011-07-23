CREATE DATABASE IF NOT EXISTS Seller;
USE Seller;
CREATE TABLE IF NOT EXISTS Seller.rfq (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,CONSTRAINT PK_rfq PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Seller.quote (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,price varchar(32) NOT NULL,CONSTRAINT PK_quote PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Seller.accept (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,price varchar(32) NOT NULL,address varchar(32) NOT NULL,response varchar(32) NOT NULL,CONSTRAINT PK_accept PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Seller.reject (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,price varchar(32) NOT NULL,outcome varchar(32) NOT NULL,response varchar(32) NOT NULL,CONSTRAINT PK_reject PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Seller.ship (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,address varchar(32) NOT NULL,CONSTRAINT PK_ship PRIMARY KEY (ID));
