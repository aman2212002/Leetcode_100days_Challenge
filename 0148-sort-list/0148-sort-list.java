/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null) {
            return head;
        }
        
        // Step 1: Divide the list into two halves
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;  // Split the list
        
        // Step 2: Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        
        // Step 3: Merge the sorted halves
        return merge(left, right);
    }
     private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        
        return dummy.next;
}
}