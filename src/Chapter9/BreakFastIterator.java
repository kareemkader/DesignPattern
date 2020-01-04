package Chapter9;
import java.util.*;
public class BreakFastIterator implements Iterator{

	private List<MenuItem> items;
	private int position=0;

	public BreakFastIterator(List<MenuItem> items){
		this.items=items;
	}

	public boolean hasNext(){
		if(position>=items.size()||items.get(position)==null){
			return false;
		}
		else{
			return true;
		}
	}
	public Object next(){
		MenuItem item=items.get(position);
		position++;
		return item;
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}
}