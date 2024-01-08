package study_bronze_algorithm.section5_bronze4;

import java.util.Scanner;

public class Day8_10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 내 방법
		int num = sc.nextInt();
		int[] arr = new int[5]; 
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for(int j=0; j<arr.length; j++) {
			if(num == arr[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		 */
		
		//영상 방법
		int check = sc.nextInt();
		int cnt = 0; 
		for(int j=0; j<5; j++) {
			if(check == sc.nextInt()) cnt++;
		}
		
		System.out.println(cnt);
	}

}
