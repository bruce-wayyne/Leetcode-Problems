class Solution {
    public String longestCommonPrefix(String[] strs) {
        char prefix[] = new char[200];
        int commonSize = Integer.MAX_VALUE;
        for (int i = 0 ; i<strs.length; i++) {
            int currentCommonSize = 0;
            for (int j = 0 ; j < strs[i].length(); j++) {
                if (i == 0) {
                    prefix[j] = strs[i].charAt(j);
                    currentCommonSize++;
                } else {
                    if (prefix[j] == strs[i].charAt(j)) {
                        currentCommonSize++;
                    } else {
                        break;
                    }
                }
            }
            if (currentCommonSize < commonSize) {
                commonSize = currentCommonSize;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0 ;i < commonSize; i++) {
            s.append(prefix[i]);
        }
        return s.toString();

    }
}