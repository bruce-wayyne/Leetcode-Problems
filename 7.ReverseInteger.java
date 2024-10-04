class Solution {
    public int reverse(int value) {
        int ans = 0;
        while(value!=0) {
            int temp = value % 10;
            value = value / 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && temp > 7) || ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && temp < -8)) {
            return 0; 
        }
            ans = ans * 10 + temp;
        }
        return ans;
    }
}