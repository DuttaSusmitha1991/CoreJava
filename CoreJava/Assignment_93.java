package Assigmnets;
//Upcasting and downcasting Problem 5 as per Diagram during Class
class Three33{
	void Reptiles() {
		System.out.println("Snakes,Crocodiles,etc,.");
	}
}
class Two22 extends Three33{
	void Carnivorous() {
		System.out.println("Animals which eats only meat");
	}
}
class One11 extends Two22 {
	void Herbivorous() {
		System.out.println("Animals only eat plants");
	}
}
public class Assignment_93 extends One11 {
	void Zoo() {
		System.out.println("Many animals in ZOO");
	}
	public static void main(String[] args) {
		Two22 t2 =	new One11();
		t2.Carnivorous();
		t2.Reptiles();
		One11 oo=	new Assignment_93();
		Assignment_93 aa=(Assignment_93)oo;
		aa.Carnivorous();
		aa.Herbivorous();
		aa.Zoo();
		aa.Reptiles();		
	}
}
