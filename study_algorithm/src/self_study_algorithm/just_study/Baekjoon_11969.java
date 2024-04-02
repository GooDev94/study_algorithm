package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_11969 {
	/*
	 * BOJ_11969 Breed Counting 누적 합
	 * */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer( br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][3];
		int[][] sum = new int [n+1][3];
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine()) -1;
			arr[i][x]++;
			for(int j=0; j<3; j++) {
				sum[i+1][j] = sum[i][j] + arr[i][j];
			}
		}
		
		  for(int i=0; i<q; i++) {
	            st = new StringTokenizer(br.readLine());
	            int s = Integer.parseInt(st.nextToken());
	            int e = Integer.parseInt(st.nextToken());
	            System.out.println((sum[e][0] - sum[s-1][0]) + " " + (sum[e][1] - sum[s-1][1]) + " " + (sum[e][2] - sum[s-1][2]));
	        }

	}

}
