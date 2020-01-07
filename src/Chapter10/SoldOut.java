package Chapter10;
public class SoldOut implements State{
	GumballMachine gumball;

	public SoldOut(GumballMachine gb){
		gumball=gb;
	}

	public void insertQuarter(){
		System.out.println("unvalid operation");
	}

	public void ejectQuarter(){
		System.out.println("unvlaid operation");
	}

	public void turnCrank(){
		System.out.println("unvlaid operation");
	}
	public void dispense(){
		System.out.println("unvlaid operation");
	}
}