package Assigmnets;
interface  town{
	abstract void village();
}
abstract class City implements town{
	abstract void rural();
	void urban() {
		System.out.println("I am Urban");
	}
}
public class Assignment_51 extends City {
public static void main(String[] args) {
	Assignment_51 aa = new Assignment_51();
         aa.rural();
         aa.urban();
         aa.village();
}
public void village() {
	System.out.println("I am village");
}
void rural() {
	System.out.println("I am rural");

}

}
