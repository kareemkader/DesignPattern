package Chapter11;
import java.rmi.*;
public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go(){
		try{
			MyRemote service=(MyRemote) Naming.lookup("rmi://127.0.0.1/HelloService");

			String text=service.sayHello();
			System.out.println(text);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}