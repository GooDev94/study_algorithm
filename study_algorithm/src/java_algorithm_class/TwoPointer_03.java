package java_algorithm_class;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPointer_03 {
	
	/* 투 포인터를 사용하는 문항인 줄 알고 아무생각 없이 p1, p2, p3 로 진행했으나
	 * 슬라이딩 윈도우 문제임 
	 * */

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//영업일
		int k = sc.nextInt(); 	//연속일
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		
		//첫 sum을 만들기 위한 for문
		int answer, sum=0;
		for(int i=0; i<k; i++) sum += arr[i];
		answer = sum;
		
		for(int i=k; i<n; i++) {
			sum += (arr[i]-arr[i-k]);
			answer = Math.max(answer, sum);
		}
		
		System.out.println(answer);
	}
}
