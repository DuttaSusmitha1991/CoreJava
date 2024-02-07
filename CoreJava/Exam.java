package Assigmnets;

public class Exam {
	//private static final String '' = null;

	public static void main(String[] args) {
		/*
		 * int a=40; int b =60; if(!(a<40&&b>60) ){ System.out.println("1"); }
		 */
	String a1 ="GroTechMinds";
	//String a2 = "India is a country";
	String a3 = a1.substring(0, 3);
	String a4 = a1.substring(3, 7);
	String a5 = a1.substring(7, 12);
	//String a6 = a2.substring(11, 18);
    String a7 = a1.concat(a3).concat(a4);
   System.out.println(a7);
   System.out.println(a3);
   System.out.println(a4);
   System.out.println(a5);
   //System.out.println(a6);
   String s ="ASSAM";
   s.indexOf('S');
   System.out.println(s.indexOf('S'));
}
}
