package Chapter5;

public class ChocolateBoiler{
	private static volatile ChocolateBoiler uniqueInstance;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler(){
		empty=true;
		boiled=false;
	}

	public static ChocolateBoiler getInstatnce(){
		if(uniqueInstance==null){
			synchronized(ChocolateBoiler.class){
				if(uniqueInstance==null){
			uniqueInstance=new ChocolateBoiler();
				}
			}
		}
		return uniqueInstance;
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