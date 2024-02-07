package Assigmnets;

import java.util.Arrays;

public class Assignments_65 {
	public static void main(String[] args) {
		int[] num = new int[4];
		num[0] =90;
		num[1]=89;
		num[2] =65;
		num[3] =76;
		int num1[] = new int[4];
		for(int i=0;i<=3;i++) {
			num1[i] = num[i];//copying the value of num to num1
					}
		System.out.println(Arrays.toString(num1));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
			}
}
