package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11660 {
	/*
	 * BOJ 11659번 : 구간 합 구하기5
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		//표크기
		int n = Integer.parseInt(st.nextToken());
		//횟수
		int m = Integer.parseInt(st.nextToken());
		
		//배열 구하기
		int[][] a = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//합배열 구하기
		int[][] s = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				s[i][j] = s[i][j-1] + s[i-1][j] - s[i-1][j-1] + a[i][j];
//				System.out.println(s[x2][y2] - a[x1-1][y1-1]);
			//	System.out.println(s[i][j]);
			}
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = s[x2][y2] - s[x1-1][y2] - s[x2][y1-1] + s[x1-1][y1-1];
			System.out.println(result);
			
		}
		
	}
}
