package Assigmnets;

import java.util.Scanner;

//WAP for return keyword for float , double , string , boolen , using scanner class
public class Assignment_107 {
	float add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		float a =sc.nextFloat();
		System.out.println("Enter the value of b ");
		int b= sc.nextInt();
		float sum = a+b;
		return sum;
			}
	double sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a =sc.nextDouble();
		System.out.println("Enter the value of b");
		int b =sc.nextInt();
		double sub= a-b;
		return sub;
		 }
	String word() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of String");
		String name = sc.next();
		return name;
}
	boolean sus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of result");
		boolean result =sc.nextBoolean();
	    return result;
	    	}
	public static void main(String[] args) {
		Assignment_107 aa = new Assignment_107();
		System.out.println(aa.add());
		System.out.println(aa.sub());
		System.out.println(aa.word());
		System.out.println(aa.sus());
			}
}
