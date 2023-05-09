class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestCustomer = 0;
        int sum;
        
        for (int row=0; row<accounts.length; row++){
            sum = 0;
            for (int col=0; col<accounts[row].length; col++){
                sum += accounts[row][col];
                richestCustomer = Math.max(sum, richestCustomer);
            }
        }
        return richestCustomer;
    }
}