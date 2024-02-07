package Assigmnets;

public class Java_Viva {

	public static void main(String[] args) {
		String name ="RADAR";
		String output ="";
		for(int i=name.length()-1;i>=0;i--) {
		    char a =  name.charAt(i);
		    output = output+ a;
		    
		     	}
		System.out.println(output);
	
	if(name.equals(output)) {
		System.out.println("I am palendrom");
	}else {
		System.out.println("I am not palendrom");
	}
	}
}
