
public class RecursionTest {

	static int getFactorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * getFactorial(n - 1);
	}

	// 5*4*3*2*1

	public static void main(String[] args) {
		
		System.out.println(getFactorial(5));

		System.out.println(getFactorial(3));
	}

}
