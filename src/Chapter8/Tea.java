package Chapter8;
import java.io.*;
public class Tea extends Beverage{
	

	

	public void brew(){
		System.out.println("Steeping the Tea");
	}

	public void addCondiments(){
		System.out.println("adding limon ");
	}

	public boolean customerWantsCondiments(){
		String answer=getUserInput();
		return (answer.toLowerCase().startsWith("y")?true:false);
	}
	
	public String getUserInput(){
		String answer=null;
		System.out.println("would you like Limon  with your Tea (y/n) ?");
	BufferedReader readeer=new BufferedReader(new InputStreamReader(System.in));
	try
	{
		answer=readeer.readLine();


	}	
	catch(Exception e){
		e.printStackTrace();
	}
	return (answer==null?"no":answer);	
	}

	

}