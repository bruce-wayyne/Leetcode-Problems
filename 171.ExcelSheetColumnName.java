class Solution {
    public int titleToNumber(String columnTitle) {
        int value = 0;
        int multiplier = 1;
        for (int i = columnTitle.length()-1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            int num = c - 'A' + 1;
            value += multiplier * num;
            multiplier *= 26;
        }
        return value;
    }
}