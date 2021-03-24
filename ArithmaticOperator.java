import java.util.Scanner;

public class ArithmaticOperator {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		int a = get.nextInt();
		
		System.out.println("Enter value of b : ");
		int b = get.nextInt();
		
		System.out.println("Enter character : ");
		char ch = get.next().charAt(0);
		
		int add = a+b;
		System.out.println("Addition : "+add);
		int sub = a-b;
		System.out.println("Subtraction : "+sub);
		int div = a/b;
		System.out.println("Division : "+div);
		int mul = a*b;
		System.out.println("Multiplication : "+mul);
		int rem = a%b;
		System.out.println("Remainder : "+rem);
		
	}

}
