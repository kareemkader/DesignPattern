package Chapter9;
import java.util.*;
import java.util.Iterator;

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
		if(position<=0){
			throw new IllegalStateException("you can't remove elemnt until you have done at least one next()");
		}
		if(items[position-1]!=null){
			for(int i=position-1;i<items.length-1;i++){
				items[i]=items[i+1];
			}
			items[items.length-1]=null;
		}
	}
}