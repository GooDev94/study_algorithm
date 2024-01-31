package self_study_algorithm.bronze3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze3_2490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int sum = a+b+c+d;
			
			if(sum == 0) System.out.println("D");
			else if(sum == 3) System.out.println("A");
			else if(sum == 2) System.out.println("B");
			else if(sum == 1) System.out.println("C");
			else if(sum == 4) System.out.println("E");
		}

	}

}
