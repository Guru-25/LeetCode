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
    public int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=fun(root.left);
        if(left==-1){
            return -1;
        }

        int right=fun(root.right);
        if(right==-1){
            return -1;
        }

        if(Math.abs(left-right)>1){
            return -1;
        }

        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return fun(root) != -1;
    }
}