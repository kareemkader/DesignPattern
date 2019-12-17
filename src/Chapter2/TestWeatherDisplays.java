package Chapter2;

import Chapter2.screens.currentConditionsDisplay;
import Chapter2.screens.forecastDisplay;
import Chapter2.screens.statisticsDisplay;

public class TestWeatherDisplays {

	public static void main(String[] args) {
		WeatherStation station=new WeatherStation();
		Display current=new currentConditionsDisplay();
		
		Display statistics=new statisticsDisplay();
		Display forecast=new forecastDisplay(); 
		WeatherData weatherdata=new WeatherData(current,statistics,forecast);
		
		station.setDataListener(weatherdata);
		
		station.setHumidity(5);
		station.setPressure(10);
		station.setTemp(20);
		
		weatherdata.setHumidity();
		weatherdata.setPressure();
		weatherdata.setTemp();
		
		current.display();
		statistics.display();
		forecast.display();
		
		station.setPressure(100);
		System.out.println("\n");
		current.display();
		statistics.display();
		forecast.display();
		
		
		
		
		
		
	}

}
