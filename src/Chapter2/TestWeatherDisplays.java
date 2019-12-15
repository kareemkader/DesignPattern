package Chapter2;

public class TestWeatherDisplays {

	public static void main(String[] args) {
		
		WeatherStation station=new WeatherStation();
		Subject weatherData=new WeatherData(station);
		
		station.setHumidity(10);
		station.setPressure(20);
		station.setTemp(30);
		
		
		Observer current=new currentConditionsDisplay();
		Observer statistics=new statisticsDisplay();
		Observer forecast=new forecastDisplay(); 
		
		weatherData.addObserver(forecast);
		weatherData.addObserver(statistics);
		weatherData.addObserver(current);
		
		station.setHumidity(50);
		
		
	
		
		
		
		
		
	}
	

}
