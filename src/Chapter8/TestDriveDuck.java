package Chapter8;
import java.util.*;
public class TestDriveDuck{
	public static void main(String[] args) {
		Duck[] duckFamily={new Duck("kareem",12),new Duck("aya",8),new Duck("shereen",5)};
		System.out.println("before sorting :");
		display(duckFamily);
		System.out.println("after sorting :");
		Arrays.sort(duckFamily);
		display(duckFamily);

	}
	public static void display(Duck[] duck){
		for(Duck d:duck){
			System.out.println(d);
		}

	}
}