class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String ans = s.substring(0,1);
        int longest = 1;
        for (int i = 0 ;i < s.length(); i++) {
            for (int j = i + longest; j <= s.length(); j++) {
                if (j - i > longest && checkIfTheStringIsPalindrome(s.substring(i, j))) {
                    longest = j - i;
                    ans = s.substring(i, j);
                }
            }
        }
        return ans;
    }

    public boolean checkIfTheStringIsPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length()-1;
        int median = s.length()/2;
        while (p1 < median && p2 >= median) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

}