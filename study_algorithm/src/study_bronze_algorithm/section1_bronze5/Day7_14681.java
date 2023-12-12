package study_bronze_algorithm.section1_bronze5;

import java.util.Scanner;

public class Day7_14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		/* 내 방식
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if(x < 0&& y > 0) {
			System.out.println(2);
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		}else if(x > 0 && y < 0) {
			System.out.println(4);
		}
		 */
		
		if(x>0) {
			if(y>0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(y>0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
		
	}

}
