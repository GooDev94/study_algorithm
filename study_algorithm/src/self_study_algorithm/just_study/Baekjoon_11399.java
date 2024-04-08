package self_study_algorithm.just_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11399 {
	/*
	 * BOJ 11399번 : [삽입정렬] ATM
	 * 
	 * */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];	//자릿수 별로 구분해 저장한 배열
		int[] s = new int[n];	//A의 합 배열
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {			
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		//for문 : n만큼 반복하기
		for(int i=1; i<n; i++) {			
			int insert_point = i;		//삽입할 위치
			int insert_value = a[i];	//삽입할 값
			
			//for문 : i-1 ~ 0까지 뒤에서부터 반복하여 현재 범위에서 삽입 위치 찾기
			for(int j=i-1; j>=0; j--) {
				if(a[j] < a[i]) {
					insert_point = j+1; 
					break;
				}
				if(j==0) {
					insert_point = 0;
				}
			}
			
			for(int j= i; j>insert_point; j--) {
				a[j] = a[j-1];
			}
			
			a[insert_point] = insert_value;
		}
		
		s[0] = a[0];
		for(int i=1; i<n; i++) {
			s[i] = s[i-1] + a[i];
		}

		int sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum+s[i];
		}
		
		System.out.println(sum);
	}

}
