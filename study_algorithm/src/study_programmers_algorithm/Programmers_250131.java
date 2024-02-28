package study_programmers_algorithm;

import java.util.Scanner;

public class Programmers_250131 {

	/*
	 *  [PCEE 기출문제] 3번 / 나이계산
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		String age_type = sc.next();
		
		
		if(age_type.equals("Korea")) {
			System.out.println(2030-year+1);
		}else {
			System.out.println(2030-year);
		}

	}

}
