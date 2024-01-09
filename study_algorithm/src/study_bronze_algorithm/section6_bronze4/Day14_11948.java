package study_bronze_algorithm.section6_bronze4;

import java.util.Scanner;

public class Day14_11948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int min_a = Integer.MAX_VALUE;	//4과목 중 제일 작은 값을 구하고자 (2147483647)
		int min_b = Integer.MAX_VALUE;	//3과목 중 제일 작은 값을 구하고자 (2147483647)
		for(int i=0; i<4; i++) {
			int tmp = sc.nextInt();
			sum += tmp;
			System.out.println(min_a);
			//2147483647보다 입력된 값이 작을 경으 min_a으로 치환해주면서 가장 작은 값을 골라낸다
			if(tmp < min_a) min_a = tmp;
		}
		
		for(int i=0; i<2; i++) {
			int tmp = sc.nextInt();
			sum += tmp;
			if(tmp < min_b) min_b = tmp;
		}
		
		System.out.println(sum-min_a-min_b);
	}

}
