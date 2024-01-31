package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		int min = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			//홀수를 min에 저장함 => 홀수가 없을 경우에는 min은 계속 0
			if(arr[i]%2 != 0) {
				min = arr[i];
			}
		}
		
		int sum = 0;		
		//min이 0이 아닐 경우 = 홀수
		if(min != 0) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2 == 1) {
					sum += arr[i];
					min = Math.min(min, arr[i]);
				}
			}

			System.out.println(sum);
			System.out.println(min);
			
		}else {
			//짝수만 있을 경우
			System.out.println(-1);
		}
		

	}

}
