package Chapter5;

public class Singleton{

	private static Singleton uniqSingleton;
	private Singleton(){}
	public static Singleton getInstance(){
		if(uniqSingleton==null){
			uniqSingleton=new Singleton();
		}
		return uniqSingleton;
	}

}