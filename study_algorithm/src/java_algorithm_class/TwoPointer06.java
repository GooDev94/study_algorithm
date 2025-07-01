package java_algorithm_class;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPointer06 {

	//최대 길이 연속부분 수열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		//cnt = 0의 개수
		int lt=0, sum=0, cnt=0, answer=0;
		for(int rt=0; rt<n; rt++) {
			/*
			if(arr[rt] == 1) sum += arr[rt];
			else {
				cnt++; 
				if(cnt<=k) sum++;
			}
			
			answer = Math.max(answer, sum);
			
			while(cnt>k) {
				sum -= arr[lt++];
				if(arr[lt] == 0) {
					cnt--; lt++; sum++;
				}
				answer = Math.max(answer, sum);
			}
			*/

			if(arr[rt] == 0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		System.out.println(answer);
	}

}
