import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {
	

	public static void main(String[] args) throws FileNotFoundException {
		
		// input from console
		// LinkedList as a queue -> first in first out
		LinkedList<String> names= new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		System.out.println(names.remove(1));
		System.out.println(names.pop());
		System.out.println(names.pop());
		
				
		
		
		
	}
	
	
}

// class -> instantiate -> object
//       -> instantiate -> object