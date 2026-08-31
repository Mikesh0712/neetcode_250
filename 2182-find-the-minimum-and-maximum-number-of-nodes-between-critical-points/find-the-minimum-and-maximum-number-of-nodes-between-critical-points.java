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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min=Integer.MAX_VALUE,max=-1;
        ListNode prev=head;
        ListNode curr=head.next;
        int index=1,first=-1,last=-1;//index of critical points 1st and last
        while(curr.next!=null)
        {
            if((curr.val>prev.val&&curr.val>curr.next.val)||(curr.val<prev.val&&curr.val<curr.next.val))
            {
                if(first==-1)//1st critical point
                first=index;
            
                if(last!=-1)//if prev critical point already found
                min=Math.min(min,index-last);//consecutive critical point ka distance

                last=index;//make the current critical point as last
            }
            prev=curr;
            curr=curr.next;
            index++;
        }
        if(first==-1||first==last)//if less than 2 critical point
        return new int[]{-1,-1};

        max=last-first;//dist between last and first critical point
        return new int[]{min,max};

        
    }
}