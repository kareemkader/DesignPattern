package Chapter2;

public class statisticsDisplay extends Display{

	@Override
	public void display() {
		System.out.printf("statitics Display: \ntemp :%s ,pressure: %s ,humidity:%s \n",getTemp(),getPressure(),getHumidity());
		
	}
	
}
