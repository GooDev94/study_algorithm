package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1026 {
	/*
	 * BOJ_1026 보물 (버블정렬)
	 * sort 를 이용해도 되지만 버블 정렬을 이용함
	 * */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		//1. a 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {			
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		//2. b 배열
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {			
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		//3. 최솟값이 되기 위해서는 a 배열의 가장 작은 값과 b 배열의 가장 큰 값이 곱해져야 함
		//때문에 a 배열은 오름차순으로, b배열은 내림차순으로 정렬하여 곱한다.
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1-i; j++) {
				//a는 오름차순으로 
				if(a[j] > a[j+1]) {
					int tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
				}

				//b는 내림차순으로
				if(b[j] < b[j+1]) {
					int tmp = b[j+1];
					b[j+1] = b[j];
					b[j] = tmp;
				}
			}
		}
		
		int sum = 0;
		for(int i=0; i<n; i++) {			
			sum += a[i]*b[i];
		}
		
		System.out.println(sum);
		
		
	}

}
