class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> newList = new ArrayList();
        recursion("", newList, n, n, '\0');
        return newList;
    }


    private void recursion(String s, List<String> list, int n1, int n2, char c) {

        if (c != '\0') {
            s = s + c;
        }
        if (n1 == 0 && n2 == 0) {
            if (checkIsValid(s)) {
                list.add(s);
            }
            return;
        }
        if (n1 != 0) {
            recursion(s, list, n1-1, n2, '(');
        }
        if (n2 != 0) {
            recursion(s, list, n1, n2-1, ')');
        }
    }

    private boolean checkIsValid(String s) {
        char c[] = new char[s.length()];
        int index = -1;
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c[++index] = '(';
            } else {
                if (index == -1 ) {
                    return false;
                }
                if (c[index] == '(') {
                    index--;
                }
            }
        }
        return true;

    }

    
}