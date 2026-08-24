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
        ArrayList<ListNode>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp);
            temp=temp.next;
        }
        if (list.size() == 0) //empty list
        {
            return null;
        }
        ListNode newHead = list.get(list.size() - 1);//last node becomes head
        for(int i=list.size()-1;i>0;i--)
        {
            list.get(i).next=list.get(i-1);//current node ka next is the previous node 
        }
        list.get(0).next=null;
        return newHead;

        
    }
}