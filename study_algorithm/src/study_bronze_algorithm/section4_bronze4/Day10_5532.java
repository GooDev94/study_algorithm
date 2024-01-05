package study_bronze_algorithm.section4_bronze4;

import java.util.Scanner;

public class Day10_5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int lang_d = A/C;
		if(A%C > 0) {
			lang_d++; 
		}
		
		int math_d = B/D;
		if(B%D > 0) {
			math_d++; 
		}
		
		System.out.println(L-(Math.max(math_d, lang_d)));
	}

}
