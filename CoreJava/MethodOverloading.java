package Assigmnets;

public class MethodOverloading {

	static void sum(int a) {

		int add =a+7;
		System.out.println(add);
	}
	
	void sum(double a) 
	{
       double sum= a+9;
		System.out.println(sum);
	}
	void sum(char a)
	{
		char b ='M';
		System.out.println(b);
	}
	void sum(boolean a) {
		
		System.out.println(a);
	}
	static void sum(String a) {
		//String s="i am overloading the method";
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ML1= new MethodOverloading();
		sum(2);
		ML1.sum(2.5);
		ML1.sum('k');
		ML1.sum(false);
	    sum("overloading");

		
	}

}
