package Chapter3;

public class Beverage{
	private boolean milk,soy,mocha,whip;
	private String description;
	
	public static void main(String[] args) {
		System.out.println("hello");
	}

	public void setDescription(String desc){
		description=desc;
	}


	public String getDescription(){
		return description;
	}

	public void setMilk(){
		milk=true;
	}

	public boolean hasMilk(){
		return milk;

	}
public void setSoy(){
		soy=true;
	}

	public boolean hasSoy(){
		return soy;

	}

	public void setMocha(){
		mocha=true;
	}

	public boolean hasMocha(){
		return mocha;

	}

	public void setWhip(){
		whip=true;
	}

	public boolean hasWhip(){
		return whip;

	}

	public float cost(){
		float result=0;
		if(hasMilk()) result+=0.5;
		if(hasWhip()) result+=0.1;
		if(hasMocha()) result+=0.2;
		if(hasSoy()) result +=0.4;
		 return result;
	}
	}