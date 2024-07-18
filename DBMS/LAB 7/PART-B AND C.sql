USE DARSHAN

--> PART-B

--1. Count the number of employees living in Rajkot.
SELECT CITY, COUNT(EID)
FROM EMP
WHERE CITY = 'RAJKOT'
GROUP BY CITY

--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
SELECT DEPARTMENT,(MAX(SALARY) - MIN(SALARY)) AS DIFFERENCE 
FROM EMP
GROUP BY DEPARTMENT

--3. Display the total number of employees hired before 1st January, 1991.
SELECT DEPARTMENT, COUNT(EID) 
FROM EMP
WHERE JOININGDATE < '1-JAN-1991'
GROUP BY DEPARTMENT


--> PART-C
--1. Count the number of employees living in Rajkot or Baroda.
SELECT CITY, COUNT(EID) AS TOTAL_EMPLOYEE
FROM EMP
WHERE CITY IN('RAJKOT' , 'BARODA')

--2. Display the total number of employees hired before 1st January, 1991 in IT department.
SELECT COUNT(EID) AS TOTAL_EMPLOYEE
FROM EMP
WHERE DEPARTMENT = 'ID' AND JOININGDATE = '1-JAN-1991'

--3. Find the Joining Date wise Total Salaries.
SELECT JOININGDATE, SUM(SALARY) AS TOTAL_SAL
FROM EMP
GROUP BY JOININGDATE

--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.
SELECT DEPARTMENT, CITY , MAX(SALARY) AS MAXIMUM_SAL
FROM EMP
WHERE CITY LIKE 'R%'
GROUP BY DEPARTMENT, CITY