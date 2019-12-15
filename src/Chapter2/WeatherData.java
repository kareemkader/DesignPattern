package Chapter2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	private float temp;
	private float humidity;
	private float pressure;
	WeatherStation station;
	List<Observer> observers;
	
	public WeatherData(WeatherStation station) {
		this.station=station;
		
	}
	
	public void measurmentsChanged() {
		float temp=getTemp();
		float humidity=getHumidity();
		float pressure =getPressure();
		observers.forEach(element->element.update());
		
		
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

	@Override
	public void notifying() {
		this.measurmentsChanged();	
	}

	@Override
	public void addObserver(Observer ob) {
		if(observers==null) {
			observers=new ArrayList<>();
		}
		observers.add(ob);
		
	}

	@Override
	public void removeObserver(Observer ob) {
		if(observers!=null&&observers.contains(ob))observers.remove(ob);
		
	}
	
}
