class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<String> ans = new Stack<>();
        sol(n, "", 0, 0, ans);
        
        return ans;
    }
    
    void sol(int n, String p, int open, int close, Stack<String> ans) {
        if (p.length() == n*2) {
            ans.push(p);
        }
        
        if (open < n) {
            sol(n, p + '(', open +1, close, ans);
        }
        if (close < open) {
            sol(n, p + ')', open, close +1, ans);
        }
        
        
        // backtrack
        p = "";
        open = 0;
        close = 0;
    }
}