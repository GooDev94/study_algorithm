package study_bronze_algorithm.section3_bronze5;

import java.util.Scanner;

public class Day20_4101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//while(sc.hasNext()) {
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			/* 내 방식
			if(a == 0 && b == 0) {
				break;
			}
			if(a > b) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			*/
			
			if(a == 0 && b == 0) break;
			else if (a > b) System.out.println("Yes");
			else System.out.println("No");
						
		}

	}

}
