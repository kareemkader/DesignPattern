package Chapter2;

public class TestWeatherDisplays {

	public static void main(String[] args) {
		
		WeatherData weatherdata=new WeatherData();
		
		currentConditionsDisplay currentdisplay=new currentConditionsDisplay(weatherdata);
		
		weatherdata.changeInMeasurment(8, 4, 8);
		
		
		
	}

}
