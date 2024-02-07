package Assigmnets;

//if the age of a person is > 18 then allow him to access www.google.com 
//else throw an ArithmeticException""WAP by using throw keyword
//if the age of a person is > 18 then allow him to access 
//www.google.com else throw an ArithmeticException"
import java.util.Scanner;
public class Assignment_62 {
public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
        int age = s1.nextInt();
        if(age>18) {
        	System.out.println("allow him to acess Google");
        }
        else {
        	throw new ArithmeticException();
        }        
}
}
