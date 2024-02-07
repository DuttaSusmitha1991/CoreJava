package Assigmnets;
interface Inbox{
	abstract void mailsInInbox();
}
interface SentMails{
	void mailsSent();
}
abstract class Gmail implements SentMails,Inbox  {
	
}
public class Assignment_54 extends Gmail{
public static void main(String[] args) {
	Assignment_54 as = new Assignment_54();
	as.mailsInInbox();
	as.mailsSent();
}
public void mailsSent() {
System.out.println("I am sent mails");
}
public void mailsInInbox() {
	System.out.println("I am mails in Inbox");
}
}
