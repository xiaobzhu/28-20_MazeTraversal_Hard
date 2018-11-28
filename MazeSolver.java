/**
 * @author xiaobzhu
 * This class is the algorithm class for the maze traversal, in this method I create a constructor call the mazeSolver
 * use it to make the main method can call the method in this class
 */
public class MazeSolver {
    /**
     * this private value is a 2D- array, that used to save the maze that created in the main class.
     */
    private char[][] maze;
    /**
     * this private value is used to save the start position
     */
    private int Y;
    /**
     * this private value is used to save the start position
     */
    private int X;
    /**
     * this private value is used to save the end position
     */
    private int Yend;
    /**
     * this private value is used to save the end position
     */
    private int Xend;

    /**
     * This constructor is used to initialize the private data members, that created before.
     *
     * @param maze is a value take in
     * @param Y    is a value take in
     * @param X    is a value take in
     * @param Yend is a value take in
     * @param Xend is a value take in
     */
    public MazeSolver(char maze[][], int Y, int X, int Yend, int Xend) {
        this.maze = maze;
        this.Y = Y;
        this.X = X;
        this.Yend = Yend;
        this.Xend = Xend;
    }

    /**
     * this method is used to check the dose the maze solve finish the maze solve, if the boolean value return true, it
     * will set the last check point as X, it not true it will go another maze solve check
     *
     * @param x    is the int value of the maze check current position
     * @param y    is the int value of the maze check current position
     * @param maze the 2D string of the current position of the maze
     * @return this is the boolean type method, if the
     */
    private boolean check(int x, int y, char[][] maze) {
        if (x == Yend && y == Xend) {          //if the x and y position both will be the end point of the maze, it will set
            maze[x][y] = 'X';                // the last position to be the X then it will return a true value
            return true;
        }
        return false; // if this check method return false it means that this maze is not solve done
    }

    /**
     * this method is used to print out the maze solve, after the maze solved it will print the maze solve
     *
     * @param solve solve the solution of maze in 2D-String
     */
    public void printSolution(char[][] solve) {
        System.out.println("Solution is:");            // this method is used to print out the final answer
        for (int i = 0; i < maze.length; i++)          // it works similar like the print method that in the main method
        {
            for (int j = 0; j < maze[0].length; j++)
                System.out.print(" " + solve[i][j] +
                        " ");
            System.out.println();
        }

    }

    /**
     * This method is used to solve the maze
     */
    public void solve() {
        char[][] solve = maze;                          // this method is used to solve the maze
        if (!findDirection(Y, X, solve)) {      // this part is works like if the findDirection method didn't find the
            System.out.println("Solution does not exist"); //final answer, it will print the no solution message
        }
        printSolution(solve);   // print out the final answer
    }

    /**
     * The method is used to find the direction of the maze, in this part is the recursive part, in this part it used to
     * reuse the findDirection method to find the solution of the maze. for every loop, it need check the position that
     * the maze next step can walk on, if the next position is X or # it means that this position is already take out, if
     * the position is not the # or X it means this position is available, so the current position will be this point
     *
     * @param x    is the int value for the test maze position
     * @param y    is the int value for the test maze position
     * @param maze is the test maze used to find the final result
     * @return the return value is used to find the the the maze is solved out or not
     */
    private boolean findDirection(int x, int y, char[][] maze) {
        if (!check(x, y, maze)) {
            if (maze[x][y] != '#' && maze[x][y] != 'X') {
                maze[x][y] = 'X';
                printSolution(maze);
                if (findDirection(x + 1, y, maze)) {  //
                    printSolution(maze);
                    return true;
                } else if (findDirection(x - 1, y, maze)) {
                    printSolution(maze);
                    return true;
                }
                else if (findDirection(x, y + 1, maze)) {
                    printSolution(maze);
                    return true;
                } else if (findDirection(x, y - 1, maze)) {
                    printSolution(maze);
                    return true;
                } else {
                    maze[x][y] = 'O';
                    printSolution(maze);
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
