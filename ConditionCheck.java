
public class ConditionCheck {

	public static void main(String[] args) {
		int n = 5;
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
		//Using bitwise &
		
		if((n&1)==1) {
			System.out.println("odd");
		}
		else {
			System.out.println("Even");
		}
		
	}

}
