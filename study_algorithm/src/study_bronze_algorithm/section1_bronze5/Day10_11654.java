package study_bronze_algorithm.section1_bronze5;

import java.util.Scanner;

public class Day10_11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자형을 아스키코드로
		//	int num = sc.nextInt();
		//	System.out.println((char)num);			
		
		String text = sc.next();
		char textCtr = text.charAt(0);
		//자바에서는 int 로 cast만 해줘도 아스키코드가 나옴
		System.out.println((int)textCtr);
			
	}

}
