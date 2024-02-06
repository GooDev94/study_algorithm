package self_study_algorithm.bronze3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bronze3_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
 
		int start = Math.min(x-0, y-0);
		int end = Math.min(w-x, h-y);
		
		System.out.println(Math.min(start, end));
	}

}
