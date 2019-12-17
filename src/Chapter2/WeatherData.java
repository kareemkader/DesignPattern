package Chapter2;
import java.util.*;
public class WeatherData extends DataCenters implements Subject {
	
	

	@Override
	public void addObserver(Observer o) {
		this.getObservers().add(o);
	
		
	}

	@Override
	public void removeObserver(Observer o) {
		int index=this.getObservers().indexOf(o);
		this.getObservers().remove(index);
	}

	@Override
	public void notifyObserver() {
		this.getObservers().forEach(element->element.update(this));		
	}
	
	public void measurementChanged() {
		this.notifyObserver();
	}
	
	public void changeInMeasurment(float t,float p,float h) {
		
		setHumidity(h);
		setPressure(p);
		setTemp(t);
		
		measurementChanged();
	}
	
	

}
