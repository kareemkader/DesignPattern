package Chapter10;
public class GumballMonitor{
	GumballMachine machine;

	public GumballMonitor(GumballMachine gm){
		machine=gm;
	}

	public void report(){
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount() + " gumballs");
		System.out.println("Current state: " + machine.getState());
	}
}