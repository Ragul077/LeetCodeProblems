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
    public int maxDepth(TreeNode root) {
        int left,right;
        if(root==null)
        {
            return 0;
        }
            left=maxDepth(root.left);
            right=maxDepth(root.right);
        if(left>right)
        return left+1;
        else
        return right+1;
    }
}