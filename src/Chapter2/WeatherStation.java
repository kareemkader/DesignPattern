package Chapter2;

public class WeatherStation {
	private float temp;
	private float humidity;
	private float pressure;
	
	WeatherData dataListener;
	
	
	
	public WeatherData getDataListener() {
		return dataListener;
	}
	
	public void setDataListener(WeatherData dataListener) {
		this.dataListener = dataListener;
	}
	
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
		if(dataListener!=null) {
			dataListener.setTemp();
			dataListener.measurmentsChanged();
		}
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		if(dataListener!=null) {
			dataListener.setHumidity();
			dataListener.measurmentsChanged();
		}
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
		if(dataListener!=null) {
			dataListener.setPressure();
			dataListener.measurmentsChanged();
		}	}
	
	
	
	
}
