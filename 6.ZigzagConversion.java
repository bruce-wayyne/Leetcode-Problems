class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int value = 0;
        boolean motionForward = true;
        StringBuilder str[] = new StringBuilder[numRows];
        for (int i = 0 ; i < s.length(); i++) {
            if (str[value] == null) {
                str[value] = new StringBuilder().append(s.charAt(i));
            } else {
                str[value].append(s.charAt(i));
            }
            if (value == 0) {
                motionForward = true;
            } else if (value == numRows - 1) {
                motionForward = false;
            }
            if (motionForward) {
                value++;
            } else {
                value--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< str.length; i++) {
            if (str[i] != null) {
                sb.append(str[i]);
            }   
        }
        return sb.toString();
    }
}