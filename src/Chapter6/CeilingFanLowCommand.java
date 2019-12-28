package Chapter6;

public class CeilingFanLowCommand implements Command{

	CeilingFan fan;
	int prevSpeed;

	public CeilingFanLowCommand(CeilingFan fan){
		this.fan=fan;
	}

	public void execute(){
		prevSpeed=fan.getSpeed();
		fan.low();
	}

	public void undo(){
		switch(prevSpeed){
			case 3:
				fan.high();
				break;
			case 2:
				fan.medium();
				break;
			case 1:
				fan.low();
				break;
			default:
				fan.off();	
		}
	}
}