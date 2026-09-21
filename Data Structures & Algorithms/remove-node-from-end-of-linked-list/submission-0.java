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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        int k=0;
        while(cur!=null){
            cur=cur.next;
            k++;
        }
        int ri=k-n;
        if(ri==0){
            return head.next;
        }
        cur=head;
        for(int i=0;i<k-1;i++){
            if((i+1)==ri){
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
        }
        return head;
    }
}
