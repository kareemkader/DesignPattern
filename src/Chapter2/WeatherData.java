package Chapter2;
import java.util.*;
public class WeatherData implements Subject {
	private float temp;
	private float humidity;
	private float pressure;
	private List<Observer> observers;
	
	public WeatherData() {

		this.observers=new ArrayList<Observer>();
		
	}

	@Override
	public void addObserver(Observer o) {
		this.observers.add(o);
	
		
	}

	@Override
	public void removeObserver(Observer o) {
		int index=observers.indexOf(o);
		this.observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(element->element.update(temp, humidity, pressure));		
	}
	
	public void measurementChanged() {
		this.notifyObserver();
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
