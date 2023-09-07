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
        List<List<Integer>> wrapList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root == null) {
            return wrapList;
        }
        
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int len = queue.size();
            
            List<Integer> sl = new ArrayList<>();
            
            for (int i=0; i<len; i++) {
                TreeNode currentNode = queue.poll();
                
                sl.add(currentNode.val);
            
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            }
            
            wrapList.add(sl);
        }
        
        return wrapList;
    }
}