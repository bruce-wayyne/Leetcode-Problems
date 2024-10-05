class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500); 
        map.put('M', 1000);
        int ans = 0;
        char prev = '0';
        for (int i = s.length()-1; i>-1; i--) {
            if (prev != '0') {
                if ((prev == 'V' && s.charAt(i) == 'I') || (prev == 'X' && s.charAt(i) == 'I') || (prev == 'L' && s.charAt(i) == 'X') || (prev == 'L' && s.charAt(i) == 'X') || (prev == 'C' && s.charAt(i) == 'X') || (prev == 'D' && s.charAt(i) == 'C') || (prev == 'M' && s.charAt(i) == 'C') ){
                    ans = ans -(map.get(s.charAt(i)) + map.get(s.charAt(i)));
                }
            }
        ans += map.get(s.charAt(i));
            prev = s.charAt(i);
        
        }
    return ans;
}
}