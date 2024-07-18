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

--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.SELECT DEPARTMENT, MAX(SALARY) AS MAXIMUM, MIN(SALARY) AS MINIMUM FROM EMP GROUP BY DEPARTMENT  --2. Display Total, and Average salary of all employees. Label the columns Total_Sal 
--and Average_Sal, respectively.
SELECT DEPARTMENT, AVG(SALARY) AS AVERAGE_SAL, SUM(SALARY) AS TOTAL_SAL 
FROM EMP
GROUP BY DEPARTMENT

--3. Find total number of employees of EMPLOYEE table.SELECT COUNT(EID) AS TOTAL_EMPLOYEEFROM EMP--4. Find highest salary from Rajkot city.SELECT CITY, MAX(SALARY) AS MAX_SALFROM EMPWHERE CITY = 'RAJKOT'GROUP BY CITY--5. Give maximum salary from IT department.SELECT DEPARTMENT, MAX(SALARY) AS MAX_SALFROM EMPWHERE DEPARTMENT = 'IT'GROUP BY DEPARTMENT--6. Count employee whose joining date is after 8-feb-91.SELECT DEPARTMENT, COUNT(EID) AS TOTAL_EMPLOYEEFROM EMPWHERE JOININGDATE > '8-FEB-91'GROUP BY DEPARTMENT--7. Display average salary of Admin department.SELECT DEPARTMENT, AVG(SALARY) AS AVERAGE_SALFROM EMPWHERE DEPARTMENT = 'ADMIN'GROUP BY DEPARTMENT--	8. Display total salary of HR department.SELECT DEPARTMENT, SUM(SALARY) AS TOTAL_SALFROM EMPWHERE DEPARTMENT = 'HR'GROUP BY DEPARTMENT--9. Count total number of cities of employee without duplication.SELECT DISTINCT CITY, COUNT(CITY) AS NUMBER_EMPLOYEEFROM EMPGROUP BY CITY--10. Count unique departments.SELECT DISTINCT DEPARTMENT, COUNT(DEPARTMENT) AS NUMBER_EMPLOYEEFROM EMPGROUP BY DEPARTMENT--11. Give minimum salary of employee who belongs to Ahmedabad.SELECT CITY, MIN(SALARY) AS MINIMUM_SALFROM EMPWHERE CITY = 'AHMEDABAD'GROUP BY CITY--12. Find city wise highest salary.SELECT CITY, MAX(SALARY) AS MAXIMUM_SALFROM EMPGROUP BY CITY--13. Find department wise lowest salary.SELECT DEPARTMENT, MAX(SALARY) AS MINIMUM_SALFROM EMPGROUP BY DEPARTMENT--14. Display city with the total number of employees belonging to each city.SELECT CITY, COUNT(EID) AS TOTAL_EMPFROM EMPGROUP BY CITY--15. Give total salary of each department of EMP table.SELECT DEPARTMENT, SUM(SALARY) AS TOTAL_SALFROM EMPGROUP BY DEPARTMENT--16. Give average salary of each department of EMP table without displaying 
--the respective department name.SELECT AVG(SALARY) AS AVERAGE_SALFROM EMPGROUP BY DEPARTMENT