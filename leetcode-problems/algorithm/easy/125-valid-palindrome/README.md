## [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/)

<code>Easy</code>

<br>
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
<br>

#### Example 1:
> __Input:__ s = "A man, a plan, a canal: Panama"  
> __Output:__ true  
> Explanation:__ "amanaplanacanalpanama" is a palindrome.  
 
#### Example 2:
> __Input:__ s = "race a car"  
> __Output:__ false  
> Explanation:__ "raceacar" is not a palindrome.

#### Example 3:
> __Input:__ s = " "  
> __Output:__ true  
> Explanation:__ s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.  
 

#### Constraints:

- <code>1 <= s.length <= 2 * 105</code>
- <code>s</code> consists only of printable ASCII characters.
