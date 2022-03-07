drop database if exists hotel;
create database hotel;

use hotel;

CREATE TABLE Hotel (
hotelName varchar(50) PRIMARY KEY NOT NULL,
location varchar(50) Not NULL
);

CREATE TABLE Room (
roomNumber int PRIMARY KEY NOT NULL,
hotelName varchar(50) NOT NULL,
occupantName varchar(50) NULL,
smoking varchar(50) NOT NULL,
occupied Boolean NOT NULL,
bedType varchar(50) NOT NULL,
roomRate double NOT NULL
);

ALTER TABLE Room
ADD CONSTRAINT A_hotelName
FOREIGN KEY (hotelName) REFERENCES Hotel(hotelName);

SELECT * FROM Room;
SELECT * FROM Hotel; 
