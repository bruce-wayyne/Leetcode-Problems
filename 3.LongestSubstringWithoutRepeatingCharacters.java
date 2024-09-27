class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> set = new HashMap<Character, Integer>();
        int high = -1;
        int lowIndex = 0;
        for (int i = 0; i<s.length() ; i++) {
            char c = s.charAt(i);
            if (set.containsKey(c) && set.get(c) >= lowIndex) {
                lowIndex = set.get(c) + 1;
            } else {
                if (i - lowIndex > high) {
                    high = i - lowIndex;
                }
            }
            set.put(c, i);
        }
        return high + 1;
    }
}