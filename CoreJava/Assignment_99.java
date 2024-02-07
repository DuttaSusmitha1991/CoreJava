package Assigmnets;

import java.util.ArrayList;
import java.util.Collections;
//WAP on ArrayList
public class Assignment_99 {
public static void main(String[] args) {
	ArrayList aa = new ArrayList();
	aa.add("Susmi");
	aa.add("Rakesh");
	aa.add("Manish");
	aa.add("Dhanush");
	//aa.add(90);
	//aa.add(1991);
	//aa.add(false);
	//aa.add('s');
	Collections.sort(aa);
	System.out.println(aa);
	}

}
