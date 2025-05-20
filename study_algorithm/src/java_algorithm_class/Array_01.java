package java_algorithm_class;

import java.util.Scanner;

public class Array_01 {

	/* N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
	   (첫 번째 수는 무조건 출력한다)
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i-1] < arr[i]) {
				System.out.print(" "+ arr[i]);
			}
			
		}
	}

}
