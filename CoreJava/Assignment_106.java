package Assigmnets;
//WAP for return keyword for int and double
public class Assignment_106 {
 int add() {
	 int a=10;
	 int b=20;
	 int sum = a+b;
	 return sum;
 }
 double sub() {
	double a =10.3;
	int b =5;
	double sub= a-b;
	return sub;
	
 }
 public static void main(String[] args) {
	 Assignment_106 a = new Assignment_106();
	System.out.println(a.add());
	System.out.println(a.sub());
}
}
