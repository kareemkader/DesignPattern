package Chapter6;

public class RemoteLoader{
	public static void main(String[] args) {
		//creating the Invoker which is here a remote control
		RemoteControl remote=new RemoteControl();

		//creating the Receivers which are here a devices
		GarageDoor door=new GarageDoor();
		Light light=new Light();
		Stereo stereo=new Stereo();
		CeilingFan fan=new CeilingFan();
		//creating commands for devieces we will start with on commands
		Command doorOn=new GarageDoorUpCommand(door);
		Command lightOn=new LightOnCommand(light);
		Command stereoOn=new StereoOnCommand(stereo);

		Command fanHigh=new CeilingFanHighCommand(fan);
		Command fanLow=new CeilingFanLowCommand(fan);
		
		//creating commands for devieces [off commands]
		Command doorOff=new GarageDoorDownCommand(door);
		Command lightOff=new LightOffCommand(light);
		Command stereoOff=new StereoOffCommand(stereo);

		//now let's attches our commands to remote control
		//[Loading Command objects]
		remote.setCommand(0,doorOn,doorOff);
		remote.setCommand(1,lightOn,lightOff);
		remote.setCommand(2,stereoOn,stereoOff);
			//test undo on The Ceiling Fan
		remote.setCommand(3,fanHigh,fanLow);

		//now we set all configuration right let's start to try to play with some button pushes some of them 
		System.out.println(remote);
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);

		System.out.println(remote);

		remote.undoing();

		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);

		//push some putton to test undo on Ceiling Fan Class

		remote.onButtonWasPushed(3);
		remote.offButtonWasPushed(3);
		remote.undoing();
		


	}
}