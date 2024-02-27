package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] x_arr = new int[1001];
		int[] y_arr = new int[1001];
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
						
			x_arr[x]++;
			y_arr[y]++;
		}
		
		for(int i=0; i<x_arr.length; i++) {
			if(x_arr[i] == 1) {
				System.out.print(i + " ");
			}
		}

		for(int i=0; i<y_arr.length; i++) {
			if(y_arr[i] == 1) {
				System.out.print(i);
			}
		}
		
	}

}
