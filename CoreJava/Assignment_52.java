package Assigmnets;

interface Australia{
	abstract void Sydney();
}
interface Africa{
	abstract void SouftAfrica();
}
	interface India{
	void AndhraPradesh();
	}
interface America{
	void Chicago();
}
public class Assignment_52 implements  India,America, Africa, Australia{

	public static void main(String[] args) {
		Assignment_52 as = new Assignment_52();
		as.Chicago();
		as.AndhraPradesh();
		as.Sydney();
		as.SouftAfrica();
	}

	public void Chicago() {
	System.out.println("I am State in America");
		}
	public void AndhraPradesh() {
		System.out.println("I am One state in India");
	}
	public void Sydney() {
	System.out.println("I am Sydney");
	}
	public void SouftAfrica() {
		System.out.println("I am SouftAfrica");
	}

}
