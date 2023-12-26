import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MazeSolver {
	
	
	// 0 = wall, 1 = path, 2 = destination

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Maze> mazes=new ArrayList<Maze>();
		
		Maze m =new Maze();
		
		// fill list from file
		Scanner in=new Scanner(new File("mazes.txt"));
		int rows=Integer.parseInt(in.nextLine());
		// initialize the maze
		m.maze=new int[rows][];
		
		for (int i=0;i<rows;i++) {
			// get a new line
			String line=in.nextLine();
			m.maze[i]=Arrays.stream(line.split(", ")).mapToInt(Integer:: parseInt).toArray();
			
		}
		m.start=new Position(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
		
		mazes.add(m);
		
		int i=0;
		while (i<mazes.size()) {
			if(solveMaze(mazes.get(i))) System.out.println("You won!");
			else System.out.println("No path!");
			i++;
		}
		
	}
			
	private static boolean solveMaze(Maze m) {
		
		Position p=m.start;
		m.path.push(p);
		
		// y = row, x = column
		
		while (true) {
			int y=m.path.peek().y;
			int x=m.path.peek().x;		
			m.maze[y][x]=0;
			
			// down
			if (isValid(y+1,x,m)) {
				if(m.maze[y+1][x]==2) {
					System.out.println("Move down");
					return true;
				}
				else if (m.maze[y+1][x]==1) {
					System.out.println("Move down");
					m.path.push(new Position(y+1,x));
					continue;
				}
			}
			
			
			// left
			if (isValid(y,x-1,m)) {
				if(m.maze[y][x-1]==2) {
					System.out.println("Move left");
					return true;
				}
				else if (m.maze[y][x-1]==1) {
					System.out.println("Move left");
					m.path.push(new Position(y,x-1));
					continue;
				}
			}
			
			
			//up
			if (isValid(y-1,x,m)) {
				if(m.maze[y-1][x]==2) {
					System.out.println("Move up");
					return true;
				}
				else if (m.maze[y-1][x]==1) {
					System.out.println("Move up");
					m.path.push(new Position(y-1,x));
					continue;
				}
			}
			
			
			//right
			if (isValid(y,x+1,m)) {
				if(m.maze[y][x+1]==2) {
					System.out.println("Move right");
					return true;
				} 
				else if (m.maze[y][x+1]==1) {
					System.out.println("Move right");
					m.path.push(new Position(y,x+1));
					continue;
				}
			}
			
			m.path.pop();
			System.out.println("Move back");
			if (m.path.size()<=0) {
				return false;
			}
		}
		
	}


	public static boolean isValid(int y, int x,Maze m) {
		if (y<0 || y>=m.maze.length || 
				x<0 || x>=m.maze[y].length) return false;
		return true;
	}
}
