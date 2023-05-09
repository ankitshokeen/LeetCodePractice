class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int sum;
        
        for (int i=0; i<nums.length; i++){
            sum = 0;
            for (int j=0; j<nums.length; j++){
                if (nums[j] < nums[i]) sum++;
                ans[i] = sum;
            }
        }
        return ans;
    }
}