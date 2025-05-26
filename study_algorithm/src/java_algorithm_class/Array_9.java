package java_algorithm_class;

import java.util.Scanner;

public class Array_9 {

	/* (도움 - 대각선 구할때)
	 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int answer = Integer.MIN_VALUE;
		int cnt_x, cnt_y;
		
		//가로, 세로합
		for(int i=0; i<n; i++) {
			cnt_x = cnt_y = 0;
			for(int j=0; j<n; j++) {
				cnt_x += arr[i][j]; //가로 합
				cnt_y += arr[j][i]; //세로 합
				
				answer = Math.max(answer, cnt_x);
				answer = Math.max(answer, cnt_y);
				
			}		
		}
		
		 
		//대각선 합
		cnt_x = cnt_y = 0;
		for(int i=0; i<n; i++) {
			//정방향 대각선
			cnt_x += arr[i][i]; 	//if로 i == j할 필요 없음
			
			//역방향 대각선
			cnt_y += arr[i][n-i-1];
			
			answer = Math.max(answer, cnt_x);
			answer = Math.max(answer, cnt_y);
		}	
		
		System.out.println(answer);
		
	}

}
