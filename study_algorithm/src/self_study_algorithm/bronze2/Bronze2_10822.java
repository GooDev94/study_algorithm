package self_study_algorithm.bronze2;

import java.util.Scanner;

public class Bronze2_10822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] arr = s.split(",");
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);

	}

}
