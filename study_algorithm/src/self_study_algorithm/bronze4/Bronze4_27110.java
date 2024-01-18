package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_27110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		A = N >= A ? A : N;
		B = N >= B ? B : N;
		C = N >= C ? C : N;
		
		System.out.println(A+B+C);
	}

}
