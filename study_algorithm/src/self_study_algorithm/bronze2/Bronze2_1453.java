package self_study_algorithm.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze2_1453 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		/* 틀린 이유1
		  	100번째 자리에 대해서 생각하지 못하고 선언을 int[100] 으로 한 덕분에 100번째 자리가 들어가지 않았음
		  	그래서 배열 선언을 new int[101]로 수정함
		 * */
		int[] arr = new int[101];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		for(int i=0; i<n; i++) {			
			int user = Integer.parseInt(st.nextToken());
			for(int j=0; j<arr.length; j++) {
				if(j == user) {					
					arr[j]++;
				}
			}			
		}

		int sum = 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > 1) {
				/*	틀린 이유2
					기존 코드에서는 거절당한 자리가 몇 개인지를 찾는 줄 알고 sum++ 로 진행을 했다.
					그래서 틀렸으나 '질문 게시판'에서 확인해보니 '거절당한 사람' 에 대한 수를 찾는 것이었음
				  	그래서 sum++가 아닌 arr[j] 중 1보다 큰 값들을 고르고 그 중 -1을 하여 겹치지 않았던 사람을 빼준 후 총 합을 구했다.
				 */
				sum = sum+(arr[j]-1);
			}
		}
		
		//int를 출력 했을 때 아스키 코드가 출력 될 수 있기 때문에 int 출력시 \n 등 개행문자를 넣어준다.
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}

}
