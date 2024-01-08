package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day10_5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min_score = 0;
		int man_score = 0;
		
		for(int i=0; i<8; i++) {
			if(i<4) {
				min_score += sc.nextInt();
			}else {
				man_score += sc.nextInt();
			}
		}
		
		if(min_score == man_score ) {
			System.out.println(min_score);
		}else {
			System.out.println(Math.max(man_score, min_score));
		}


	}

}
