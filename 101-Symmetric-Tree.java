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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null)
        {
            return true;
        }
        else if(root.left!=null && root.right!=null)
        {
            return (
                root.left.val==root.right.val && isSymmetric(root.left) &&isSymmetric(root.right)
            );
        }
        return false;
    }
}