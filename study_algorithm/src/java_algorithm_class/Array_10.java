package java_algorithm_class;

import java.util.Scanner;

public class Array_10 {
	/* 
	 *  각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
		격자의 가장자리는 0으로 초기화 되었다고 가정한다.
		만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		/*
		int[][] arr = new int[n+2][n+2];
		
		
		//2차배열 만들기
		for(int i=0; i<n+2; i++) {
			for(int j=0; j<n+2; j++) {
				//가장자리 테두리는 0으로 초기화
				if(i == 0 || j == 0 || i == n+1 || j == n+1) {			
					arr[i][j] = 0;
				}else {
					arr[i][j] = sc.nextInt();
				}
			}
		}
		
		//봉우리 찾기
		int answer = 0;
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);		
		*/
		
		int[][] arr = new int[n][n];
		
		
		//2차배열 만들기
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//만약 3, 6, 9, 12시 방향만 찾으면 내 방식도 괜찮지만
		//사방을 다 비교해야하는 경우에는 복잡해지기 때문에 dx, dy사용
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		int answer = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(nx >= 0 && nx < n && ny >= 0 && ny<n && arr[nx][ny] >= arr[i][j]) {
//					if(arr[nx][ny] >= arr[i][j] && nx >= 0 && nx < n && ny => 0 && ny<n) {
						flag = false;
						break; 	//어차피 봉우리가 아니기때문에 더 돌 이유가 없음
				 	}
				} 
				if(flag) answer++;
			}
		}

		System.out.println(answer);
	}

}
