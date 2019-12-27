package Chapter6;

import java.io.*;

public class RemoteControlTest{
	public static void main(String[] args) {
	SimpleRemoteControl control=new SimpleRemoteControl();
	Light light=new Light();
	LightOnCommand lightOn=new LightOnCommand(light);
	LightOffCommand lightOff=new LightOffCommand(light);
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("choose on or off");
	// try{
	// 	String order=reader.readLine();
	// 	switch(order){
	// 	case "on":
	// 	control.setCommand(lightOn);
	// 	control.buttonWasPressed();
	// 	break;

	// 	case "off":
	// 	control.setCommand(lightOff);
	// 	control.buttonWasPressed();
	// 	break;
	// }
	// }
	// catch(Exception e){
	// 	e.printStackTrace();
	// }
	
	control.setCommand(lightOn);
	control.setCommand(lightOff);
	control.buttonWasPressed();
}
}