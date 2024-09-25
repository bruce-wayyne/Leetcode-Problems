class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = Set.of(banned);
        HashMap<String, Integer> words = new HashMap();
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i<paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (checkIfCharIsVaild(c)) {
                newWord.append(c);
            } else {
                extractValue(words, bannedSet, newWord);   
            }
        }
        extractValue(words, bannedSet, newWord);
        return findMost(words);
    }

    private void extractValue(HashMap<String, Integer> words, Set<String>bannedSet, StringBuilder newWord) {
        if (newWord.length() > 0) {
            String newWordStr = newWord.toString().toLowerCase();
            if (bannedSet.contains(newWordStr)) {
                newWord.setLength(0);
                return;
            }
            if (words.containsKey(newWordStr)) {
                int count = words.get(newWordStr);
                count+=1;
                words.put(newWordStr, count);
            } else {
                words.put(newWordStr, 1);
            }
            newWord.setLength(0);
        }
    }

    private Boolean checkIfCharIsVaild(char c) {
        if ((c >= 65 && c<=90) || (c >= 97 && c <= 122)) {
            return true;
        }
        return false;
    }

    private String findMost(HashMap<String, Integer> map) {
        int currentHighest = 0;
        String currentStr = "";
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() > currentHighest) {
                currentHighest = entry.getValue();
                currentStr = entry.getKey();
            }
        }
        return currentStr;
    }
}