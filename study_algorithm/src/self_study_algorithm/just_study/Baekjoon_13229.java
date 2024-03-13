package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*  [구간 합 공식 사용]
 *  BOJ_13229 Selection Sum
 * 
 * */
public class Baekjoon_13229 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] sArr = new int[n+1];
		
		//합 배열 구하기
		//합 배열의 인덱스는 1부터 n+1까지
		for(int i=1; i<=n; i++) {
			sArr[i] = sArr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			//이 문제에서는 입력이 1이 아닌 0부터 시작하고 있기 때문에 인덱스에 +1 씩함
			System.out.println(sArr[end+1] - sArr[start]);
		}

	}

}
