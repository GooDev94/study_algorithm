package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day12_15439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 내 방식
		int N = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {				
				if(i != j) sum++;
			}
		}
		
		System.out.println(sum);
		 */
		
		//현재 문제가 N*(N-1)과 같은 개념
		int N = sc.nextInt();
		System.out.println(N*(N-1));
	}

}
