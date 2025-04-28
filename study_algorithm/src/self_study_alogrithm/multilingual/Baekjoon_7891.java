package self_study_alogrithm.multilingual;

import java.util.Scanner;

public class Baekjoon_7891 {

	/*
	 * 알고리즘 분류 : 수학, 구현, 사칙연산
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
	
}
