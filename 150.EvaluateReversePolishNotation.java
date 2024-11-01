class Solution {
    public int evalRPN(String[] tokens) {
        int stack[] = new int[tokens.length];
        int index = -1;
        for (int i = 0 ; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int op1 = stack[index-1];
                int op2= stack[index];
                int value = 0;
                String str = tokens[i];
                if (str.equals("+")) {
                    value = op1 + op2;
                } else if (str.equals("-")) {
                    value = op1 - op2;
                } else if (str.equals("*")) {
                    value = op1 * op2;
                } else if (str.equals("/")) {
                    value = op1 / op2;
                }
                stack[--index] = value;
            } else {
                stack[++index] = Integer.parseInt(tokens[i]);
            }
        }
        return stack[index];
    }
}