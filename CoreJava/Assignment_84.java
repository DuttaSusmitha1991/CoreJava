package Assigmnets;

import java.util.Arrays;

//Check if 2 given strings are anagram of each other or not
public class Assignment_84 {
public static void main(String[] args) {
	String name = "ANIMAL";
	String name1 = "MALINA";
	if(name.length()!=name1.length()) {
		System.out.println("I am not anagram");
	}else {
	char[] a1= name.toCharArray();
	Arrays.sort(a1);
	System.out.println(a1);
	}
}
}
