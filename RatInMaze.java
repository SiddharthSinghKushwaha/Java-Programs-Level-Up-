/*Rat is in Maze and wanted to come out from it. maze matrix holds 1 where we can traverse. From a point four direction is possible*/
public class RatInMaze {

	public static void main(String[] args) {
		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		int[][] path = new int[3][3];
		System.out.println("Can the rat come out of the maze? \n"+ ratMaze(maze, path, 0, 0, 3));
	}
	public static boolean ratMaze(int[][] maze, int[][] path, int i, int j, int n) {
		if(i<0 || j<0 || i>n-1 || j>n-1 || maze[i][j]==0 || path[i][j]==1)
			return false;
		path[i][j]=1;
		if(i == n-1 && j==n-1)
			return true;
		if(ratMaze(maze, path, i-1, j, n))	//left side
			return true;
		if(ratMaze(maze, path, i, j-1, n))	//
			return true;
		if(ratMaze(maze, path, i+1, j, n))
			return true;
		if(ratMaze(maze, path, i, j+1, n))
			return true;
		return false;
	}
}
