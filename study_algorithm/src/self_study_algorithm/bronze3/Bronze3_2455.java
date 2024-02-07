package self_study_algorithm.bronze3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze3_2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int cnt = 0;
		int max = 0;
		for(int i=0; i<4; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());
			
			cnt = cnt-out+in;
			
			max = Math.max(max, cnt);
			
		}
		
		System.out.println(max);

	}

}
