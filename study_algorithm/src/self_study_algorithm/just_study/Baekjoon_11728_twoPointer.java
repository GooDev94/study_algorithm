package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Baekjoon_11728_twoPointer {
	/*
	 * BOJ_11728 배열합치기 (두 포인터 - two pointer)
	 * */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] aArr = new Integer[Integer.parseInt(st.nextToken())];
		Integer[] bArr = new Integer[Integer.parseInt(st.nextToken())];
		
		//1. 합칠 배열 aArr 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<aArr.length; i++) {
			aArr[i] = Integer.valueOf(st.nextToken());
		}
		
		//2. 합칠 배열 bArr 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<bArr.length; i++) {
			bArr[i] = Integer.valueOf(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		int p=0;
		int q=0;
		while(p<aArr.length && q<bArr.length) {
			if(aArr[p] > bArr[q]) {
				sb.append(aArr[p++] + " ");
			}else {
				sb.append(aArr[q++] + " ");
			}
		}
		
		//두 배열의 길이가 같지 않을 경우에는 남은 값 만큼 더 넣어줘야 함
		if(p == aArr.length) {
			for(int i=q; i<bArr.length; i++) {
				sb.append(bArr[i]+ " ");
			}
		}
		
		if(q == bArr.length) {
			for(int i=p; i<aArr.length; i++) {
				sb.append(aArr[i]+ " ");
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
