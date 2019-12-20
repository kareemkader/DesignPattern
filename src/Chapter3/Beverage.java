package Chapter3;


public abstract class Beverage{

	String description="Unknown Beverage";
	CupSize size=CupSize.SMALL;

	public String getDescription(){
		return description;
	}

	
	public CupSize getSize(){
		return size;
	}


	public void setSize(CupSize size){
		this.size=size;
	}
	public abstract double cost();
	
	}