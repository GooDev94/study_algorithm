package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_28352 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long sec = 1;
		for(int i=1; i<=n; i++) {
			sec *= i; 
		}
		
		long week = 60*60*24*7;
		System.out.println(sec/week);
	}

}
