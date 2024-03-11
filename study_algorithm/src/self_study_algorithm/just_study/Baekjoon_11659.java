package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11659 {
	/*
	 * BOJ 11659번 : 구간 합 구하기4
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stBr = new StringTokenizer(br.readLine()); 
		
		int n = Integer.parseInt(stBr.nextToken());
		int m = Integer.parseInt(stBr.nextToken());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//배열 a 구하지 말고 -> 그냥 StringTokenizer를 사용하여 바로 합배열을 만들어버리기
		/*int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		*/
		
		//합 배열 구하기
		long[] s = new long[n+1];
		for(int i=1; i<=n; i++) {
			//바로 바로 nextToken으로 들어오는 값을 a[i]으로 생각하여 값을 넣어주면 
			//굳이 배열 a를 구하지 않고도 합 배열을 만들 수 있음
			s[i] = s[i-1] + Integer.parseInt(st.nextToken());
			
			System.out.println(s[i]);
		}
		
		for(int i=0; i<m; i++) {
			StringTokenizer stm = new StringTokenizer(br.readLine());
			int len1 = Integer.parseInt(stm.nextToken());
			int len2 = Integer.parseInt(stm.nextToken());
			
			System.out.println(s[len2] - s[len1-1]);
			
		}
		

	}

}
