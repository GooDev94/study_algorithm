package self_study_algorithm.bronze4;

import java.util.Scanner;

public class Bronze4_23795 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			int money = sc.nextInt();
			if(money == -1) break;
			sum = sum + money;
		}
		
		System.out.println(sum);

	}

}
