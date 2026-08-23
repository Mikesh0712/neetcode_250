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
    public boolean isBalanced(TreeNode root) {
        if(root==null)//empty tree always balanced
        return true;
        int left=depth(root.left);//to get the depth of left subtree using function call
        int right=depth(root.right);//to get the depth of right subtree using function call
        if(Math.abs(left-right)>1)//to calculate for the definition of balanced binary tree
        return false;
        if(!isBalanced(root.left))//to check left subtree is balanced or not
        return false;
        if(!isBalanced(root.right))//to check right subtree is balanced or not
        return false;

        return true;
    }
    public int depth(TreeNode root)
    {
        if(root==null)
        return 0;
        int left=depth(root.left);
        int right=depth(root.right);
        return 1+Math.max(right,left);
    }
}