package self_study_algorithm.bronze2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze2_25305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		

		StringTokenizer stn = new StringTokenizer(sc.nextLine());
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(stn.nextToken());			
		}

		Arrays.sort(arr, Collections.reverseOrder());
	
		System.out.println(arr[k-1]);
	}

}
