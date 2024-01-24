package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_28431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			arr[num]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 != 0) {
				System.out.println(i);
			}
		}

	}

}
