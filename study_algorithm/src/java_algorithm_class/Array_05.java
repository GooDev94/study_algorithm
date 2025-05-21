package java_algorithm_class;

import java.util.Scanner;

public class Array_05 {
	
	/*
	 *  소수 (에라토스테네스 체)
	 *  자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

		만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
	 * */

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int answer = 0;
		//for문을 돌려서 나누기를 했을 때 본인과 1
		/* 이중 for문이라서 시간초과 나옴
		for(int i=1; i<=num; i++) {
			int cnt = 1;
			for(int j=1; j<i; j++) {
				if(i%j == 0) cnt++;
			}
			
			
			if(cnt == 2) answer++;
		}
		
		System.out.println(answer);
		*/
		
		//에라토스테네스 체를 사용해야 함
		//int 배열을 n+1로 선언하여 사용
		//방법 : 2의 배수를 제거하고 3으로 넘어가서 3의 배수를 체크하고, 4로 넘어가서 4의 배수 체크
		int[] arr = new int[num+1];
		for(int i=2; i<=num; i++) {
			if(arr[i] == 0) {
				answer++;
				
				//i의 배수들을 체크하기 위함
				//num까지 돌아야하기 때문에 <= 사용
				for(int j=i; j<=num; j=j+i) arr[j]=1;
			}
		}
		
		System.out.println(answer);
	}

}
