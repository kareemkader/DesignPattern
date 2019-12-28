package Chapter6;

public class CeilingFan{

	public static final int HIGH=3;
	public static final int MEDIUM=2;
	public static final int LOW=1;
	public static final int OFF=3;

	// String location;
	int speed;

	public CeilingFan(){
		speed=OFF;
	}

	public void high(){
		speed=HIGH;
		System.out.println("the speed now is high");
	}

	public void low(){
		speed=LOW;
		System.out.println("the speed now is low");
	}

	public void medium(){
		speed=MEDIUM;
		System.out.println("the speed now is medium");
	}

	public void off(){
		speed=OFF;
		System.out.println("the speed now is off");
	}

	public int getSpeed(){
		return speed;
	}
}