package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day9_2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int P = sc.nextInt();
				
		for(int i=0; i<5; i++) {
			int cnt = sc.nextInt();			
			System.out.print(cnt-(L*P) +" ");
		}

	}

}
