package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_5565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<9; i++) {
			sum += sc.nextInt();
		}
		
		System.out.println(total-sum);
	}

}
