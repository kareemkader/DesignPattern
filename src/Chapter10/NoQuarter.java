package Chapter10;
public class NoQuarter implements State {
	GumballMachine gumball;

	public NoQuarter(GumballMachine gb){
		gumball=gb;
	}

	public void insertQuarter(){
		System.out.println("inserting the Quarter");
		gumball.setState(gumball.hasQuarter);
	}

	public void ejectQuarter(){
		System.out.println("unvalid operation");
	}

	public void turnCrank(){
		System.out.println("unvalid operation");
	}
	public void dispense(){
		System.out.println("unvalid operation");
	}

	public String toString(){
		return "NoQuarter";
	}
}