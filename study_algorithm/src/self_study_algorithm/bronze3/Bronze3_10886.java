package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_10886 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<n; i++) {
			if(sc.nextInt() == 1) {
				sum++;
			}
		}

		if(sum > n/2) System.out.println("Junhee is cute!");
		else System.out.println("Junhee is not cute!");	//느낌표가 빠진 오타를 만들어버려서 틀렸다,,
		
		/* 내 방법이 맞았으나 오타로 인해 값이 틀려서 찾아본 방법
			
		int n = sc.nextInt();
		int cute = 0;
		int notCute = 0;
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == 1) {
				cute++;
			}else {
				notCute++;
			}
		}
		
		if(Math.max(cute, notCute) == notCute) {
			System.out.println("Junhee is not cute!");
		} else {
			System.out.println("Junhee is cute!");
		}
		*/
		
		
	}	

}
