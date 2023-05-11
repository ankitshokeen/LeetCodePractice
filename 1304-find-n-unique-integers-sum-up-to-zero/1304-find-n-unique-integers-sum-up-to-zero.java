class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n%2 == 0){
            int j = 0;
            while (j < n){
                for (int i=1; i<n; i=i+2){
                    ans[i] = i;
                    ans[j] = -i;
                    
                    j=j+2;
                }
            }
        }
            
            else{
                int j = 1;
                while (j < n){
                    ans[0] = 0;
                for (int i=2; i<n; i=i+2){
                    ans[i] = i;
                    ans[j] = -i;
                    
                    j=j+2;
                }
            }
            }
        return ans;
    }
}