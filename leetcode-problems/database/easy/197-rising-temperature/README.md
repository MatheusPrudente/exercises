## [197. Rising Temperature](https://leetcode.com/problems/rising-temperature/description/)
<code>Easy</code>

<br>

Table: <code>Weather</code>
> | Column Name | Type    |  
> |-------------|---------|  
> | id            | int     |
> | recordDate    | date    |
> | temperature   | int     |
>
> id is the column with unique values for this table.
> There are no different rows with the same recordDate.
> This table contains information about the temperature on a certain day.
 
<br>

Write a solution to find all dates' id with higher temperatures compared to its previous dates (yesterday).
Return the result table in any order.
The result format is in the following example.
 
<br>

#### Example 1:
> __Input:__   
> Weather table:
> | id | recordDate | temperature |
> |----|------|------------|
> | 1  | 2015-01-01 | 10          |
> | 2  | 2015-01-02 | 25          |
> | 3  | 2015-01-03 | 20          |
> | 4  | 2015-01-04 | 30          |
>   
> __Output:__  
> | id |
> |----|
> | 2  |
> | 4  |
>
> Explanation: 
> In 2015-01-02, the temperature was higher than the previous day (10 -> 25).
> In 2015-01-04, the temperature was higher than the previous day (20 -> 30).
