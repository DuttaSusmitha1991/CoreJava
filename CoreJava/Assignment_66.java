package Assigmnets;
//
public class Assignment_66 {
public static void main(String[] args) {
		int[] num = new int[4];
		num[0] =90;
		num[1]=89;
		num[2] =65;
		num[3] =76;
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum= sum+num[i];
		}
        System.out.println(sum);
        int average = sum/num.length;
        System.out.println(average);
	}

}
