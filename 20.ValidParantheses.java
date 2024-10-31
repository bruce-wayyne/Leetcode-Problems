class Solution {
    public boolean isValid(String s) {
        char c[] = new char[s.length()];
        int index = -1;
        for (int i = 0 ; i < s.length() ; i++ ) {
           switch(s.charAt(i)) {
            case '(' : {
                c[++index] = s.charAt(i);
                break;
            }
            case '{' : {
                c[++index] = s.charAt(i);
                break;
            }
            case '[' : {
                c[++index] = s.charAt(i);
                break;
            }
            case ')' : {
                if (index == -1 || c[index] != '(') {
                    return false;
                }
                index--;
                break;
            }
            case '}' :{
                if (index == -1 || c[index] != '{') {
                return false;
            }
            index--;
            break;
            }
            
            case ']' : {
                if (index == -1 || c[index] != '[') {
                return false;
            }
            index--;
            break;
            }
           }
        }
        if (index != -1) {
            return false;
        }
        return true;
    }
}