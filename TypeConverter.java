import java.util.Scanner;

public class TypeConverter {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		
		String str = get.nextLine();

		
/*		int n = Integer.parseInt(str);
		System.out.println(n);*/
		
/*		float f = Float.parseFloat(str);
		System.out.println(f);
		 
		double d = Double.parseDouble(str);
		System.out.println(d);*/
		
/*		Integer intObj = Integer.valueOf(str);
		System.out.println(intObj.intValue());*/
		
		
		Float floatObj = Float.valueOf(str);
		System.out.println(floatObj.floatValue());
	}

}
