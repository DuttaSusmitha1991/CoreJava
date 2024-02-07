package Assigmnets;
interface Bank_2{
	abstract void SavingsAccount();
}
interface Bank_1 extends Bank_2{
	abstract void CreditCard();
	}
interface Bank extends Bank_1{
	abstract void PersonalBanking();
}
public class Assignmetn_56 implements Bank{
public static void main(String[] args) {
	Assignmetn_56 as = new Assignmetn_56();
	as.CreditCard();
	as.PersonalBanking();
	as.SavingsAccount();
	}
public void CreditCard() {
	System.out.println("Credit card");
}
public void SavingsAccount() {
System.out.println("Savings Account");
}
public void PersonalBanking() {
	System.out.println("Personal Banking");
}
}
