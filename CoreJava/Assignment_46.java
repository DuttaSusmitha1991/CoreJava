package Assigmnets;
interface Amazon{
	void login();
	void logout();
}
public class Assignment_46 implements Amazon {

	public static void main(String[] args) {
		Assignment_46 as = new Assignment_46();
		as.login();
	as.logout();	
	}	
	public void login() {
	System.out.println("I am login");		
	}
	public void logout() {
		System.out.println("I am logout");
			}

}
