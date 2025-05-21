package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_11549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<5; i++) {
			if(sc.nextInt() == T) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
