package self_study_algorithm.bronze5;

import java.util.Scanner;

public class Bronze5_5337 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			int n =  sc.nextInt();
			sum += n;
		}		
		System.out.println(sum);

	}

}
