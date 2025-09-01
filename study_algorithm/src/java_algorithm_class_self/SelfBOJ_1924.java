package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		//달마다의 일수 배열
		int[] daysList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] yoil = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	
		int totDays = 0;
		for(int i=0; i<month-1; i++) {
			totDays += daysList[i];
		}
		
		totDays = totDays + day;
		
		System.out.println(yoil[totDays%7]);
	}

}
