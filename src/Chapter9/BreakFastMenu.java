package Chapter9;
import java.util.*;
import java.util.Iterator;
public class BreakFastMenu implements Menu{
	private List<MenuItem> items;
	public static final String name="BreakFastMenu";
	public BreakFastMenu(){
		items=new ArrayList<>();
		addItem("panecake","delcious",5,true);
		addItem("pizza","more faty",10,false);
	}

	public Iterator getIterator(){
		return items.iterator();
	}

	public void addItem(String name,String descreption,int cost,boolean vegeterian){
		MenuItem item=new MenuItem(name,descreption,cost,vegeterian);
		items.add(item);
	}
	// more another methods go here


}