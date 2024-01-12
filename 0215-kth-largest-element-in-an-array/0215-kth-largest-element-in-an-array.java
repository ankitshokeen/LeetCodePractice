class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        int kl = (nums.length - k) +1;
        
        for (int el : nums) {
            pq.offer(el);
        }
        
        while (pq.size() != kl) {
            pq.remove();
        }
        
        return pq.poll();
    }
}