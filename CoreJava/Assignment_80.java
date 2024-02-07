package Assigmnets;
//Take any alphanumeric String and check at 
//which position there is numeric value
public class Assignment_80 {
public static void main(String[] args) {
		String name = "Susmitha88888";
		char[] c1 = name.toCharArray();
		System.out.println(name.indexOf('a'));
		int num = 88888;
		for(int i=0;i<name.length();i++) {
		    boolean bb = Character.isDigit(c1[i]);
		    if (bb==true) {
		    	System.out.println(c1[i]);
			    }
		}
		}
}
