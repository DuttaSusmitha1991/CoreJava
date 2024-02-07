package Assigmnets;
import java.util.InputMismatchException;
//"WAP to handle below 2 exceptions by using 2 catch blocks
//Scanner s1= new Scanner
//int c = 1/0;
//int a = s1.nextint();"
import java.util.Scanner;
public class Assignment_61 {
	Assignment_61 (){
		char a ='s';
		System.out.println("I am Char");
	}
public static void main(String[] args) {
	try{
		 new Assignment_61();
		Scanner s1 = new Scanner(System.in);
		 System.out.println("Enter value of a");
	      int a = s1.nextInt();
	     
		System.out.println("Please enter value of c");
      int c= s1.nextInt();
      System.out.println(c/0);
      	}
	catch(ArithmeticException a1){
		System.out.println("I am catch");
	}
	catch(InputMismatchException a2) {
		System.out.println("I am Input mismatch exception");
	}
	finally {
		System.out.println("I am finally out");
	}
}
}