
public class ObjectTest2 {

	public static void main(String[] args) {
		Bicycle ob = new Bicycle(80,4,50);
		
		System.out.println("Cadence :"+ob.getCadence());
		System.out.println("Gear : "+ob.getGear());
		System.out.println("Speed : "+ob.getSpeed());

		ob.speedUp(10);
		System.out.println("Speed : "+ob.getSpeed());
		
		ob.applyBrake(5);
		System.out.println("Speed : "+ob.getSpeed());
		
		ob.changeGear(2);
		System.out.println("Gear : "+ob.getGear());
	}

}
