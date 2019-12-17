package Chapter2;

import java.util.Observable;
import java.util.Observer;

public class currentConditionsDisplay implements Observer{
	private float temp;
	private float humidity;
	private float pressure;
	private Observable ob;
	
	
	public currentConditionsDisplay(Observable sub) {
		this.ob=sub;
		ob.addObserver(this);
	}
	
	
	void display() {
		
		System.out.printf("this display of currentConditionDisplay : the temp is %s and the humidity"
				+ "is %s and the pressure is %s",temp,humidity,pressure);
	}


	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData observable=(WeatherData) o;
			temp=observable.getTemp();
			humidity=observable.getHumidity();
			pressure=observable.getPressure();
		}
		
	}

	
	
	
	
}
