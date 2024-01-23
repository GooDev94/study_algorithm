package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_25191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cock = a/2;
		
		if(cock+b > n) System.out.println(n);
		else System.out.println(cock+b);
		

	}

}
