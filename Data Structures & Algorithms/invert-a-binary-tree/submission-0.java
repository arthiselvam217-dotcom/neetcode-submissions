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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        Queue<TreeNode>arthi=new LinkedList<>();
        arthi.offer(root);
        while(!arthi.isEmpty())
        {
            TreeNode node=arthi.poll();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            if(node.left!=null)
            {
                arthi.offer(node.left);
            }
            if(node.right!=null)
            {
                arthi.offer(node.right);
            }

        }
        return root;
    }
}
