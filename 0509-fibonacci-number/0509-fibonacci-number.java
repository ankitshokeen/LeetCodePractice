class Solution {
    public int fib(int n) {
        return helper(n, new int[n +1]);
    }
    
    private int helper(int n, int[] qb) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        if (qb[n] != 0) {
            return qb[n];
        }
        
        int fib2 = helper(n -2, qb);
        int fib1 = helper(n -1, qb);
        int fibn = fib2 + fib1;
        
        qb[n] = fibn;
        
        return fibn;
    }
}