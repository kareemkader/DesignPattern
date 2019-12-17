package Chapter2;

public class currentConditionsDisplay implements Observer{
	private float temp;
	private float humidity;
	private float pressure;
	private Subject subject;
	
	public currentConditionsDisplay(Subject sub) {
		this.subject=sub;
		sub.addObserver(this);
	}
	
	@Override
	public void update(float a, float b, float c) {
		this.temp=a;
		this.humidity=b;
		this.pressure=c;
		display();
		
	}
	void display() {
		
		System.out.printf("this display of currentConditionDisplay : the temp is %s and the humidity"
				+ "is %s and the pressure is %s",temp,humidity,pressure);
	}

	
	
	
	
}
