package Chapter9;
import java.util.*;

public class DinnerMenuIterator implements Iterator{
	private MenuItem[] items;
	private int position=0;
	public DinnerMenuIterator(MenuItem[] items){
		this.items=items;
	}
	public boolean hasNext(){
		if(position>=items.length||items[position]==null){
			return false;
		}
		else{
			return true;
		}
	}
	public Object next(){
		MenuItem item=items[position];
		position++;
		return item;
	}
	public void remove(){
		throw new UnsupportedOperationException();
	}
}