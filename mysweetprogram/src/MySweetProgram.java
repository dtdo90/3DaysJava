import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MySweetProgram {
	

	public static void main(String[] args) throws FileNotFoundException {
		
		// input from console
		
		// LinkedList as a queue -> first in first out
		LinkedList<String> names= new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		ListIterator<String> it=names.listIterator();
		it.next();
		it.next();
		it.add("Susan");
		
		
		
		for (String name:names) System.out.println(name);
		
	}
}

// class -> instantiate -> object
//       -> instantiate -> object