/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        while(lenA > lenB){
            lenA--;
            headA = headA.next;
        }

        while(lenB > lenA){
            lenB--;
            headB = headB.next;
        }

        while(headA != headB){

            headA = headA.next;
            headB = headB.next;

        }

        return headA;
    }

    public int getListLength(ListNode head){
        ListNode temp = head;
        int count = 0;

        while(temp.next != null){
            count++;
            temp = temp.next;
        }

        return count;

    }
}