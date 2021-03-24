
public class Bicycle implements BicycleInterface{
	private int speed;
	private int gear;
	private int cadence;
	
	public Bicycle(int speed, int gear, int cadence) {
		super();
		this.speed = speed;
		this.gear = gear;
		this.cadence = cadence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void applyBrake(int brake) {
		this.speed -= brake;
	}

	@Override
	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	
	
}
