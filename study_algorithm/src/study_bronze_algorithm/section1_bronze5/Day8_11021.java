package study_bronze_algorithm.section1_bronze5;

import java.util.Scanner;

public class Day8_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+i+": "+ (a+b));
		}
	}
}