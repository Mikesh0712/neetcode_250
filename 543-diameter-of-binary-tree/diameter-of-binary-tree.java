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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        depth(root);
        return diameter;
    }
    public int depth(TreeNode root)
    {
        
        if(root==null)
        return 0;
        int left=depth(root.left);//depth of left side
        int right=depth(root.right);//depth of right side
        diameter=Math.max(diameter,right+left);//current node ru pass hauthiba max depth
        return 1+Math.max(left,right);//current node ra depth
    }
}