package Chapter2;

import java.util.ArrayList;
import java.util.List;

public class DataCenters {
	
	
	private float temp;
	private float humidity;
	private float pressure;
	private List<Observer> observers;
	
	
	public void setTemp(float temp) {
		this.temp = temp;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public DataCenters() {
		// TODO Auto-generated constructor stub
		this.observers=new ArrayList<Observer>();
	}
	
	public List<Observer> getObservers() {
		return observers;
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
