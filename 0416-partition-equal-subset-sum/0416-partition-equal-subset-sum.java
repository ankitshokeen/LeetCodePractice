class Solution {
    
    static Boolean[][] mem;
    
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        
        for (int i : nums) sum+=i;
        if (sum%2 != 0) return false;
        
        sum /= 2;
        
        mem = new Boolean[n+1][sum+1];
        
        return subSetSum(nums, 0, sum);
    }
    
    boolean subSetSum(int[] nums, int index, int sum) {
        if (sum == 0) return true;
        else if (index >= nums.length || sum < 0) return false;
        if (mem[index][sum] != null) return mem[index][sum];
        
        return mem[index][sum] = subSetSum(nums, index +1, sum - nums[index]) || subSetSum(nums, index +1, sum);
    }
}