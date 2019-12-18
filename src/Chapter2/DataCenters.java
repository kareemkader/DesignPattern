package Chapter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCenters {
	
	private Map<String, Float> properties;
//	private float temp;
//	private float humidity;
//	private float pressure;
	private List<Observer> observers;
	
	
	
//	public void setTemp(float temp) {
//		this.temp = temp;
//	}
//
//	public void setHumidity(float humidity) {
//		this.humidity = humidity;
//	}
//
//	public void setPressure(float pressure) {
//		this.pressure = pressure;
//	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public DataCenters() {
		// TODO Auto-generated constructor stub
		this.observers=new ArrayList<Observer>();
		this.properties=new HashMap<>();
	}
	
	public List<Observer> getObservers() {
		return observers;
	}

//	public float getTemp() {
//		return temp;
//	}
//
//	public float getHumidity() {
//		return humidity;
//	}
//
//	public float getPressure() {
//		return pressure;
//	}
}
