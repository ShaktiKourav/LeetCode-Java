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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null){  // add nodes : let right half
            slow  = slow.next;
        }

        // reverse the second half
        slow = reverseList(slow);
        fast =  head;

        // comparing one by one nodes  
        while( slow != null){
            if(fast.val != slow.val)
             return false;

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head){
        
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }

}