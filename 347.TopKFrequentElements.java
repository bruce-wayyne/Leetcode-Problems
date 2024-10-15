class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0 ;i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], ++count);
        }
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1, 
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        int sol[] = new int[k];
        int freqKey = list.size() - 1;
        for (int i = 0 ;i<k; i++) {
            sol[i] = list.get(freqKey).getKey();
            freqKey--;
        }
        return sol;
    }
}