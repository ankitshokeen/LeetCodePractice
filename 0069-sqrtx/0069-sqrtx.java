class Solution {
    public int mySqrt(int x) {
        int s = 1;
        int e = x;
        
        while (s <= e){
            int m = s+(e - s)/2;
            
            if (x/m == m) return m;
            
            else if (x/m < m) e = m -1;
            else if (x/m > m) s = m +1;
        }
        return e;
    }
}