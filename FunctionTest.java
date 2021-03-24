
public class FunctionTest {

	static void checkValue(int n) {
	/*	if((n&1)==1)
			System.out.println("ODD");
		else
			System.out.println("EVEN");*/
		
		String output = ((n&1)==1)?"Odd":"Even";
		
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		
		checkValue(6);
		
	}

}
