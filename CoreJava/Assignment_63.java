package Assigmnets;

import java.util.Scanner;
//Create an array of length =5 of int datatype and fetch its value from scanner class.
public class Assignment_63 {
public static void main(String[] args) {
	//System.out.println("Print the value of array");
	int[] num = new int[5];
	for(int i=0;i<5;i++) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Print the value of array"+i);
		System.out.println(num[i]= s1.nextInt());
	}
	}

}
