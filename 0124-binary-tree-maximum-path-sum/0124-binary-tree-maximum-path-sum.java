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
    int maxVal;
    
    public int maxPathSum(TreeNode root) {
        maxVal = Integer.MIN_VALUE;
        maxSum(root);
        return maxVal;
    }
    
    private int maxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = Math.max(0, maxSum(root.left));
        int right = Math.max(0, maxSum(root.right));
        
        maxVal = Math.max(maxVal, left + right + root.val);
        
        return Math.max(left, right) + root.val;
    }
}