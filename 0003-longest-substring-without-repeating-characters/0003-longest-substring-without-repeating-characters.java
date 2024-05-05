class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        
        while (r <= s.length() -1) {
        if (set.add(s.charAt(r))) {
            r++;
            max = Math.max(max, r - l);
        }    else {
            while (s.charAt(l) != s.charAt(r)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.remove(s.charAt(l));
            l++;
        }
        }
        
        return max;
    }
}