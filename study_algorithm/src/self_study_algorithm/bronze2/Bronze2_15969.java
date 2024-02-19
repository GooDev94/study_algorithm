package self_study_algorithm.bronze2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze2_15969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(sc.next());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println( arr[n-1] - arr[0]);

	}

}
