package Chapter2;

public class WeatherData {
	private float temp;
	private float humidity;
	private float pressure;
	WeatherStation station;
	Display currentConditionsDisplay,statisticsDisplay,forecastDisplay;
	
	public WeatherData(WeatherStation station,Display current,Display statistics,Display forecast) {
		this.station=station;
		currentConditionsDisplay=current;
		statisticsDisplay=statistics;
		forecastDisplay=forecast;
	}
	
	public void measurmentsChanged() {
		float temp=getTemp();
		float humidity=getHumidity();
		float pressure =getPressure();
		
		currentConditionsDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp() {
		this.temp = station.getTemp();
//		currentConditionsDisplay.setTemp(temp);
//		forecastDisplay.setTemp(temp);
//		statisticsDisplay.setTemp(temp);
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity() {
		this.humidity = station.getHumidity();

//		currentConditionsDisplay.setHumidity(humidity);
//		forecastDisplay.setHumidity(humidity);
//		statisticsDisplay.setHumidity(humidity);
		
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure() {
		this.pressure = station.getPressure();

//		currentConditionsDisplay.setPressure(pressure);
//		forecastDisplay.setPressure(pressure);
//		statisticsDisplay.setPressure(pressure);
	}
	
}
