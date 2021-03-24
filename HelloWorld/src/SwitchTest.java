import java.util.Scanner;

import com.sun.deploy.util.SystemPropertyUtil;

public class SwitchTest {

	public static void main(String[] args) {

		Scanner get =new Scanner (System.in);
		
		System.out.println("enter a integer : ");
		int n =get.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("fabrury");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("june");
			break;
			
		}
		
		
		
	}

}
