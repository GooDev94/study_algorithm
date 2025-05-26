package java_algorithm_class;

import java.util.Scanner;

public class Array_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n+1][6];	//6학년까지
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int answer=0, max=Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			int cnt = 0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		System.out.println(answer);
		
	}

}
