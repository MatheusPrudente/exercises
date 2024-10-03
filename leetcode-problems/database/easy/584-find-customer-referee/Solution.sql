# Write your SQL query statement below
SELECT C.NAME FROM CUSTOMER C WHERE NVL(C.REFEREE_ID,0) != 2;
