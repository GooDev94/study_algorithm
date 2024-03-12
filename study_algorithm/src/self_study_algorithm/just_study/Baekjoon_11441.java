package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11441 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		//합 배열 : s[i] = s[i-1] + 배열 a[i]
		long[] sArr = new long[n+1];
		for(int i=1; i<=n; i++) {
			sArr[i] = sArr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			//구간 합 공식 : s[끝인덱스] - s[시작인덱스 -1]
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			System.out.println(sArr[end] - sArr[start-1]);
		}

		br.close();
	}

}
