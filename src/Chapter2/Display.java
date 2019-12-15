package Chapter2;

import java.util.List;

public abstract class Display {
	private float temp;
	private float pressure;
	private float humidity;
	
	Subject weatherdata;
	
	
	
	
	public Subject getWeatherdata() {
		return weatherdata;
	}
	public void setWeatherdata(Subject weatherdata) {
		this.weatherdata = weatherdata;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public abstract void display();
}
