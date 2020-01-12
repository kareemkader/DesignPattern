package Chapter10;
public class Winner implements State {
	GumballMachine gumball;

	public Winner(GumballMachine gm){
		gumball=gm;
	}

	public void insertQuarter(){
		System.out.println("unvalid operation");
	}

	public void ejectQuarter(){
		System.out.println("unvalid operation");
	}

	public void turnCrank(){
		System.out.println("unvalid operation");
	}

	public void dispense(){
		gumball.releaseBall();
		if(gumball.count==0){
			System.out.println("Oops, out of gumballs!");
			gumball.setState(gumball.soldOut);
		}
		else{
			gumball.releaseBall();
			if(gumball.count>0){
				gumball.setState(gumball.noQuarter);
			}else{
				System.out.println("Oops, out of gumballs!");

				gumball.setState(gumball.soldOut);
			}
		}
	}

	public String toString(){
		return "Winner";
	}

}