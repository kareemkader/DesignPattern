package Chapter4;

public abstract class Pizza{
	String type ;
	public void prepare(){
		System.out.printf("preparing the %s pizza \n",type);

	}

	public void cut(){
		System.out.printf("cutting the %s pizza \n",type);
	}

	public void box(){
		System.out.printf("boxing the %s pizza \n",type);
	}

	public void bake(){
		System.out.printf("baking the %s pizza \n",type);
	}
}