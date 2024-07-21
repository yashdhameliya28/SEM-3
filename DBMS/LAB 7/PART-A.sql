USE DARSHAN

CREATE TABLE EMP
(	
	EID INT,
	ENAME VARCHAR(20),
	DEPARTMENT VARCHAR(20),
	SALARY INT,
	JOININGDATE DATETIME,
	CITY VARCHAR(25)
)

INSERT INTO EMP(EID , ENAME , DEPARTMENT , SALARY , JOININGDATE , CITY)
VALUES	(101,'RAHUL','ADMIN',56000,'1-JAN-90','RAJKOT'),
		(102,'HARDIK','IT',18000,'25-SEP-90','AHMEDABAD'),
		(103,'BHAVIN','HR',25000,'14-MAY-91','BARODA'),
		(104,'BHOOMI','ADMIN',39000,'8-FEB-91','RAJKOT'),
		(105,'ROHIT','IT',17000,'23-JUL-90','JAMNAGER'),
		(106,'PRIYA','IT',9000,'18-OCT-90','AHMEDABAD'),
		(107,'BHOOMI','HR',34000,'25-DEC-91','RAJKOT')


--> PART-A

--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
--and Average_Sal, respectively.
SELECT DEPARTMENT, AVG(SALARY) AS AVERAGE_SAL, SUM(SALARY) AS TOTAL_SAL 
FROM EMP
GROUP BY DEPARTMENT

--3. Find total number of employees of EMPLOYEE table.
--the respective department name.