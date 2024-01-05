package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day9_10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int money = (K*N)-M;
		
		System.out.println(money<0 ? 0 : money);

	}

}
