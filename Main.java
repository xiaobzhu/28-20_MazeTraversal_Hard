/**
 * @author xiaobing Zhu
 * This is the main class of the maze solver
 */
public class Main {
    /**
     * This is the main function of the maze traversal, in this method I used a 2D array to create a maze that will be
     * used in maze solve, in this method it also have the function to print the maze out
     *
     * @param args the args is the parameter in the main function
     */
    public static void main(String args[]) {
        char[][] maze =                                                              //this part is used to create the maze
                {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},       //it can be use many for loop to create
                        {'#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#'},       //but I think this way will more easily to fix or change
                        {'.', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#'},
                        {'#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#'},
                        {'#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '.'},
                        {'#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
                        {'#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
                        {'#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
                        {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#'},
                        {'#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#'},
                        {'#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#'},
                        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

      /*
      char[][] maze = {                                     //This is a smaller maze that created by myself to do the test
              {'#','#','#','#','#'},                        //The start point is(StartX is 1, StartY is 0, Yend is 3, Xend is 4)
              {'.','.','#','#','#'},
              {'#','.','.','.','#'},
              {'#','#','#','.','.'},
              {'#','#','#','#','#'}
      };
      */
        System.out.println("The maze is:");
        for (int i = 0; i < maze.length; i++)        //this for loop is used to print out the for loop, that create above
        {
            for (int j = 0; j < maze[0].length; j++)
                System.out.print(" " + maze[i][j] +
                        " ");
            System.out.println();
        }
        MazeSolver test = new MazeSolver(maze, 2, 0, 4, 11);  // this is used to pass the value into the calculation part constructor
        // solve maze
        test.solve();
    }
}
