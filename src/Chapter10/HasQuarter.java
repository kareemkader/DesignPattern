package Chapter10;
public class HasQuarter implements State{
	GumballMachine gumball;

	public HasQuarter(GumballMachine gb){
		gumball=gb;
	}

	public void insertQuarter(){
		System.out.println("unvalid operation");
	}

	public void ejectQuarter(){
		System.out.println("refund the Quarter");
		gumball.setState(gumball.noQuarter);
	}

	public void turnCrank(){
		System.out.println("you turned !!");
		gumball.setState(gumball.sold);
	}
	public void dispense(){
		System.out.println("unvlaid operation");
	}
}