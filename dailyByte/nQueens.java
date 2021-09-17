

public class nQueens {

    final static int N = 25;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        solution(N);
        long elapsedTime = System.currentTimeMillis() - startTime;
        long elapsedSeconds = elapsedTime / 1000;
        long secondsDisplay = elapsedSeconds % 60;
        long elapsedMinutes = elapsedSeconds / 60;

        System.out.println(elapsedMinutes + " minutes " + secondsDisplay + " Seconds \ntotal milliseconds:" + elapsedTime );



        
         
    }
    
    public static int[][] createBoard(int n) {
        int[][] chessBoard = new int[n][n];
        return chessBoard;
    }

    public static void printBoard(int[][] in) {
        for(int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
            {
                if (j == N - 1)
                    System.out.println(in[i][j]);
                else
                    System.out.print(in[i][j] + " ");
            }
    }

    public static void solution(int n) {
        int[][] board = createBoard(n);
        printBoard(board);
        System.out.println("\n\n");
        if(!solveQueen(board, 0))
            System.out.println("No solution available");
        else {
                printBoard(board);
            }
    }

    private static boolean solveQueen(int[][] board, int col) {
        //base cases
        //placed all queens
        if(col >= N)
            return true;

        for (int i = 0; i < N; ++i)
        {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveQueen(board, col + 1)) {
                    return true;
                }
                /* no safe place so remove queen and try rest
                 of rows in col, if all row in curr 
                col is tried than will return false and move queen 
                before that one until right combo is found */
                board[i][col] = 0; //BACKTRACK 
            }
        }
        /*
         * If the queen can not be placed in any row in this colum col, then return
         * false
         */
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int i, j;
        //check this row on the left side
        for ( i = 0; i < col; ++i) 
            if (board[row][i] == 1) 
                return false;

        //check upper diagonal
        for(i = row, j = col; i >= 0 && j >= 0; --i, --j)
            if(board[i][j] == 1)
                return false;

        //check lower diagonal 
        for(i = row, j = col; i < N && j >= 0; ++i, --j)
            if(board[i][j] == 1)
                return false;
        
        return true;
    }
}
