USE DARSHAN

--PART-A

--1. Find the length of following. (I) NULL (II) � hello � (III) BlankSELECT LEN(NULL)SELECT LEN('HELLO')--SELECT LEN()   //LEN FUNCTION REQUIRES A ARGUMENT--2. Display your name in lower & upper case.SELECT LOWER('YASH')SELECT UPPER('yash')--3. Display first three characters of your name.SELECT LEFT('YASH',3)--4. Display 3rd to 10th character of your name.SELECT SUBSTRING('DHAMELIYA YASH',3,7)--5. Write a query to convert �abc123efg� to �abcXYZefg� & �abcabcabc� to �ab5ab5ab5� using REPLACE.SELECT REPLACE('ABC123EFG','123','XYZ')SELECT REPLACE('ABCABCABC','C','5')--6. Write a query to display ASCII code for �a�,�A�,�z�,�Z�, 0, 9.SELECT ASCII('A')SELECT ASCII('a')SELECT ASCII('z')SELECT ASCII('Z')SELECT ASCII('0')SELECT ASCII('9')--7. Write a query to display character based on number 97, 65,122,90,48,57.SELECT CHAR(97)SELECT CHAR(65)SELECT CHAR(122)SELECT CHAR(90)SELECT CHAR(48)SELECT CHAR(57)--8. Write a query to remove spaces from left of a given string �hello world       �.SELECT LTRIM('HELLO WORLD           ')--9. Write a query to remove spaces from right of a given string �        hello world       �.SELECT TRIM('       HELLO WORLD        ')--10. Write a query to display first 4 & Last 5 characters of �SQL Server�.SELECT SUBSTRING('SQL SERVER',1,3)SELECT SUBSTRING('SQL SERVER',6,5)--11. Write a query to convert a string �1234.56� to number (Use cast and convert function).--SELECT CAST('1234.56' AS INT)     //NOT CONVERT STRING TO INT--12. Write a query to convert a float 10.58 to integer (Use cast and convert function).SELECT CAST(10.58 AS INT)--13. Put 10 space before your name using function.SELECT SPACE(10) + 'YASH'--14. Combine two strings using + sign as well as CONCAT ().SELECT 'YASH' + 'DHAMELIYA'SELECT CONCAT('YASH','DHAMELIYA')--15. Find reverse of �Darshan�.SELECT REVERSE('DRASHAN')--16. Repeat your name 3 times.SELECT REPLICATE('YASH',3)--PART-B--1. Find the length of FirstName and LastName columns.SELECT LEN(FIRSTNAME) FROM STUDENTSELECT LEN(LASTNAME) FROM STUDENT--2. Display FirstName and LastName columns in lower & upper case.SELECT UPPER(FIRSTNAME) FROM STUDENTSELECT LOWER(FIRSTNAME) FROM STUDENTSELECT UPPER(LASTNAME) FROM STUDENTSELECT LOWER(LASTNAME) FROM STUDENT--3. Display first three characters of FirstName column.SELECT SUBSTRING(FIRSTNAME,1,2) FROM STUDENT--4. Display 3rd to 10th character of Website column.SELECT SUBSTRING(WEBSITE,3,7) FROM STUDENT--5. Write a query to display first 4 & Last 5 characters of Website column.SELECT SUBSTRING(WEBSITE,1,3) FROM STUDENTSELECT SUBSTRING(WEBSITE,6,5) FROM STUDENT--PART-C--1. Put 10 space before FirstName using function.SELECT SPACE(10) + FIRSTNAME FROM STUDENT--2. Combine FirstName and LastName columns using + sign as well as CONCAT ().SELECT FIRSTNAME + LASTNAME FROM STUDENTSELECT CONCAT(FIRSTNAME,LASTNAME) FROM STUDENT--3. Combine all columns using + sign as well as CONCAT ().--SELECT FIRSTNAME + LASTNAME + WEBSITE + CITY + SADDRESS + STUID FROM STUDENT       ///ERRORSELECT CONCAT(FIRSTNAME , LASTNAME , WEBSITE , CITY , SADDRESS , STUID) FROM STUDENT--4. Find reverse of FirstName column.SELECT REVERSE(FIRSTNAME) FROM STUDENT--5. Repeat FirstName column 3 timesSELECT REPLICATE(FIRSTNAME,3) FROM STUDENT--6. Give the Names which contains 5 characters.SELECT FIRSTNAME FROM STUDENT WHERE LEN(FIRSTNAME) = 5--7. Combine the result as <FirstName> Lives in <City>.SELECT CONCAT_WS('LIVES',FIRSTNAME,CITY) FROM STUDENT--8. Combine the result as Student_ID of < FirstName > is <StuID> .SELECT CONCAT_WS('IS',FIRSTNAME,STUID) FROM STUDENT