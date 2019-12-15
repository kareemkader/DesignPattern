package Chapter2;

public abstract class Display {
	private float temp;
	private float pressure;
	private float humidity;

	public void update (float temp,float pressure,float humidity) {
		setHumidity(humidity);
		setPressure(pressure);
		setTemp(temp);
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
