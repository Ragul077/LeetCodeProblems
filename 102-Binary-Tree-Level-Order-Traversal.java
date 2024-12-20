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
        List<List<Integer>> li = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return li;
        q.add(root); 
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> li1 = new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                li1.add(q.poll().val);
            }
            li.add(li1);
        }
        return li;
    }
}