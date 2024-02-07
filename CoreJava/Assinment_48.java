package Assigmnets;
abstract class child_1{
	abstract void multiplication();
	abstract void division(); 
}
public class Assinment_48 extends child_1{
	static void add() {
		System.out.println("I am static method");
	}
	void sub() {
		System.out.println("I am non static method");
	}

	public static void main(String[] args) {
		Assinment_48 as = new Assinment_48();
		add();
		as.sub();
		as.division();
		as.multiplication();
	}
	
	void multiplication() {
		System.out.println("I am abstract method 1");
	}
	
	void division() {
		System.out.println("I am abstract method 2");
	}

}