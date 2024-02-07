package Assigmnets;

import abstraction.Class_3;

//WAP for Access Specifier for Class - Create 2 packages package 
//1 having 2 classes one public having main and one default ,
//package 2 having 2 classes one public and one default with both have no main method
class add{
	 void sys() {
		 System.out.println("I am Default method");
	 }
}
public class Assignment_105 {
  static void addition() {
	  System.out.println("I am Public class method");
  }
	public static void main(String[] args) {
		add aa = new add();
		aa.sys();
		Class_3 cc = new Class_3();
		
		
		
	}

}
