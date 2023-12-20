package study_bronze_algorithm.section3_bronze5;

import java.util.Scanner;

public class Day19_27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = sc.nextInt();
		/* 내 방식
		String[] A = new String[S.length()];
		for(int i=0; i<S.length(); i++) {
			A[i] = S.substring(i, i+1);
		}
		System.out.println(A[n-1]);
		*/
		
		//알려준 방식
		System.out.println(S.charAt(n-1));
	}

}
