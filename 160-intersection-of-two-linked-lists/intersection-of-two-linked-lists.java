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
        ListNode lst1=headA;
        ListNode lst2=headB;
        while(lst1!=lst2){
            lst1=(lst1==null)?headB:lst1.next;
            lst2=(lst2==null)?headA:lst2.next;
        }
        return lst1;
    }
}