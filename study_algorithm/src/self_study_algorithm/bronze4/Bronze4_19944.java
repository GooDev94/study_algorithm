package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_19944 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		
		if(M > 2) {
			if(M <= N) System.out.println("OLDBIE!");
			else System.out.println("TLE!");
		}else {
			System.out.println("NEWBIE!");
		}
	}

}
