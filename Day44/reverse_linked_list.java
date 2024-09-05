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
    public ListNode reverseList(ListNode head) {

        //iterative method
        // if (head == null) {
        //     return null;
        // }

        // ArrayList<Integer> values = new ArrayList<>();
        // ListNode current = head;

        // while (current != null) {
        //     values.add(current.val);
        //     current = current.next;
        // }

        // current = head;

        // for (int i = values.size() - 1; i >= 0; i--) {
        //     current.val = values.get(i);
        //     current = current.next;
        // }

        // return head;

        // recursive method
        // (3 pointer approach)

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){

            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;



    }
}
