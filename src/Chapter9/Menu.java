package Chapter9;
import java.util.Iterator;
import java.util.*;
public class Menu extends MenuComponent{
	List<Component> menuComponents=new ArrayList<>();
	

	public Menu(String name,String description){
		this.name=name;
		this.description=description;
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	// the composite functions 

	public void add(Component component){
		menuComponents.add(component);
	}
	public void remove(Component component){
		menuComponents.remove(component);
	}
	public Component getChild(int i){
		return menuComponents.get(i);
	}
	public void print(){
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		Iterator iterator=menuComponents.iterator();
		while(iterator.hasNext()){
			Component menuComponent=(Component)iterator.next();
			menuComponent.print();
		}
	}
}