package Chapter10;
public class Sold implements State{
	GumballMachine gumball;

	public Sold(GumballMachine gb){
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
		gumball.releaseBall();
		if(gumball.count>0){
			gumball.setState(gumball.noQuarter);
		}else{
			System.out.println("Oops,the gums run out sorry !!");
			gumball.setState(gumball.soldOut);
		}
	}
}