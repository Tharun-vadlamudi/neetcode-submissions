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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=null,tail=null;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                ListNode temp=list1.next;
                list1.next=null;
                if(ans==null){
                    ans=list1;
                    tail=list1;
                }else{
                    tail.next=list1;
                    tail=tail.next;
                }
                
                list1=temp;
            }else{
                ListNode temp=list2.next;
                list2.next=null;
                if(ans==null){
                    ans=list2;
                    tail=list2;
                }else{
                    tail.next=list2;
                    tail=tail.next;
                }
                list2=temp;
            }
        }
        while(list1!=null){
            
                ListNode temp=list1.next;
                list1.next=null;
                if(ans==null){
                    ans=list1;
                    tail=list1;
                }else{
                    tail.next=list1;
                    tail=tail.next;
                }
                
                list1=temp;
            
        }
        while(list2!=null){
            
                ListNode temp=list2.next;
                list2.next=null;
                if(ans==null){
                    ans=list2;
                    tail=list2;
                }else{
                    tail.next=list2;
                    tail=tail.next;
                }
                list2=temp;
            
        }
        return ans;
    }
}