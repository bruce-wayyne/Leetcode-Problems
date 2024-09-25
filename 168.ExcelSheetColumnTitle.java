class Solution {
    public String convertToTitle(int columnNumber) {
        int num = columnNumber;
        StringBuilder str = new StringBuilder();
        while(num != 0){
            num = num-1;
            int quo=num/26;
            int rem=num%26;
            str.insert(0, getCharFromNumber(65+rem));
            num/=26;
        }
        return str.toString();
    }

    private char getCharFromNumber(int value) {
        char a = (char)value;
        return a;
    }
}