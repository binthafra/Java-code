import java.util.ArrayList;

public class ObjectTest3 {

	public static void main(String[] args) {
		
		ArrayList<Cat> list = new ArrayList<>();
		
		list.add(new Cat("TOm",2,"Brown"));
		list.add(new Cat("Tommy",2,"white"));
		list.add(new Cat("Jerry",3,"Black"));
		
		for (Cat cat : list) {
			System.out.println(cat.getName());
		}
		
	}

}
