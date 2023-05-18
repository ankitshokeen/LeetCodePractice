class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        if (pivot == -1){
            return binarySearch(nums, target, 0, nums.length -1);
        }
        if (target == nums[pivot]) return pivot;
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot -1);
        }
        return binarySearch(nums, target, pivot +1, nums.length -1);
    }
    
    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start+(end-start)/2;
        
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) end = mid -1;
            else start = mid +1;
        }
        return -1;
    }
    
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length -1;
        
        while (start <= end){
            int mid = start+(end-start)/2;
            
            if (end > mid && nums[mid] > nums[mid +1]) return mid;
            else if (start < mid && nums[mid -1] > nums[mid]) return mid -1;
            if (nums[mid] <= nums[start]) end = mid -1;
            else start = mid +1;
        }
        return -1;
    }
}