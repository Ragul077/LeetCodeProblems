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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int f=0;
        if(root==null)
        {
            return li;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> li1 = new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode currnode = q.poll();
                if(f==0)
                {
                   li1.add(currnode.val);
                }
                else
                {
                    li1.add(0,currnode.val);
                }
                if(currnode.left!=null) q.add(currnode.left);
                if(currnode.right!=null) q.add(currnode.right);
        
            }
            li.add(li1);
            f=1-f;
        }
         return li;
    }
}