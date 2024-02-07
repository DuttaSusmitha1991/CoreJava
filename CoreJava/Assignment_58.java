package Assigmnets;
class Acess{
	public void add_11() {
		System.out.println("I am addition ");
	}
	private void sub_22() {
		System.out.println("I am subtraction");
	}
	protected void div_22() {
		System.out.println("I am division");
	}
	void mul_3() {
		System.out.println("I am Multiplication");
	}
}
public class Assignment_58 extends Acess {
public static void main(String[] args) {
	Assignment_58 as = new Assignment_58();
	as.add_11();
	as.div_22();
	as.mul_3();
	}
}
