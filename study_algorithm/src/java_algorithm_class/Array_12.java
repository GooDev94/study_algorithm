package java_algorithm_class;

import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
		//2차원 배열을 활용한 4중for문

		//i의 등수, j의 등수를 k 테스트에서 찾아내는 것
		//k의 테스트에서 (i, j)가 멘토, 멘티가 될 수 있는가
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int answer = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int cnt = 0;
				for(int k=0; k<m; k++) {
					int pi=0, pj=0;
					for(int s=0; s<n; s++) {
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}

}
