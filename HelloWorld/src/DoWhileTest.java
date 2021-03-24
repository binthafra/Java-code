import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner get = new Scanner (System.in);
		int age;

		do {
			System.out.print("Enter your age (negative or 0 to break) : ");
			age = get.nextInt();

			if (age <= 0)
				System.out.println("You choose to exit");
			else
				System.out.println("Your input : " + age);

		} while (age > 0);

	}

}
