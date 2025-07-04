package java_algorithm_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_06 {
	/*
	 *  N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
		예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
	 	첫 자리부터의 연속된 0은 무시한다.
	 * 
	 * */
	
	public static boolean isPrime(int num) {
		if(num == 1) return false;
		for(int i=2; i<num; i++) {
			//약수가 존재함 
			if(num%i==0) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		/* 1. My Solution 
		for(int i=0; i<n; i++) {
			String br = new StringBuilder(sc.next()).reverse().toString();
			arr[i] = Integer.parseInt(br);
		}
		*/
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> answer = new ArrayList<>();
		//뒤집어진 숫자 구하기
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp>0) {
				int t=tmp%10;
				res=res*10+t;
				tmp=tmp/10;
				
			}
			if(isPrime(res)) answer.add(res);
			
		}
		
	
		for(int x: answer) {
			System.out.print(x + " ");
		}
	}

}
