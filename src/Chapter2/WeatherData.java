package Chapter2;
import java.util.*;
public class WeatherData extends Observable{
	private float temp;
	private float humidity;
	private float pressure;
	private List<Observer> observers;
	
	public WeatherData() {

		this.observers=new ArrayList<Observer>();
		
	}

	
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void changeInMeasurment(float t,float p,float h) {
		this.humidity=h;
		this.pressure=p;
		this.temp=t;
		measurementChanged();
	}
	
	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
