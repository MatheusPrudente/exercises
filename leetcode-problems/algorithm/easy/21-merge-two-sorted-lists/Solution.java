class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(null == list1 && null == list2) {
            return null;
        }

        ListNode header = new ListNode();
        ListNode tail = header;

        while (list1 != null || list2 != null) {
            if(list1 != null && list2 == null) {
                ListNode newNode = new ListNode(list1.val);
                tail.next = newNode;
                tail = tail.next;
                list1 = (list1 != null) ? list1.next : null;
            } else if(list1 == null && list2 != null) {
                ListNode newNode = new ListNode(list2.val);
                tail.next = newNode;
                tail = tail.next;
                list2 = (list2 != null) ? list2.next : null;
            }  else if(list1.val <= list2.val) {
                ListNode newNode = new ListNode(list1.val);
                tail.next = newNode;
                tail = tail.next;
                list1 = (list1 != null) ? list1.next : null;
            } else if(list1.val >= list2.val) {
                ListNode newNode = new ListNode(list2.val);
                tail.next = newNode;
                tail = tail.next;
                list2 = (list2 != null) ? list2.next : null;
            }
        }

        ListNode result = header.next;
        header.next = null;
        return result;
    }
}
