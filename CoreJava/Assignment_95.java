package Assigmnets;
class Extra{
	private String Username ="abc@grotechmind.com";

	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		this.Username = username;
	}	
}
public class Assignment_95 {
public static void main(String[] args) {
	Extra ee = new Extra();
	ee.setUsername("Susmitha@gmail.com");
	System.out.println(ee.getUsername());

	}

}
