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
      if(root == null)
      {
        return true;
      }
      int l = height(root.left);
      int r = height(root.right);

      if(Math.abs(l-r)<=1 && isBalanced(root.left) && isBalanced(root.right))
      return true;

      return false;
       
    }

    public int height(TreeNode height)
    {
        if(height == null)
        {
            return 0;
        }
        return 1+ Math.max(height(height.right),height(height.left));
    }
}