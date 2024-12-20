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
    public static void Traverse(TreeNode root , List<String> li , String s)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null && root.right == null)
        {
            li.add(s+root.val);
            return;
        }
        Traverse(root.left ,li,s+root.val+"->");
        Traverse(root.right ,li,s+root.val+"->");
    } 


    public List<String> binaryTreePaths(TreeNode root) {
      List<String> li = new ArrayList<>();
      Traverse(root,li,"");
      return li;
    }
}