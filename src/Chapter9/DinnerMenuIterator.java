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
		int index=position-1;
		if(items!=null&&index>0&&index<items.length){
			MenuItem[] anotherArray=new MenuItem[items.length-1];
			for (int i=0,k=0;i<items.length ;i++ ) {

				if(i==index)continue;
				anotherArray[k++]=items[i];
			 	
			 } 
			 items=anotherArray;
		}
	}
}