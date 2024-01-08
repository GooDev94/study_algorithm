package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day10_5554 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int sum = A+B+C+D;
		System.out.println(sum/60);
		System.out.println(sum%60);
		

	}

}
