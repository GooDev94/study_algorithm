package self_study_algorithm.just_study;

import java.util.Scanner;

public class Baekjoon_21964 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[] txtArr = sc.next().toCharArray();
		
		for(int i=n-5; i<n; i++) {
			System.out.print(txtArr[i]);
		}
		
	
	}

}
