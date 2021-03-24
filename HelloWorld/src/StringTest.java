import java.util.Scanner;
public class StringTest {

	public static void main(String[] args) {

Scanner get = new Scanner(System.in);
		
		String str = get.nextLine();
		
		str = str.toUpperCase();
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
		
		int pos = str.indexOf("world");
		System.out.println(pos);
		
		System.out.println(str.length());
		
		boolean flag = str.startsWith("hello");
		System.out.println(flag);
		
		flag = str.endsWith("world");
		System.out.println(flag);
		
	}

}
