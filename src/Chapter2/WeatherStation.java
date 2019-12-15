package Chapter2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
	private float temp;
	private float humidity;
	private float pressure;
	
	private List<Subject> dataListener;
	
	
	
	public List<Subject> getDataListener() {
		return dataListener;
	}
	
	public void setDataListener(List<Subject> dataListener) {
		this.dataListener = dataListener;
	}
	
	public void addDataListener(Subject sub) {
		if(dataListener==null) {
			dataListener=new ArrayList<Subject>();
		}
		dataListener.add(sub);
	}
	
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
		if(dataListener!=null) {
			dataListener.forEach(element->{element.setTemp();
			element.notifying();});
		}
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		if(dataListener!=null) {
			dataListener.forEach(element->{element.setHumidity();
			element.notifying();});
		}
		}
	
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
		if(dataListener!=null) {
			dataListener.forEach(element->{element.setPressure();
			element.notifying();});
		}	}
	
	
	
	
}
