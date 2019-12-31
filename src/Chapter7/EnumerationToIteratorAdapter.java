package Chapter7;
import java.util.*;

public class EnumerationToIteratorAdapter implements Iterator{
	Enumeration enu;
	public EnumerationToIteratorAdapter(Enumeration enu){
		this.enu=enu;
	}

	public boolean hasNext(){
		return enu.hasMoreElements();
	}
	public Object next(){
		return enu.nextElement();
	}

	public void remove(){
		throw new UnsupportedOperationException();
	}
}