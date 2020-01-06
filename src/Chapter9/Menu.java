package Chapter9;
import java.util.Iterator;
import java.util.*;
public class Menu extends MenuComponent{
	List<MenuComponent> menuComponents=new ArrayList<>();
	

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

	public void add(MenuComponent component){
		menuComponents.add(component);
	}
	public void remove(MenuComponent component){
		menuComponents.remove(component);
	}
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}
	public void print(){
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		Iterator iterator=menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent=(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}