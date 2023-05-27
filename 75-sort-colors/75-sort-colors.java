class Solution {
    public void sortColors(int[] nums) {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[j] < nums[i]){
                    swap(nums, i, j);
                }
            }
        }
    }
    
    private static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}