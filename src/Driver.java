import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name");
		name = input.next();
		System.out.printf("My name is: %s", name );
	}

}
