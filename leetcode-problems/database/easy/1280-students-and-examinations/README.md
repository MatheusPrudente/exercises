## [1280. Students and Examinations](https://leetcode.com/problems/students-and-examinations/description/)

<code>Easy</code><code>Database</code>

<br>

Table: <code>Students</code>  

> | Column Name   | Type    |
> |------------|-----------|
> | student_id    | int     |
> | student_name  | varchar |
>
> <br>
> 
> student_id is the primary key (column with unique values) for this table.  
> Each row of this table contains the ID and the name of one student in the school.  
 
<br>

Table: <code>Subjects</code>  

> | Column Name  | Type    |
> |------------|-----------|
> | subject_name | varchar |
>
> <br>
> 
> subject_name is the primary key (column with unique values) for this table.  
> Each row of this table contains the name of one subject in the school.  
 
 
<br>

Table: <code>Examinations</code>

> | Column Name  | Type    |
> |------------|-----------|
> | student_id   | int     |
> | subject_name | varchar |
>
> <br>
> 
> There is no primary key (column with unique values) for this table. It may contain duplicates.  
> Each student from the Students table takes every course from the Subjects table.  
> Each row of this table indicates that a student with ID student_id attended the exam of subject_name.  
 

Write a solution to find the number of times each student attended each exam.

Return the result table ordered by <code>student_id</code>  and <code>subject_name</code>.

The result format is in the following example.

 

#### Example 1:

> __Input__   
> Students table:
>
> | student_id | student_name |
> |------------|-----------|
> | 1          | Alice        |
> | 2          | Bob          |
> | 13         | John         |
> | 6          | Alex         |
>
> <br>
>  
> Subjects table:
> 
> | subject_name |
> |------------|
> | Math         |
> | Physics      |
> | Programming  |
>
> <br>
>  
> Examinations table:
> | student_id | subject_name |
> |------------|-----------|
> | 1          | Math         |
> | 1          | Physics      |
> | 1          | Programming  |
> | 2          | Programming  |
> | 1          | Physics      |
> | 1          | Math         |
> | 13         | Math         |
> | 13         | Programming  |
> | 13         | Physics      |
> | 2          | Math         |
> | 1          | Math         |
>
> <br>
>  
> __Output__   
> | student_id | student_name | subject_name | attended_exams |
> |------------|-----------|-----------|-----------|
> | 1          | Alice        | Math         | 3              |
> | 1          | Alice        | Physics      | 2              |
> | 1          | Alice        | Programming  | 1              |
> | 2          | Bob          | Math         | 1              |
> | 2          | Bob          | Physics      | 0              |
> | 2          | Bob          | Programming  | 1              |
> | 6          | Alex         | Math         | 0              |
> | 6          | Alex         | Physics      | 0              |
> | 6          | Alex         | Programming  | 0              |
> | 13         | John         | Math         | 1              |
> | 13         | John         | Physics      | 1              |
> | 13         | John         | Programming  | 1              |
>
> <br>
>  
> __Explanation:__  
> The result table should contain all students and all subjects.  
> Alice attended the Math exam 3 times, the Physics exam 2 times, and the Programming exam 1 time.  
> Bob attended the Math exam 1 time, the Programming exam 1 time, and did not attend the Physics exam.  
> Alex did not attend any exams.  
> John attended the Math exam 1 time, the Physics exam 1 time, and the Programming exam 1 time.  
