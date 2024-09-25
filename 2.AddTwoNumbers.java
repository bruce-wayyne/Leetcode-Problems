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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode parentNode = null;
        ListNode currentNode = null;
        int quo = 0;
        do {
            int val1 = 0 , val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1+val2+quo;
        
            ListNode tempNode = new ListNode(sum%10);
            quo = sum/10;
            if (parentNode == null) {
                parentNode = tempNode;
                currentNode = tempNode;
            } else {
                currentNode.next = tempNode;
                currentNode = tempNode;
            }
        }while(l1!=null || l2!=null || quo != 0);
        return parentNode;
    }
}