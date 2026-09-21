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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode ans=null,tail=null;
        int c=0;
        while(list1!=null&&list2!=null){
            
            int a=list1.val+list2.val+c;
            if(a>9){
                c=1;
            }else{
                c=0;
            }
            int val=a%10;
            ListNode temp=new ListNode(val);
            if(ans==null){
                ans=tail=temp;
            }else{
                tail.next=temp;
                tail=tail.next;
            }
            list1=list1.next;
            list2=list2.next;
        }
        while(list1!=null){
            
            int a=list1.val+c;
            if(a>9){
                c=1;
            }else{
                c=0;
            }
            int val=a%10;
            ListNode temp=new ListNode(val);
            if(ans==null){
                ans=tail=temp;
            }else{
                tail.next=temp;
                tail=tail.next;
            }
            list1=list1.next;
        }
        while(list2!=null){
            
            int a=list2.val+c;
            if(a>9){
                c=1;
            }else{
                c=0;
            }
            int val=a%10;
            ListNode temp=new ListNode(val);
            if(ans==null){
                ans=tail=temp;
            }else{
                tail.next=temp;
                tail=tail.next;
            }
            list2=list2.next;
        }

        if(c==1){
            ListNode temp=new ListNode(1);
            if(ans==null){
                ans=tail=temp;
            }else{
                tail.next=temp;
                tail=tail.next;
            }
        }
        return ans;
    }
}
