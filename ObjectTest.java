
public class ObjectTest {

	public static void main(String[] args) {
		Rectangle ob = new Rectangle(5, 6);
		Rectangle ob2 = new Rectangle(5);

		System.out.println(ob.getLength());
		System.out.println(ob.getBreadth());

		System.out.println(ob.getArea());

		System.out.println(ob2.getArea());
	}

}
