package Chapter10;
public class GumballMachine{
	public static final int SOLD_OUT=0;
	public static final int NO_QUARTER=1;
	public static final int HAS_QUARTER=2;
	public static final int SOLD=3;

	int state=SOLD_OUT;
	int count=0;

	public GumballMachine(int count){
		this.count=count;
		if(count>0){
			state=NO_QUARTER;
		}
	}

	public void insertQuarter(){
		if(state==HAS_QUARTER){
			System.out.println("invalid operation!!");
		}
		// ###################################
		else if(state==NO_QUARTER){
			System.out.println("your inserted the quarter");
			state=HAS_QUARTER;
		}
		// ##################################
		else if(state==SOLD){
			System.out.println("invalid operation");
		}
		else if(state==SOLD_OUT){
			System.out.println("the machine is empty ");
		}
	}

	public void eject(){
		if(state==NO_QUARTER){
			System.out.println("invalid operation!!");
		}
		// ##################################
		else if(state==HAS_QUARTER){
			System.out.println("your eject the quarter");
			state=HAS_QUARTER;
		}
		// #################################
		else if(state==SOLD){
			System.out.println("invalid operation");
		}
		else if(state==SOLD_OUT){
			System.out.println("the machine is empty ");
		}
	}

	public void turnCrank(){
		if(state==NO_QUARTER){
			System.out.println("invalid operation!!");
		}
		// ################################
		else if(state==HAS_QUARTER){
			System.out.println("you will get the gumball");
			state=SOLD;
			dispense();
		}
		// ################################
		else if(state==SOLD){
			System.out.println("invalid operation");
		}
		else if(state==SOLD_OUT){
			System.out.println("the machine is empty ");
		}
	}

	public void dispense(){
		if(state==SOLD){
			--count;
			// here is a problem which there is no way to refund if the machine was empty
			// if(count>0){
			// 	System.out.println("ball rolling !!");
			// 	count--;
			// 	if(count>0){
			// 		state=NO_QUARTER;
			// 	}else{
			// 		state=SOLD_OUT;
			// 	}
			// }else{
			// 	eject();
			// }
			if(count==0){
				System.out.println("Oops,run out of gumball");
				state=SOLD_OUT;
			}
			else{
				state=NO_QUARTER;
			}
		}

		else if(state==NO_QUARTER){
			System.out.println("invalid operation");
		}
		else if(state==SOLD_OUT){
			System.out.println("invalid operation");
		}
		else if(state==HAS_QUARTER){
			System.out.println("invalid operation");
		}
	}

	public String toString(){
		String talk="the state of the machine is : ";
		switch (state) {
			case 0:
				return talk+"SOLD_OUT";
			case 1: 
				return talk+"NO_QUARTER";
			case 2:
				return talk+"HAS_QUARTER";
			case 3:
				return talk+"SOLD";
			default:
				return "unstable state ";
		}
		
	}
}