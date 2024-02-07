package Assigmnets;
//Check if the String is Palindrome
public class Assignment_83 {
public static void main(String[] args) {
	String name ="MINIM";
	String output ="";
	for(int i=name.length()-1;i>=0;i--) {
		char name1 =name.charAt(i);
		output = output+name1;
			}
	System.out.println(output);
	if(name.equals(output)) {
		System.out.println("I am palendrom");
	}else {
		System.out.println("I am not palendrom");
	}
	}
}
