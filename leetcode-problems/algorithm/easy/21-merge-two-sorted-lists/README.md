## [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)

<code>Easy</code>

<br>

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
<br>

#### Example 1:

> __Input:__ list1 = [1,2,4], list2 = [1,3,4]  
> __Output:__ [1,1,2,3,4,4]  

#### Example 2:

> __Input:__ list1 = [], list2 = []  
> __Output:__ []  

#### Example 3:

> __Input:__ list1 = [], list2 = [0]  
> __Output:__ [0]  
 

#### Constraints:

- The number of nodes in both lists is in the range <code>[0, 50]</code>.
- <code>-100 <= Node.val <= 100</code>
- Both <code>list1</code> and <code>list2</code> are sorted in __non-decreasing__ order.
