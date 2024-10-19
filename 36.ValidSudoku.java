class Solution {
    public boolean isValidSudoku(char[][] board) {
        int cols[][] = new int[10][10];
        int box[][] = new int[10][10];
        for (int i = 0 ; i < board.length; i++) {
            int rows[] = new int[10];
            for (int j = 0 ; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    int value = board[i][j] - '0';
                    if (rows[value] != 0) {
                        return false;
                    }
                    rows[value] = value;
                    if (cols[value][j] != 0) {
                        return false;
                    }
                    cols[value][j] = value;
                    int boxValue = (i / 3) * 3 + j / 3;
                    if (box[value][boxValue] != 0) {
                        return false;
                    }
                    box[value][boxValue] = value;
                }
            }
        }
        return true;
    }
}
