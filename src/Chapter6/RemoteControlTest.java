package Chapter6;

public class RemoteControlTest{
	public static void main(String[] args) {
	SimpleRemoteControl control=new SimpleRemoteControl();
	Light light=new Light();
	LightOnCommand lightOn=new LightOnCommand(light);
	control.setCommand(lightOn);

	control.buttonWasPressed();
}
}