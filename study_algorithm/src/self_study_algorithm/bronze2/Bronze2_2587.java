package self_study_algorithm.bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze2_2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(sum/5);
		System.out.println(arr[2]);

	}

}
