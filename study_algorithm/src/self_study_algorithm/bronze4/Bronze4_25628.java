package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_25628 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < 2) System.out.println(0);
		else
			if(a/2 >= b) System.out.println(b);
			else System.out.println(a/2);

	}

}
