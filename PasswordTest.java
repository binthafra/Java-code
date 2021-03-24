import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);

		String password = get.nextLine();

		if (password.equalsIgnoreCase("hello123")) {
			System.out.println("Welcome");
		} else {
			System.out.println("Login failed");
		}
		
		
	}

}
