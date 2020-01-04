package Chapter9;
import java.util.*;
import java.util.Iterator;
public class BreakFastMenu{
	private List<MenuItem> items;
	public BreakFastMenu(){
		items=new ArrayList<>();
		addItem("panecake","delcious",5,true);
		addItem("pizza","more faty",10,false);
	}

	public Iterator getIterator(){
		
		// return new BreakFastIterator(items);
		/*will be replaced by iterator method of ArrayList class to get The Iterator*/
		return items.iterator();
	}

	public void addItem(String name,String descreption,int cost,boolean vegeterian){
		MenuItem item=new MenuItem(name,descreption,cost,vegeterian);
		items.add(item);
	}
	// more another methods go here


}