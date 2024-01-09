package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day15_24723 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/* 내 방식
		//https://coding-factory.tistory.com/531
		int N = sc.nextInt();
		System.out.println((int)Math.pow(2, N));
		*/
		
		//현재 층의 모든 경우의 수는 바로 이전 층의 경우의 수 * 2
		//점화식 : N = (N-1) * 2
		int N = sc.nextInt();
		int A[] = {1,2,4,8,16,32};	//점화식을 알고 있으면 해당 값을 알 수 있음 (어차피 N이 5라고 했기 때문)
		System.out.println(A[N]);

	}

}
