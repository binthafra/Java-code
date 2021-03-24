import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);		
		/*
		System.out.print("Enter a integer : ");
		int n = ob.nextInt();
		
		System.out.println("Enter a double : ");
		double d = ob.nextDouble();
		*/
		
		System.out.println("Enter a character: ");
		char ch = ob.next().charAt(0);
		
		System.out.println("You entered : "+ch);
		
	}
}
