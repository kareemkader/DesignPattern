package Chapter10;
public class GumballMachine{
	State soldOut,sold,noQuarter,hasQuarter,winner;
	int count;

	State currentState;

	public GumballMachine(int count){
		sold=new Sold(this);
		soldOut=new SoldOut(this);
		noQuarter=new NoQuarter(this);
		hasQuarter=new HasQuarter(this);
		this.count=count;
		if(count>0){
			currentState=noQuarter;
		}
	}

	public void insertQuarter(){
		currentState.insertQuarter();
	}

	public void ejectQuarter(){
		currentState.ejectQuarter();
	}

	public void turnCrank(){
		currentState.turnCrank();
		currentState.dispense();
	}

	public void setState(State state){
		currentState=state;
	}

	public void releaseBall(){
		System.out.println("the ball rolling out now ");
		if(count!=0){
			--count;
		}
	}

	
}