package study_bronze_algorithm.section7_bronze4;

import java.util.Scanner;

public class Day19_16486 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		
		System.out.println((d1*2) + (2*d2*3.141592));

		/*
		 * 소수점 계산 시
		 * 서로 다른 형끼리 계산하면 언어가 알아서 캐스팅을 해줌
		 * */
		int a = 1;
		double b = 1.15;
		System.out.println(a+b);
		
		/* 아래처럼 계산을 하면 소수점이 나올 것이라고 생각하지만 int와 int 의 정수형이기 때문에
		 * 정수형으로 답이 나오는게 맞다
		 * 하지만 소수점을 원한다면 double형을 사용하는 게 맞음
		 * float 보다는 double이 오차범위가 적음 (=유효범위가 넓음)
		 * */ 
		
		int c = 2;
		int d = 5;
		System.out.println(d/c);
	}

}
