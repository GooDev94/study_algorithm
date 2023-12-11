package study_bronze_algorithm.section0_bronze5;

import java.util.Scanner;

public class Day5_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
