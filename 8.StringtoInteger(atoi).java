class Solution {
    public int myAtoi(String s) {
        int isMinus = 1;
        long ans = 0;
        int leadingWhiteSpaces = 0;
        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' '){
                if (leadingWhiteSpaces == i) {
                    leadingWhiteSpaces++;
                    continue;
                } else {
                    return checkAndReturnResult(ans, isMinus);
                }
            }
            if (leadingWhiteSpaces == i) {
                if (c == '-') {
                    isMinus = -1;
                    continue;
                } else if (c == '+') {
                    continue;
                }
            }
            if (c < 48 || c > 57) {
                return checkAndReturnResult(ans, isMinus);
            } else {
                long value = c - 48;
                ans = ans*10 + value;
                if (ans*isMinus < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(ans*isMinus > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
            }
        }
        return checkAndReturnResult(ans, isMinus);
        
    }

    private int checkAndReturnResult(long ans, int isMinus) {
        ans*=isMinus;
        if (ans < Integer.MIN_VALUE) {
            System.out.println("Why  "+ans);
            return Integer.MIN_VALUE;
        } else if(ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)ans;
    }
}