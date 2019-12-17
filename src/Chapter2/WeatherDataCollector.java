package Chapter2;

public abstract class WeatherDataCollector {
	public abstract void measurmentsChanged();
	public abstract void setTemp();
	public abstract void setHumidity();
	public abstract void setPressure();
	public abstract float getTemp();
	public abstract float getPressure();
	public abstract float getHumidity();

}
