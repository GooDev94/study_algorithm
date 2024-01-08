package study_bronze_algorithm.section5_bronze4;

import java.util.Scanner;

public class Day9_10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/* 내 방식
		if(a+b+c == 180) {
			if(a == b && b == c) {
				System.out.println("Equilateral");
			}else if(a == b || b == c || a == c) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
			
		}else {
			System.out.println("Error");
		}
		 */
		
		if(a==60 && b==60 && c==60) System.out.println("Equilateral");
		else if ((a+b+c == 180)&&(a == b || b == c || a == c)) System.out.println("Isosceles");
		else if ((a+b+c == 180)&&(a != b && b != c && a != c)) System.out.println("Scalene");
		else if (a+b+c != 180)System.out.println("Error");
		
		

	}

}
