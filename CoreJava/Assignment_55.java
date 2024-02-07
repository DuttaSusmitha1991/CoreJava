package Assigmnets;
interface Body{
	abstract void SUV();
}
interface Colour extends Body {
	abstract void red();
}
abstract class car implements Colour{
	void breaks() {
		System.out.println("I am part in car");
	}
}
public class Assignment_55 extends car {
public static void main(String[] args) {
	Assignment_55 as = new Assignment_55();
	as.breaks();
	as.red();
	as.SUV();
}
public void red() {
System.out.println("I am red colour");
}
public void SUV() {
	System.out.println("I am SUV");
}
}
