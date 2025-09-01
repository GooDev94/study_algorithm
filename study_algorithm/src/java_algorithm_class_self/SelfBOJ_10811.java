package java_algorithm_class_self;

import java.util.Scanner;

public class SelfBOJ_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n+1];
		for(int i=0; i<n+1; i++) {
			arr[i] = i;
		}
		
		
		for(int i=0; i<m; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int tmp=0;
			
			for(int j=num1; j<num2; j++) {
				tmp = arr[j];
				arr[j]  = arr[num2];
				arr[num2] = tmp;
				num2--;
			}
			
		}
		
		for(int i=1; i<n+1; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
