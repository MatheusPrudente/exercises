## [1662. Check If Two String Arrays are Equivalent](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/)

<code>Easy</code>

<br>
Given two string arrays <code>word1</code> and <code>word2</code>, return true</code> if the two arrays __represent__ the same string, and <code>false</code> otherwise.

A string is __represented__ by an array if the array elements concatenated __in order__ forms the string.

 
<br>

#### Example 1:

> __Input:__ word1 = ["ab", "c"], word2 = ["a", "bc"]  
> __Output:__ true  
> __Explanation:__   word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

#### Example 2:

> __Input:__ word1 = ["a", "cb"], word2 = ["ab", "c"]  
> __Output:__ false  

#### Example 3:

> __Input:__ word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]  
> __Output:__ true  

<br>

#### Constraints:

- <code>1 <= word1.length, word2.length <= 10<sup>3</sup></code>
- <code>1 <= word1[i].length, word2[i].length <= 10<sup>3</sup></code>
- <code>1 <= sum(word1[i].length), sum(word2[i].length) <= 10<sup>3</sup></code>
- <code>word1[i]</code> and <code>word2[i]</code> consist of lowercase letters.
