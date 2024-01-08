package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day13_10768 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int std_month = 2;
		int std_day = 18;
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if(std_month == month && std_day == day) {
			System.out.println("Special");
		}else {
			if(month > std_month) {
				System.out.println("After");
			}else if(month < std_month){
				System.out.println("Before");
			}else {
				if(day < std_day) System.out.println("Before");
				else if(day > std_day) System.out.println("After");
				else System.out.println("Special");				
			}
		}
		

	}

}
