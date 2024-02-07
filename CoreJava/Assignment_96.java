package Assigmnets;
//WAP to use getter and setter with int, char, boolean, string, float, double 
public class Assignment_96 {
private int age1 = 18;
private char ss = 's';
private boolean na = true;
private String name = "Susmitha";
private float num = 0.989f;
private double num1= 9.99;
public int getAge1() {
	return age1;
}
public void setAge1(int age1) {
	this.age1 = age1;
}
public char getSs() {
	return ss;
}
public void setSs(char ss) {
	this.ss = ss;
}
public boolean getNa() {
	return na;
}
public void setNa(boolean na) {
	this.na = na;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getNum() {
	return num;
}
public void setNum(float num) {
	this.num = num;
}
public double getNum1() {
	return num1;
}
public void setNum1(double num1) {
	this.num1 = num1;
}
public static void main(String[] args) {
	Assignment_96 aa =new  Assignment_96();
	aa.setAge1(21);
	System.out.println(aa.getAge1());
	aa.setSs('R');
	System.out.println(aa.getSs());
	aa.setNa(false);
	System.out.println(aa.getNa());
	aa.setName("Rakesh");
	System.out.println(aa.getName());
	aa.setNum(0.9988f);
	System.out.println(aa.getNum());
	aa.setNum1(9988.23);
	System.out.println(aa.getNum1());
		}
}
