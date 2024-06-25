USE DARSHAN

CREATE TABLE EMPLOYEE
(	ENAME VARCHAR(25),
	CITY VARCHAR(25),
	AGE INT
)

INSERT INTO EMPLOYEE (ENAME,CITY,AGE)
VALUES	('JAY PATEL','RAJKOT',30),
		('RAHUL DAVE','BARODA',35),
		('JEET PATEL','SURAT',31),
		('VIJAY RAVAL','RAJKOT',30)

--1. Create table Employee_detail from Employee with all the columns and data

SELECT * INTO EMPLOYEE_DETAILS FROM EMPLOYEE

--2. Create table Employee_data from Employee with first two columns with no data

SELECT ENAME,CITY INTO EMPLOYEE_DATA FROM EMPLOYEE WHERE 1=2

--3. Create table Employee_info from Employee with no Data

SELECT * INTO EMPLOYEE_INFO FROM EMPLOYEE WHERE 1=2