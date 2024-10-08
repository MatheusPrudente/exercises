# [577. Employee Bonus](https://leetcode.com/problems/employee-bonus/description/)
<code>Easy</code>

<br>

Table: <code>Employee</code>
> | Column Name | Type    |
> |-------------|---------|
> | empId       | int     |
> | name        | varchar |
> | supervisor  | int     |
> | salary      | int     |
> 
> empId is the column with unique values for this table.
> Each row of this table indicates the name and the ID of an employee in addition to their salary and the id of their manager.
 

Table: <code>Bonus</code>
> | Column Name | Type |
> |-------------|---------|
> | empId       | int  |
> | bonus       | int  |
> 
> empId is the column of unique values for this table.
> empId is a foreign key (reference column) to empId from the Employee table.
> Each row of this table contains the id of an employee and their respective bonus.
 

Write a solution to report the name and bonus amount of each employee with a __bonus less__ than <code>1000</code>.  
Return the result table in __any order__.  
The result format is in the following example.  

 

### Example 1:

#### Example 1:
> __Input:__   
> Employee table: 
> | empId | name   | supervisor | salary |
> |-------|--------|------------|--------|
> | 3     | Brad   | null       | 4000   |
> | 1     | John   | 3          | 1000   |
> | 2     | Dan    | 3          | 2000   |
> | 4     | Thomas | 3          | 4000   |
>
> Bonus table:
> | empId | bonus |
> |-------|-------|
> | 2     | 500   |
> | 4     | 2000  |
>   
> __Output:__   
> | name | bonus |
> |------|-------|
> | Brad | null  |
> | John | null  |
> | Dan  | 500   |
