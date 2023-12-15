package study_bronze_algorithm.section2_bronze5;

import java.util.Scanner;


public class Day14_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//100보다 작거나 같기 때문에 
		int A[] = new int[201];
		for(int i=0; i<N; i++) {
			int index = sc.nextInt();
			//- (마이너스)가 들어올 수도 있기 때문에 +100
			A[index+100]++;
			System.out.println(index + " :: " + A[index+100]);
		}
		
		int V = sc.nextInt();
		System.out.println(A[V+100]);

	}

}
