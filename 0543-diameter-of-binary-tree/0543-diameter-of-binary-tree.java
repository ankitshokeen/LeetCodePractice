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
    int md = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dM(root);
        return md;
    }
    private int dM(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int lh = dM(root.left);
        int rh = dM(root.right);
        
        md = Math.max(md, lh+rh);
        
        return Math.max(lh, rh) +1;
    }
}