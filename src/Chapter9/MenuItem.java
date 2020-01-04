package Chapter9;
public class MenuItem{
	private String name;
	private int cost;
	private String descreption;
	private boolean vegeterian;
	public MenuItem(String name,String descreption,int cost,boolean vegeterian){
		this.name=name;
		this.cost=cost;
		this.vegeterian=vegeterian;
		this.descreption=descreption;
	}
	public String getName(){
		return name;
	}
	public String getDescreption(){
		return descreption;
	}
	public int getCost(){
		return cost;
	}
	public boolean isVegeterian(){
		return vegeterian;
	}
	public String toString(){
		return "name: "+name+" ||descreption: "+descreption+" ||cost: "+cost+" ||vegeterian: "+vegeterian;
	}
}