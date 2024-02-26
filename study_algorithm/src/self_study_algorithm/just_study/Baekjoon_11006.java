package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_11006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int leg_n = sc.nextInt();
			int m = sc.nextInt();
			
			int u = (m*2) - leg_n;
			int m2 = m-u;
			
			System.out.println(u + " " + m2);
			
		}

	}

}
