package Chapter4;

public abstract class Pizza{
	String type;
	Dough dough;
    Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	public abstract void prepare(); //this is the Factory Method pattern now !!
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