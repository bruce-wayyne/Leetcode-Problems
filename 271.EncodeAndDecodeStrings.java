class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return null;
        }
        StringBuilder code = new StringBuilder();
        int size = strs.size();
        int divisor = 100;
        for (int i =0; i < strs.size(); i++) {
            divisor = 100;
            int value = strs.get(i).length();
            while(divisor != 0) {
                int currentValue = value/divisor;
                code.append(String.valueOf(currentValue));
                System.out.println(String.valueOf(currentValue));
                if (currentValue != 0) {
                    value%=divisor;
                }
                divisor/=10;
            }
            code.append(strs.get(i));
        }

        return code.toString();

    }

    public List<String> decode(String str) {
        if (str == null) {
            return new ArrayList();
        }
        int size = 0;
        int multiplier = 100;
        List<String> ansList = new ArrayList();
        for (int i =0; i<str.length(); i++) {
            int value = str.charAt(i) - 48;
            size = size + (value * multiplier);
            multiplier/=10;
            if (multiplier == 0) {
                StringBuilder sb = new StringBuilder();
                for (int j = i+1; j<size+i+1; j++){
                    sb.append(str.charAt(j));
                }
                ansList.add(sb.toString());
                i+=size;
                size = 0;
                multiplier = 100;
            }
        }
        return ansList;
    }
}
