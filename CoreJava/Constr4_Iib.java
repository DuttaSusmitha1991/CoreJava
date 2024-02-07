package Assigmnets;

public class Constr4_Iib {
	Constr4_Iib(int a){
		System.out.println("I am Constructor1");
		
	}
	Constr4_Iib(){
		System.out.println("I am Constructor2");
	}
	Constr4_Iib(String a){
		System.out.println("I am Constructor 3");
	}
	Constr4_Iib(char q){
		System.out.println("I am constructor 4");
	}
	{
		System.out.println("I am IIb");
	}
	public static void main(String[] args) {
		Constr4_Iib ci = new Constr4_Iib();
		Constr4_Iib ci1 = new Constr4_Iib(2);
		Constr4_Iib ci2 = new Constr4_Iib("Susmitha");
		Constr4_Iib ci3 = new Constr4_Iib('a');
		//Constr4_Iib ci4 = new Constr4_Iib(2);
		
		
	}

}
