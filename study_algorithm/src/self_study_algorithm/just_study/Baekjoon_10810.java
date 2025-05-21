package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10810 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m =  Integer.parseInt(st.nextToken());	//m번 줄 입력 반복
		
		
		int[] arr = new int[n+1];		//n개의 바구니
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			for(int j=start-1; j<end; j++) {
				arr[j] = num;
			}	
			
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		br.close();
	}

}
