import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
		// input from console
		Scanner in = new Scanner(new File("test.txt"));
		
		List<String> students=new ArrayList<String>();
		
		while (in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		//System.out.println(students.toString());
		for (String s:students) System.out.println(s);
		in.close();
		
	}
	
}

// class -> instantiate -> object
//       -> instantiate -> object