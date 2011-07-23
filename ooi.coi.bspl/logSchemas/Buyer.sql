CREATE DATABASE IF NOT EXISTS Buyer;
USE Buyer;
CREATE TABLE IF NOT EXISTS Buyer.rfq (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,CONSTRAINT PK_rfq PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Buyer.quote (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,price varchar(32) NOT NULL,CONSTRAINT PK_quote PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Buyer.accept (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,price varchar(32) NOT NULL,address varchar(32) NOT NULL,response varchar(32) NOT NULL,CONSTRAINT PK_accept PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Buyer.reject (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,price varchar(32) NOT NULL,outcome varchar(32) NOT NULL,response varchar(32) NOT NULL,CONSTRAINT PK_reject PRIMARY KEY (ID));
CREATE TABLE IF NOT EXISTS Buyer.deliver (ID varchar(32) NOT NULL,item varchar(32) NOT NULL,address varchar(32) NOT NULL,outcome varchar(32) NOT NULL,CONSTRAINT PK_deliver PRIMARY KEY (ID));
