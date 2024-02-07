package Assigmnets;
interface Amazon_1{
	abstract void login();
	abstract void logout();
}
public class Assignment_49 implements Amazon_1{
public static void main(String[] args) {
	Assignment_49 as = new Assignment_49();
	as.login();
	as.logout();
	}
	public void login() {
		System.out.println("I am login method");
	}
	public void logout() {
		System.out.println("I am logout method");
	}

}
