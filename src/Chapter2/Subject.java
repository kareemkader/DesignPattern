package Chapter2;

public interface Subject {
	public void notifying();
	public void addObserver(Observer ob);
	public void removeObserver(Observer ob);
	public void measurmentsChanged();
	public void setTemp();
	public void setHumidity();
	public void setPressure();
	public float getTemp();
	public float getPressure();
	public float getHumidity();

}
