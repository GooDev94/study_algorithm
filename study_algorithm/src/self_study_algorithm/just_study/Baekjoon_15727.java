package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_15727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		
		if(L%5 > 0) System.out.println(L/5+1);
		else System.out.println(L/5);
		

	}

}
