package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day1_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		//내 소스
//		for(int i=0; i<num; i++) {
//			for(int j=num-1; j>=0; j--) {
//				
//				if(j <= i) {
//					System.out.print("*");	
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		for(int i=num; i>0; i--) {
			for(int j=1; j<=num; j++) {
				if(j >= i) System.out.print("*");	
				else System.out.print(" ");
				
				
			}
			System.out.println();
		}


	}

}
