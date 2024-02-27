package study_programmers_algorithm;

import java.util.Scanner;

public class Programmers_250132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int c = sc.nextInt();
		
		int b_square = (c*c) - (a*a);
		
		System.out.println(b_square);
	}

}
