package Assigmnets;

import java.util.Date;

public class Assignment_71 {
	public static void main(String[] args) {
		Date d = new Date();
    String da = d.toString();
    System.out.println(da);
    String week = da.substring(0, 3);
    System.out.println(week);
    String month =da.substring(4, 7);
    System.out.println(month);
	String day = da.substring(8, 10);
	System.out.println(day);
	String year = da.substring(24);
	System.out.println(year);
	}

}
