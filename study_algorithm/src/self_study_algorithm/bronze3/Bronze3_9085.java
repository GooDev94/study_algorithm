package self_study_algorithm.bronze3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze3_9085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int[] arr = new int[n];
			int sum = 0;
			
			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];				
			}
			
			System.out.println(sum);
		}

	}

}
