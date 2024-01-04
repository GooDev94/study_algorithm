package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day8_2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		int cooking_t = sc.nextInt();
		
		sec += cooking_t;
		if(sec > 59) {
			min += sec/60;
			sec = sec%60;
		}
		
		if(min > 59) {
			hour += min/60;
			min = min%60;
		}
		
		if(hour > 23) {
			hour = hour%24;
		}
		
		System.out.print(hour + " " + min + " " + sec);
	}

}
