USE DARSHAN

--1 Retrieve top 50% record from table BORROW
SELECT TOP 50 PERCENT * FROM BORROW

--2 Display top 10% amount from table DEPOSIT.
SELECT TOP 10 PERCENT * FROM DEPOSITE

--3 Display top 25% customer who deposited more than 5000
SELECT TOP 25 PERCENT CNAME FROM DEPOSITE WHERE AMOUNT>5000

--4 Retrieve first 10% Loan Amounts.
SELECT TOP 10 PERCENT AMOUNT FROM BORROW

--5 Retrieve all unique customer names with city.
SELECT DISTINCT * FROM CUSTOMERS

--6 Retrieve all Loan records with one more column in Loan Amount as 10% extra amount
SELECT * ,AMOUNT + (AMOUNT*0.1) AS INCREMENT FROM DEPOSITE

--7 Retrieve all odd/even value loan number from Borrow table.
SELECT LOANNO FROM BORROW WHERE LOANNO%2=0 AND LOANNO%2<>0