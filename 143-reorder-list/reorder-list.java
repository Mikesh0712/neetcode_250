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
    public void reorderList(ListNode head) {
        if (head == null) return;
        ArrayList<ListNode>list=new ArrayList<>();
        
        //nodes jaka array list re store kara
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        //always initialize pointers after filling the list
        int left=0;
        int right=list.size()-1;
        while(left<right)//pointers main logic
        {
            list.get(left).next=list.get(right);
            left++;
            if(left==right)
            break;
            list.get(right).next=list.get(left);
            right--;
        }
        //last node to get last element
        list.get(left).next=null;
        
    }
}