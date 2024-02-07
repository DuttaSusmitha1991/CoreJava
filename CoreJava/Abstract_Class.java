package Assigmnets;
abstract class RazorpayApi//abstract class
{
	abstract void login(); //abstarct method
	//supressed method
	//method is overridden
}
public class Abstract_Class extends RazorpayApi
{
	public static void main(String[] args) 
	{
		Abstract_Class a1=new Abstract_Class();
		a1.login();
	}
	void login() {
		System.out.println("internal logic");
	}
}
