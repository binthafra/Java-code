import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);

		System.out.println("Enter a integer : ");

		int n = get.nextInt();

		switch (n) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Februay");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
	Sca		System.out.println("Not matched");
		}
	}

}
