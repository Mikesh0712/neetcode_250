/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if (root==null)
        return ans;

        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);//1st add the root to the queue
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();//1st node of the tree ku bahar kara
                level.add(node.val);//add the current value in the current level
                if(node.left!=null)//if left side re kichi achi then add kara
                queue.add(node.left);
                if(node.right!=null)//if right side re kichi achi then add kara
                queue.add(node.right);

            }
            ans.add(level);//add the current level to answer list
        }

      return ans;  
    }
}