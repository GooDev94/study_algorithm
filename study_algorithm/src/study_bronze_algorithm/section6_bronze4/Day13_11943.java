package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day13_11943 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		System.out.println(Math.min(A+D, B+C));

	}

}
