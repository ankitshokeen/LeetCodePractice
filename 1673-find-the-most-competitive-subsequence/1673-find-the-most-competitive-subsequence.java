class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<nums.length; i++) {
            while (!stack.isEmpty() && nums[i] < stack.peek() && (stack.size() + nums.length -i) > k) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        
        int[] result = new int[k];
        for (int i=k-1; i>=0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}