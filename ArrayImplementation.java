
public class ArrayImplementation {

	public static void main(String[] args) {
		int[] ara = new int[10];
		
		for(int i=0; i<10; i++) {
			ara[i] = i+1;
		}
		
//		for(int i=0; i<10; i++) {
//			System.out.println(i+" no. value : "+ara[i]);
//		}
		
		for(int i :ara) {
			System.out.println("Value : "+i);
		}
		
		
	}

}
