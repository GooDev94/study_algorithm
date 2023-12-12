package study_bronze_algorithm.section1_bronze5;

import java.util.Scanner;

public class Day9_10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.hasNext() : 다음에 입력한 내용이 있는지의 여부 확인, 있으면 진행, 없으면 진행 안함
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}
