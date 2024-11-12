## [1068. Product Sales Analysis I](https://leetcode.com/problems/product-sales-analysis-i/description/)

<code>Easy</code><code>Database</code>

<br>

Table: <code>Sales</code>

> | Column Name | Type  |
> |------------|-----------|
> | sale_id     | int   |
> | product_id  | int   |
> | year        | int   |
> | quantity    | int   |
> | price       | int   |
>
> <br>
> 
> (sale_id, year) is the primary key (combination of columns with unique values) of this table.  
> product_id is a foreign key (reference column) to <code>Product</code> table.  
> Each row of this table shows a sale on the product product_id in a certain year.  
> Note that the price is per unit.  
 
<br>

Table: <code>Product</code> 

> | Column Name  | Type    |
> |--------------|---------|
> | product_id   | int     |
> | product_name | varchar |
>
> <br>
> 
> product_id is the primary key (column with unique values) of this table.  
> Each row of this table indicates the product name of each product.  

<br>

Write a solution to report the <code>product_name</code>, <code>year</code>, and <code>price</code> for each <code>sale_id</code> in the Sales table.  
Return the resulting table in __any order__.  
The result format is in the following example.  

<br>

#### Example 1:

> __Input__   
> Sales table:
> | sale_id | product_id | year | quantity | price |
> |---------|---------|---------|---------|---------|
> | 1       | 100        | 2008 | 10       | 5000  |
> | 2       | 100        | 2009 | 12       | 5000  |
> | 7       | 200        | 2011 | 15       | 9000  |
>
> <br>
>  
> Product table:
>| product_id | product_name |
> |---------|---------|
>| 100        | Nokia        |
>| 200        | Apple        |
>| 300        | Samsung      |
>
> <br>
>  
> __Output__   
> | product_name | year  | price |
> |------------|-----------|-----------|
> | Nokia        | 2008  | 5000  |
> | Nokia        | 2009  | 5000  |
> | Apple        | 2011  | 9000  |
>
> <br>
>  
> __Explanation:__   
> From sale_id = 1, we can conclude that Nokia was sold for 5000 in the year 2008.  
> From sale_id = 2, we can conclude that Nokia was sold for 5000 in the year 2009.  
> From sale_id = 7, we can conclude that Apple was sold for 9000 in the year 2011.  
