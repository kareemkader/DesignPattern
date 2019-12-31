package Chapter7;
import java.util.*;

public class IteratorToEnumerationAdapter implements Enumeration{
	Iterator iterator;
	public IteratorToEnumerationAdapter(Iterator iterator)
	{
		this.iterator=iterator;
	}
	public boolean hasMoreElements(){
		return iterator.hasNext();
	}
	public Object nextElement(){
		return iterator.next();
	}
	
}