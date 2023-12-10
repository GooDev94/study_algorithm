package study_bronze_algorithm.section0_bronze5;

import java.util.Scanner;

public class Day3_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b ) {
			System.out.println("==");
		}else if(a > b ){
			System.out.println(">");
		}else if(a < b ){
			//사실 굳이 조건을 넣지 않고 else 로 해도 무관하긴 함
			System.out.println("<");
		}
	}
}
