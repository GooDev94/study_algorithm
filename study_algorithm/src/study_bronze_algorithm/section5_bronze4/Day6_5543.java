package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day6_5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int min_burger = Math.min(A, Math.min(B, C)); 
		
		int D = sc.nextInt();
		int E = sc.nextInt();
		int min_drink = Math.min(D, E);
		
		System.out.println(min_burger + min_drink - 50);

	}

}
