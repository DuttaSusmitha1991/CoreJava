package Assigmnets;

import java.util.jar.Attributes.Name;
//"Find out number of char and number of digits in below string
//Rahul123"
public class Assignment_81 {
	public static void main(String[] args) {
		String name = "Rahul123";
		char[] c1 = name.toCharArray();
		for(int i=0;i<name.length();i++) {
			boolean b1 = Character.isDigit(c1[i]);
			if(b1==true) {
				System.out.println(c1[i]+" is a digit");
			}
			else {
				System.out.println(c1[i]+" is a char");
			}
			
		}
		
	}

}
