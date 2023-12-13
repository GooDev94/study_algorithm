package study_bronze_algorithm.section2_bronze5;

import java.util.Scanner;

public class Day13_3003 {

	public static void main(String[] args) {
		int[] chessArr = {1, 1, 2, 2, 2, 8};	//배열 초기화
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<chessArr.length; i++) {
			int a = sc.nextInt();
			System.out.print(chessArr[i] - a + " ");
			
		}
	}

}
