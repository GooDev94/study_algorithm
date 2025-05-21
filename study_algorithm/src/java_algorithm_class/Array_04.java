package java_algorithm_class;

import java.util.Scanner;

public class Array_04 {

	/*1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

	  2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		/* 1. My Solution 배열 사용 
		int[] arr = new int[num];
		
		//초기값 세팅
		arr[0] = 1;
		arr[1] = 1;
		System.out.print(arr[0] + " " + arr[1]);
		
		for(int i=2; i<num; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			System.out.print(" " + arr[i]);
		}
		*/
		
		//2. 배열 사용하지 않고 변수 3개 사용하는 방법
		int a=1, b=1, c;
		System.out.print(a + " " + b);
		for(int i=2; i<num; i++) {
			c = a+b;
			System.out.print(" " + c);
			
			a = b;
			b = c;
		}

	}

}
