package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_14652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[][] arr = new int[n+1][m+1];
		
		int num = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				/* 이런 식으로 배열에 담게 되면 메모리 초과가 발생함
				arr[i][j] = num++;
				
				if(arr[i][j] == k) {
					System.out.println( i + " "+ j );	
				}
				*/
				
				// 배열에 담지 않고 바로 비교로 했더니 진행 됨
				if(num == k) {
					System.out.println( i + " "+ j );	
				}
				num++;
			}
		}
	}

}
