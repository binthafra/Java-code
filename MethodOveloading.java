
public class MethodOveloading {

	static int getArea(int length) {
		return length*length;
	}
	
	static int getArea(int length, int bredth) {
		return length*bredth;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getArea(5));
		
		System.out.println(getArea(5,6));
	}

}
