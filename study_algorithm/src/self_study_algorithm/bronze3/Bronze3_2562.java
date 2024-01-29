package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[9];
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		
		int max = numArr[0];
		int num = 0;
		for(int i=0; i<numArr.length; i++) {
			max = Math.max(max, numArr[i]);
			if(max == numArr[i]) num = i;
		}

		System.out.println(max);
		System.out.println(num+1);
	}

}
