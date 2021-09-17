
public class mazeSolver {
    public static void main(String[] args) {

        // '.' = path , '0' = wall, start = (0,0) end = (last corner)
        char[][] maze = { { '.', '.', '.', '.' },
                          { '0', '.', '0', '0' }, 
                          { '.', '.', '.', '0' },
                          { '0', '0', '.', '.' }, 
                          { '.', '.', '0', '.' } };

        print(maze);
        solveMaze(maze, 0, 0);
        print(maze);

    }

    private static void print(char[][] maze) {
        for (int row = 0; row < maze.length; ++row)
            for (int col = 0; col < maze[0].length; ++col) {
                if (col == maze[0].length - 1) {
                    System.out.println(maze[row][col]);
                } else {
                    System.out.print(maze[row][col] + " ");
                }
            }

    }

    public static boolean isValidMove(char[][] maze, int r, int c) {
        // check if in bounds
        if (r >= 0 && r < maze.length && c >= 0 && c < maze[0].length) {
            // check if no wall
            return maze[r][c] == '.';
        }
        return false;
    }

    public static boolean solveMaze(char[][] maze, int r, int c) {
        if (isValidMove(maze, r, c)) {
            boolean end = r == maze.length - 1 && c == maze[0].length - 1 ? true : false;

            //base case
            if (end) {
                maze[r][c] = ' ';
                return true;
            }

            // insert marker for step taken
            maze[r][c] = '*';

            // up
            boolean solved = solveMaze(maze, r - 1, c);

            // down
            if (!solved) {
                solved = solveMaze(maze, r + 1, c);
            }
            // left
            if (!solved) {
                solved = solveMaze(maze, r, c - 1);
            }
            // right
            if (!solved) {
                solved = solveMaze(maze, r, c + 1);
            }

            if (solved) {
                System.out.println("row " + r + "col " + c);
                maze[r][c] = ' ';
            }
            return solved;
        }
        return false;
    }
}
