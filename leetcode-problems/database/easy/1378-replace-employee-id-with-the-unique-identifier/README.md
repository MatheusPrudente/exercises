[1378. Replace Employee ID With The Unique Identifier](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description/)

<code>Easy</code>

<br>

Table: <code>Employees</code>
> | Column Name   | Type    |
> |---------------|---------|
> | id            | int     |
> | name          | varchar |
>
> id is the primary key (column with unique values) for this table.  
> Each row of this table contains the id and the name of an employee in a company.  
 

Table: <code>EmployeeUNI</code>

> | Column Name   | Type    |
> |---------------|---------|
> | id            | int     |
> | unique_id     | int     |
>
> (id, unique_id) is the primary key (combination of columns with unique values) for this table.  
> Each row of this table contains the id and the corresponding unique id of an employee in the company.  
 
<br>

Write a solution to show the __unique ID__ of each user, If a user does not have a unique ID replace just show <code>null</code>.
Return the result table in __any__ order.
The result format is in the following example.

<br>
 

#### Example 1:

> __Input:__
> 
> Employees table:
> | id | name     |
> |---------------|---------|
> | 1  | Alice    |
> | 7  | Bob      |
> | 11 | Meir     |
> | 90 | Winston  |
> | 3  | Jonathan |
>
> EmployeeUNI table:
> | id | unique_id |
> |---------------|---------|
> | 3  | 1         |
> | 11 | 2         |
> | 90 | 3         |
>   
> __Output:__  
> | unique_id | name     |
> |---------------|---------|
> | null      | Alice    |
> | null      | Bob      |
> | 2         | Meir     |
> | 3         | Winston  |
> | 1         | Jonathan |
>   
> __Explanation:__
> Alice and Bob do not have a unique ID, We will show null instead.  
> The unique ID of Meir is 2.  
> The unique ID of Winston is 3.  
> The unique ID of Jonathan is 1.  