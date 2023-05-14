class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[1] = findSecondIndex(nums, target);
        ans[0] = findFirstIndex(nums, target);
        
        return ans;
    }
    
    static int findSecondIndex(int[] nums, int target){
        int index = -1;
        int s = 0;
        int e = nums.length -1;
        
        while (s <= e){
            int m = s+(e-s)/2;
            
            if (nums[m] <= target) s = m +1;
            else e = m-1;
            
            if (nums[m] == target) index = m;
        }
        return index;
    }
    
    static int findFirstIndex(int[] nums, int target){
        int index = -1;
        int s = 0;
        int e = nums.length -1;
        
        while (s <= e){
            int m = s+(e-s)/2;
            
            if (nums[m] >= target) e = m -1;
            else s = m +1;
            
            if (nums[m] == target) index = m;
        }
        return index;
    }
}