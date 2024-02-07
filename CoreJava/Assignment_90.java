package Assigmnets;
class one{
	void add() {
		System.out.println("I a add method");
	}
}
class two extends one {
	void mult() {
		System.out.println("I am multiplication");
	}
	
}
public class Assignment_90 extends two{
	void sub() {
		System.out.println("I am substraction");
	}
public static void main(String[] args) {
	one oo =new Assignment_90 ();//upcasting
	oo.add();
	Assignment_90 aa= (Assignment_90  )  oo;//downcasting
	aa.add();
	aa.sub();
	aa.mult();	
}
}
