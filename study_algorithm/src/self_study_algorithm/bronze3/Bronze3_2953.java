package self_study_algorithm.bronze3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze3_2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = 0;
		int sum = 0;
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			sum = Math.max(sum, a+b+c+d);
			
			if(sum == a+b+c+d) {
				line = i+1;
			}
		}

		System.out.println(line + " " + sum);
	}

}
