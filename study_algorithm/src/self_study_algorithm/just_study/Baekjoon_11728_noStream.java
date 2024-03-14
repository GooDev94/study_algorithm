package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_11728_noStream {
	/*
	 * BOJ_11728 배열합치기
	 * */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nLen = Integer.parseInt(st.nextToken());
		int mLen = Integer.parseInt(st.nextToken());
		Integer[] aArr = new Integer[nLen+mLen];
		
		//1. 합칠 배열 aArr 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<nLen; i++) {
			aArr[i] = Integer.parseInt(st.nextToken());
		}
		
		//2. 합칠 배열 bArr 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<mLen; i++) {
			aArr[i+nLen] = Integer.parseInt(st.nextToken());
		}

		
		//4. 오름차순 정렬
		Arrays.sort(aArr);
		
		//5. 출력
		StringBuilder sb = new StringBuilder();
		for(Integer n : aArr) {
			sb.append(n + " ");
		}
		
		System.out.println(sb);
		br.close();
	}

}
