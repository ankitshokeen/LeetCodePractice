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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
     if (root != null) paths(root, "", ans);
        return ans;
    }
    
    private void paths(TreeNode root, String ps, List<String> ans) {
        if (root.left == null && root.right == null) {
            ans.add(ps+root.val);
        }
        
        if (root.left != null) {
            paths(root.left, ps + root.val +"->", ans);
        } if (root.right != null) {
            paths(root.right, ps + root.val +"->", ans);
        }
    }
}