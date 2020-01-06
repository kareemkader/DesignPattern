package Chapter9;
import  java.util.Iterator;
public class MenuItem extends MenuComponent{
	
	private int cost;
	private boolean vegeterian;
	public MenuItem(String name,String descreption,int cost,boolean vegeterian){
		this.name=name;
		this.cost=cost;
		this.vegeterian=vegeterian;
		this.description=descreption;
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public int getPrice(){
		return cost;
	}
	public boolean isVegetarian(){
		return vegeterian;
	}
	public void print(){
		System.out.print("" + getName());
			if (isVegetarian()) {
		System.out.print("(v)");
			}	
		System.out.println(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}
	public Iterator createIterator(){
		return new NullIterator();
	}
}