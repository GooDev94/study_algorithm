package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_25238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if((a*((100-b)*0.01)) >= 100) System.out.println(0);
		else System.out.println(1);

	}

}
