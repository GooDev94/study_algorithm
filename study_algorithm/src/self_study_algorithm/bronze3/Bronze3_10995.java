package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_10995 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {			
			for(int j=1; j<=n; j++) {
				if(i%2 == 0) {
					System.out.print(" *");	
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
