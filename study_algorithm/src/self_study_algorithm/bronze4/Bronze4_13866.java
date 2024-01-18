package self_study_algorithm.bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze4_13866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		 System.out.println(Math.abs((arr[0]+arr[3])-(arr[1]+arr[2])));
		
	}

}
