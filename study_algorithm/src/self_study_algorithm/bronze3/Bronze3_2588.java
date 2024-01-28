package self_study_algorithm.bronze3;

import java.util.Scanner;

public class Bronze3_2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//(3)
		int first = a*(b%10);
		System.out.println(first);
		
		//(4)
		int second = a*(b/10 - ((b/100))*10);
		System.out.println(second);
		
		//(5)
		int third = a*(b/100);
		System.out.println(third);
		
		System.out.println(first + second*10 + third*100);
	}

}
