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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode>list=new ArrayList<>();//brute force convert list to array list find middle and from that middle get all all the elements to last
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp);
            temp=temp.next;
        }
        int middle=list.size()/2;//middle index
        return list.get(middle);//middle node return karo
        
    }
}



//using fast and slow pointers optimal solution takesO(1) space 
// ListNode slow =head;
//         ListNode fast = head;

//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         return slow;