package Chapter2;

/**
 * this interface responsible for make observables 
 * @author kareemkaz
 *
 */
public interface Subject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	
}
