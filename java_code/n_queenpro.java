import java.util.*;

class nQueen {
    public boolean issafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // upperleft
        int r = row;
        for (int c = col; c >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left
        r = row;
        for (int c = col; c >= 0 && i < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower right
        for (int c = col; c < board.length && i < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void saveboard(char[][] board, List<List<String>> allboard) {
        String row = "";
        List<String> newboard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }

            }
            newboard.add(row);

        }
        allboard.add(newboard);

    }

    public void helper(char[][] board, List<List<String>> allboards, int col) {
        for (int row = 0; row < board.length; row++) {
            if (issafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allboard, col + 1);
                board[row][col] = '.';

            }
        }
    }

    public List<List<String>> solvequeen(int n) {
        List<List<String>> allboard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allboard, 0);
        return allboard;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = nextInt();
        System.out.println(solvequeen(n));
    }

}
