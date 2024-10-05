class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int val = x;
        int ans = 0;
        while (val != 0) {
            int rem = val%10;
            ans = ans * 10 + rem;
            val/=10;
        }
        return ans==x;
    }
}