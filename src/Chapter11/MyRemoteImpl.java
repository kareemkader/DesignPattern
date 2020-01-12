package Chapter11;
import java.rmi.server.*;
import java.rmi.*;
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	public MyRemoteImpl ()throws RemoteException{}

	public String sayHello(){
		return "hey ,from the server";
	} 

	public static void main(String[] args) {
		try{
			MyRemote service=new MyRemoteImpl();
			Naming.rebind("HelloService",service);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}