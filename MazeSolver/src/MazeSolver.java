import java.util.LinkedList;

public class MazeSolver {
	
	// static so that in can be accessed in main function
	static int[][] maze= {
			{2,0,1,1},
			{1,1,0,1},
			{0,1,1,1}
	};
	// 0 = wall, 1 = path, 2 = destination
	static LinkedList<Position> path= new LinkedList<Position>();

	public static void main(String[] args) {
		
		Position p= new Position(3,0);
		
		path.push(p);
		maze[path.peek().y][path.peek().x]=0;
		
		for (int i=0;i< maze.length;i++) {
			for (int j=0;j<maze[i].length;j++) System.out.print(maze[i][j]+" ");
			System.out.println();
		}
		
		
	}

}
