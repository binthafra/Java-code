
public class Swaping {
	public static void main(String[] args) {
		int a = 5; 
		int b = 6;
		
		int tmp = b;//6	
		b = a; //  5
		a = tmp; //6
		
		System.out.println("Value of a : "+a); //6
		System.out.println("Value of b : "+b); // 5
		
		//Swapping without third variable
		a = a+b; //11
		b = a-b; //6
		a = a-b; //5
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		
	}

}
