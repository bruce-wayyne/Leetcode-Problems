class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[] = new int[s.length()];
        int value = -1;
        for (int i = 0 ; i< s.length(); i++) {
            char fc = s.charAt(i);
            if (fc == c) {
                value = 0;
            } else if (value != -1) {
                value+=1;
            }
            ans[i] = value;
        }
        value = -1;
        for (int i = s.length()-1 ; i > -1; i--) {
            char fc = s.charAt(i);
            if (fc == c) {
                value = 0;
            } else if (value == -1) {
                continue;
            } else {
                value+=1;
            }
            if (ans[i] > value || ans[i] == -1) {
                ans[i] = value;
            }
        }      
        return ans;
    }
}