class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap();
        for (int i = 0 ; i < strs.length; i++) {
            List <Integer> newList = new ArrayList();
            int c1[] = new int[26];
            for (int j = 0 ; j < strs[i].length(); j++) {
                int c = strs[i].charAt(j) - 97;
                c1[c]++;
            }
            for (int k = 0 ; k < 26; k++) {
                if (c1[k]!=0) {
                    for (int l = 0 ; l < c1[k] ; l++) {
                        newList.add(k);
                    }
                }
            }
            if (map.containsKey(newList)) {
                map.get(newList).add(strs[i]);
            } else {
                List <String> list = new ArrayList();
                list.add(strs[i]);
                map.put(newList, list);
            }
        }
        return new ArrayList(map.values());
    }
}