package study_bronze_algorithm.section5_bronze4;

import java.util.Scanner;

public class Day10_5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min_score = 0;
		int man_score = 0;
		
		for(int i=0; i<8; i++) {
			if(i<4) min_score += sc.nextInt();
			else man_score += sc.nextInt();
		}
		
/*		단, 서로 동점일 때는 민국이의 총점 S를 출력한다. 라는 단서로 인해 넣었으나
		어차피 동점이라서 같은 값이기 때문에 아래의 조건문을 넣어줄 필요 없음
		
		if(min_score == man_score ) System.out.println(min_score);
		else System.out.println(Math.max(man_score, min_score)); 
*/		

		System.out.println(Math.max(man_score, min_score));
	}

}
