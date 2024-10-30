

## [2623. Memoize](https://leetcode.com/problems/memoize/description/)

<code>Medium</code>

<br>

Given a function fn, return a __memoized__ version of that function.

A __memoized__ function is a function that will never be called twice with the same inputs. Instead it will return a cached value.  
You can assume there are __3__ possible input functions: <code>sum</code>, <code>fib</code>, and <code>factorial</code>.  
- <code>sum</code> accepts two integers a and b and returns <code>a + b</code>. Assume that if a value has already been cached for the arguments <code>(b, a)</code> where <code>a != b</code>, it cannot be used for the arguments <code>(a, b)</code>.
- For example, if the arguments are <code>(3, 2)</code> and <code>(2, 3)</code>, two separate calls should be made.  
- <code>fib</code> accepts a single integer n and returns 1 if <code>n <= 1</code> or <code>fib(n - 1) + fib(n - 2)</code> otherwise.  
- <code>factorial</code> accepts a single integer <code>n</code> and returns <code>1</code> if <code>n <= 1 or factorial(n - 1) * n</code> otherwise.  
 

<br>

#### Example 1:

> __Input:__   
> fnName = "sum"  
> actions = ["call","call","getCallCount","call","getCallCount"]  
> values = [[2,2],[2,2],[],[1,2],[]]  
> __Output:__  [4,4,1,3,2]  
> __Explanation:__  
> const sum = (a, b) => a + b;  
> const memoizedSum = memoize(sum);  
> memoizedSum(2, 2); // "call" - returns 4. sum() was called as (2, 2) was not seen before.  
> memoizedSum(2, 2); // "call" - returns 4. However sum() was not called because the same inputs were seen before.  
> // "getCallCount" - total call count: 1  
> memoizedSum(1, 2); // "call" - returns 3. sum() was called as (1, 2) was not seen before.  
> // "getCallCount" - total call count: 2  

<br>

#### Example 2:

> __Input:__ 
> fnName = "factorial"
> actions = ["call","call","call","getCallCount","call","getCallCount"]
> values = [[2],[3],[2],[],[3],[]]
> __Output:__  [2,6,2,2,6,2]
> __Explanation:__
> const factorial = (n) => (n <= 1) ? 1 : (n * factorial(n - 1));  
> const memoFactorial = memoize(factorial);  
> memoFactorial(2); // "call" - returns 2.  
> memoFactorial(3); // "call" - returns 6.  
> memoFactorial(2); // "call" - returns 2. However factorial was not called because 2 was seen before.  
> // "getCallCount" - total call count: 2  
> memoFactorial(3); // "call" - returns 6. However factorial was not called because 3 was seen before.  
> // "getCallCount" - total call count: 2  

<br>

## Example 3:

> __Input:__ 
> fnName = "fib"  
> actions = ["call","getCallCount"]  
> values = [[5],[]]  
> __Output:__  [8,1]  
> __Explanation:__  
> fib(5) = 8 // "call"  
> // "getCallCount" - total call count: 1  
 

<br>

#### Constraints:

- <code>0 <= a, b <= 105</code>
- <code>1 <= n <= 10</code>
- <code>0 <= actions.length <= 105</code>
- <code>actions.length === values.length</code>
- <code>actions[i]</code> is one of "call" and "getCallCount"
- <code>fnName</code> is one of "sum", "factorial" and "fib"
