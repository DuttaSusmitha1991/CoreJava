package Assigmnets;
interface method_2{
	abstract void add();
	abstract void sub();
}
interface method_1 extends method_2 {
	void mul();
	void div();
}
public class Assignment_50 implements method_1 {
public static void main(String[] args) {
	Assignment_50 as = new Assignment_50();
	as.add();
	as.sub();
	as.div();
	as.mul();

	}
	public void add() {
		System.out.println("I am add method");
		
	}
	public void sub() {
	System.out.println("I am substraction method");
	}
	public void mul() {
	System.out.println("I am Multiplication method");
	}
	public void div() {
	System.out.println("I am division method");
	}

}

