package study_bronze_algorithm.section5_bronze4;

import java.util.Scanner;

public class Day10_5554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 내 방식
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int sum = A+B+C+D;
		System.out.println(sum/60);
		System.out.println(sum%60);
		*/
		
		//한번에 다 더해서 초분을 만들어줌
		int s = 0;
		for(int i=0; i<4; i++) {
			s += sc.nextInt();
		}
		
		System.out.println(s/60);
		System.out.println(s%60);

	}

}
