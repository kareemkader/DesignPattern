package Chapter2;

public class forecastDisplay extends Display{

	@Override
	public void display() {
		System.out.printf("forecast Display: \ntemp :%s ,pressure: %s ,humidity:%s \n",getTemp(),getPressure(),getHumidity());
		
	}
	
	
}
