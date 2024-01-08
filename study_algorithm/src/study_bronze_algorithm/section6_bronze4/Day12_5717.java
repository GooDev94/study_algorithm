package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day12_5717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int M = sc.nextInt();
			int F = sc.nextInt();
			
			if(M == 0 && F == 0) break;
			
			System.out.println(M+F);
		}

	}

}
