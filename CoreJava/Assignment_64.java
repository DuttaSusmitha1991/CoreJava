package Assigmnets;

import java.util.Arrays;
//"Create an array of length 3 having String data type and print
//it without sorting. Now Sort the array and print its value after sorting.
//Use toString function to print the array"
public class Assignment_64 {
	public static void main(String[] args) {
		String[] name = new String[3];
		name[0] ="Rakesh";
		name[1] = "Susmi";
		name[2] ="Manish";
	System.out.println(Arrays.toString(name));
	Arrays.sort(name);
		System.out.println(Arrays.toString(name));
			}
}
