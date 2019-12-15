package Chapter2;

public class currentConditionsDisplay extends Display{

	@Override
	public void display() {
		System.out.printf("currentCondition Display: \ntemp :%s ,pressure: %s ,humidity:%s \n",getTemp(),getPressure(),getHumidity());

		
	}
	
	
	
}
