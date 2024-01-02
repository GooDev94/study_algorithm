package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day4_2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		/* 내 방식
		for(int i=0; i<N; i++) {
			for(int j=N; j>0; j--) {							
				if(i < j) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		*/
		
		for(int i=N; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
