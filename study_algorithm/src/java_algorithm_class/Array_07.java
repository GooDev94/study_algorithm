package java_algorithm_class;

import java.util.Scanner;

public class Array_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];	//입력 받은 값
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = 0, cnt = 0;
		/* 1. My solultion 앞의 인덱스의 값이 1인지의 여부를 확인하여 기존 배열에 저장
		int result = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i-1] >= 1 && arr[i] == 1) {
				arr[i] = arr[i-1] + 1;
			}
			
			result = result + arr[i];
		}
		*/
		
		//2.  
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				cnt++;
				result += cnt;
			}else cnt = 0;
		}
		System.out.print(result);
	}

}
