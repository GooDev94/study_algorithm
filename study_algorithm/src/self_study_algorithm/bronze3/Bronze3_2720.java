package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int c = sc.nextInt();
			
			int q = c/25;
			int d = (c-(25*q))/10;
			int n = (c-(25*q)-(10*d))/5;
			int p = c-(25*q)-(10*d)-(5*n);
			
			System.out.println(q + " " + d + " " + n + " " + p);
			
		}

	}

}
