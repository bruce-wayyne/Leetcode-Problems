class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int c[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            c[t.charAt(i) - 97]--;
            if (c[t.charAt(i) - 97] < 0) {
                return false;
            }
        }
        return true;
    }
}