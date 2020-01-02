package Chapter8;
public class Duck implements Comparable{
	String name;
	int weight;
	public Duck(String name,int weight){
		this.name=name;
		this.weight=weight;
	}
	public int compareTo(Object o){
		Duck otherDuck=(Duck)o;
		return (otherDuck.weight==this.weight?0:(otherDuck.weight>this.weight?-1:1));
	}
	public String toString(){
		return "the name "+name+"the weight "+weight;

	}
}