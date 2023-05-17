package study_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_1940 {
	public static void main(String[] args) {
		//주몽의 명령 (정렬, 두 포인터)
		//우선 정렬을 진행함
		/* MIN + MAX < 9 일 경우, min을 하나씩 큰 수로 옮기면 됨
		 * 숫자가 사용된 경우, min 보다는 +1, max보다는 -1 로 index 변경
		 * 투 포인터 : 두 개의 포인터를 가지고 반복문을 사용하면서 돌리면서 계산을 실행한다
		 * */
		
		//한줄로 많은 숫자를 받을 때 StringTokenizer를 사용하면서 성능이 좀 더 좋기 때문에
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(br.readLine());
			int[] A = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			//데이터 정렬
			Arrays.sort(A);
			int cnt = 0;
			int i=0;	 //A[0] -> Min
			int j = N-1; //A[N-1] -> Max
			while(i<j) {
				//i와 j의 포인터가 겹쳐지는 순간 더이상 탐색할 이유가 없기 때문에 
				if(A[i]+A[j] < M) i++;
				else if (A[i]+A[j] > M) j--;
				else {
					cnt++;
					i++;
					j--;
				}
			}
			System.out.println(cnt);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
