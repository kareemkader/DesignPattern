package Chapter3;

public abstract class Topic {
	private float price ;
	private String name;
	private boolean state=true;
  

	public void enableState(){
		state=true;
	}

	public boolean getState(){
		return state;
	}

	public void disableState(){
		state=false;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}


	public void setPrice(float price){
		this.price=price;
	}

	public float getPrice(){
		return price;
	
	}


}