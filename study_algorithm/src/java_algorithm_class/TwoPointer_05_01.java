package java_algorithm_class;

import java.util.Scanner;

public class TwoPointer_05_01 {

	//연속된 자연수의 합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int maxLen = n/2+1;
		int[] arr = new int[maxLen];
		
		for(int i=0; i<maxLen; i++) {
			arr[i] = i+1;
		}
		
		int lt=0, cnt=0, sum=0;
		for(int rt=0; rt<maxLen; rt++) {
			sum += arr[rt];
			if(sum == n) cnt++;
			while(sum >= n) {
				sum -=arr[lt++];
				if(sum == n) cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
