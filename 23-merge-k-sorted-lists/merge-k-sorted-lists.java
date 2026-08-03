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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans=null;
        //merge the list one by one to the ans 
        for (int i = 0; i < lists.length; i++) {
            ans = mergeTwoList(ans, lists[i]);
        }
        return ans;
    }

    //now use the logic of merge 2 sorted list
    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        //value compare kari kari list re add so thsat final list sorted rahiba
        if(l1.val<l2.val){
            l1.next=mergeTwoList(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next=mergeTwoList(l2.next,l1);
            return l2;
        }
    }
}