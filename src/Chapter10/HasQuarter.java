package Chapter10;
import java.util.Random;
public class HasQuarter implements State{
	GumballMachine gumball;
	Random rand=new Random(System.currentTimeMillis());

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
		
		int random=rand.nextInt(10);
		if((random==0)&&(gumball.count>1)){
			System.out.println("#############YOUR ARE THE WINNER ################");
			gumball.setState(gumball.winner);
		}else{
				gumball.setState(gumball.sold);
				}
	}
	public void dispense(){
		System.out.println("unvlaid operation");
	}
}