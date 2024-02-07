package Assigmnets;
//Upcasting and downcasting Problem 3 as per Diagram during Class
class village{
	void palle() {
		System.out.println("I am in Village");
	}
}
class town11 extends village{
	void Kadapa() {
		System.out.println("I am in Kadapa");
	}
}
public class Assignment_91 extends  town11 {
	void city() {
		System.out.println("I am in City");
	}
public static void main(String[] args) {
	town11 tt= new Assignment_91();
	tt.Kadapa();
	tt.palle();
	Assignment_91 aa= (Assignment_91)tt;
	aa.city();
	aa.Kadapa();
	}

}
