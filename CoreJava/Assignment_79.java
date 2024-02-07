package Assigmnets;
//Take any alphanumeric String and find 
//out which are numeric values and characters and print it
public class Assignment_79 {
public static void main(String[] args) {
	String name = "susmitha1991";
	String integer =name.replaceAll("[a-z]","");
	System.out.println(integer);
	String n1 = name.replaceAll("1991", "");
	System.out.println(n1);
			}
}
