package study_bronze_algorithm.section3_bronze5;

import java.util.Scanner;

public class Day16_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[31];
		
		for(int i=0; i<28; i++) {
			int index = sc.nextInt();
			A[index]++;
		}
		
		for(int j=1; j<=30; j++) {
			if(A[j] == 0) System.out.println(j);
		}

	}

}
