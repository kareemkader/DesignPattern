package Chapter5;

public class ChocolateBoiler{

	private boolean empty;
	private boolean boiled;

	public ChocolateBoiler(){
		empty=true;
		boiled=false;
	}

	public void fill(){
		if(isEmpty()){
			//some code to fill boiler
			empty=false;
			boiled=false;
		}
	}

	public void drain(){
		if(!isEmpty()&&isBoiled()){
			//some code to draining boiler
			empty=true;
			boiled=false;
		}
	}

	public void boil(){
		if(!isEmpty()&&!isBoiled()){
			boiled=true;
		}
	}

	public boolean isEmpty(){
		return empty;
	}

	public boolean isBoiled(){
		return boiled;
	}

}