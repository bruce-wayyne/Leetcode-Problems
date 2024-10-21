class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();
        while (start < end) {
            if (!isAlphaNumeric(s.charAt(start))) {
                start++;
                continue;
            } else if (!isAlphaNumeric(s.charAt(end))) {
                end--;
                continue;
            } else if (s.charAt(start) != s.charAt(end)) {
                
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public boolean isAlphaNumeric(char c) {
        if ((c > 47 && c < 58) || (c > 96 && c < 123)) {
            return true;
        }
        return false;
    }
}