package Assigmnets;
//WAP to use Assert keyword with assert syntax1
public class Assignment_108 {
	public static void main(String[] args) {
		String name = "Susmitha";
		assert name.length()<1;//after enable assert in system by "-ea" this error occurs java.lang.AssertionError
		String ans = name.concat(" Dutta");
		System.out.println(ans);
			}
}
