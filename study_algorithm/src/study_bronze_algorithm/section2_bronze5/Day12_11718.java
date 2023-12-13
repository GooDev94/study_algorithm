package study_bronze_algorithm.section2_bronze5;

import java.util.Scanner;

public class Day12_11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			//String text = sc.next();
			//.next(); 는 공백을 기준으로 자르기 때문에 현재 상황에서는 정확하지 않음
			
			//.nextLine(); 한 줄을 통째로 받겠다는 의미
			String text = sc.nextLine();
			System.out.println(text);
		}

	}

}
