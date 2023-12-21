import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		
		// input from console
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		
		if (s.equals("Tai")) {
			System.out.println("Hey "+s);
		}
		else if (s.equals("Chau")) {
			System.out.println("Hey "+s);
		}
		else {
			System.out.println("You are not welcome here");
		}
		
		int i=0;
		while (i<10) {
			System.out.println("i is: "+i);
			i++;
		}
		
		in.close();
	}
	

}

// class -> instantiate -> object
//       -> instantiate -> object