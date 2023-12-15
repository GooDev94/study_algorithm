package study_bronze_algorithm.section2_bronze5;

import java.util.Scanner;

public class Day15_2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			int N = sc.nextInt();
			sum += N*N;
		}
			System.out.println(sum%10);
	}

}
