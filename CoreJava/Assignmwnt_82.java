package Assigmnets;
//Reverse a String and Print it
public class Assignmwnt_82 {
public static void main(String[] args) {
		String name = "Susmitha";
		String output = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			char input =name.charAt(i);
			output = output+input;
		}
		System.out.println(output);
	}

}
