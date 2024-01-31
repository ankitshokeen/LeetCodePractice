class Solution {
    
    int result = 0;
    public int findTargetSumWays(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        helper (nums, target, 0, 0);
        return result;
    }
    
    public void helper(int[] nums, int target, int index, int eval) {
        if (index == nums.length) {
            if (target == eval) {
                result++;
            }
            return;
        }
        
        helper (nums, target, index +1, eval + nums[index]);
        helper (nums, target, index +1, eval - nums[index]);
    }
}