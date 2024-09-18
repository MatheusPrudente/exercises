/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(null == head) {
            return null;
        }

        int val = -101;
        ListNode header = new ListNode();
        ListNode tail = header;

        while (head != null) {
            if(val != head.val) {
                val = head.val;
                ListNode newNode = new ListNode(val);
                tail.next = newNode;
                tail = tail.next;
            }
            head = (head != null) ? head.next : null;
        }
        
        return header.next;
    }
}
