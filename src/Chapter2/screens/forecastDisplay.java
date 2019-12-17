package Chapter2.screens;

import Chapter2.Display;

public class forecastDisplay extends Display{

	@Override
	public void display() {
		System.out.printf("forecast Display: \ntemp :%s ,pressure: %s ,humidity:%s \n",getTemp(),getPressure(),getHumidity());
		
	}
	
	
}
