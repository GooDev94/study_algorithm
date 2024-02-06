package self_study_algorithm.bronze2;

import java.util.Scanner;

public class Bronze2_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[42];
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			for(int j=0; j<arr.length; j++) {
				if(num%42 !=0 ) {
					if(num%42== j) {
						arr[j]++;
						
					}
					
				}else {
					arr[0]++;
				}
				
			}
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
